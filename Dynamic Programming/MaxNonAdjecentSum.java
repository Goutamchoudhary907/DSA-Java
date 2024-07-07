import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaxNonAdjecentSum {
    
    public static int nonAdjecentSum(List<Integer> arr){
        return nonAdjecentSum(arr,0,new HashMap<>());
    }

    public static int nonAdjecentSum(List<Integer> arr, int i, HashMap<Integer, Integer> mp){
        if(i >=arr.size()){
            return 0;
        }
       if(mp.containsKey(i)){
        return mp.get(i);
       }
       int result= Math.max(arr.get(i)+ nonAdjecentSum(arr, i+2,mp), nonAdjecentSum(arr, i+1,mp));
         
       mp.put(i,result);
       return result;
    }

    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(2);
        li.add(4);
        li.add(5);
        li.add(12);
        li.add(7);  

        System.out.println(nonAdjecentSum(li));
    }
}
