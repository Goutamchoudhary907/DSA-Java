import java.util.ArrayList;
import java.util.List;

public class nthRowOFPascalTraingle {
   static  ArrayList<Long> pascalTriangle(int n) {
       ArrayList<Long> l1=new ArrayList<>();
       l1.add(1L);
       if(n == 0) return l1;
     List<Long> prev=pascalTriangle(n-1);
     for(int i=1;i<prev.size();i++) {
        long curr=(prev.get(i-1) + prev.get(i)) % 1000000007L;
       l1.add(curr);
     }
    l1.add(1L);
    l1=(ArrayList<Long>) prev;
    return l1;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(pascalTriangle(n));
    }
}
