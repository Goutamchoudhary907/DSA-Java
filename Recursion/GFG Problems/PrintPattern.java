import java.util.ArrayList;
import java.util.List;

public class PrintPattern {                      // 16 11 6 1 -4 6 11 16
    static List<Integer> arr=new ArrayList<>();
    static void f(int curr,int n,int type)
    {
        if(curr <= 0)
            type = 1;
        
        arr.add(curr);
        
        if(curr==n && type==1)
            return;
        
        if(type == 0)
            f(curr-5,n,type);
        else
            f(curr+5,n,type);
    }
    
    public static List<Integer> pattern(int n) {
        f(n ,n , 0);
        return arr;
    }
 
    public static void main(String[] args) {
        int N=16;
      List<Integer> l=pattern(N);
      System.out.println(l);
    }
}
 