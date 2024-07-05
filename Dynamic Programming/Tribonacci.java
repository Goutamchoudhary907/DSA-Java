import java.util.HashMap;

public class Tribonacci {
    
    public static int trib(int n){
       return trib(n, new HashMap<>());
    }

    public static int trib(int n , HashMap<Integer,Integer> mp){
       if(n==0 || n==1) {
        return 0;
       } 
       if(n==2){
        return 1;
       }
       if(mp.containsKey(n)){
        return mp.get(n);
       }

       int result= trib(n-1,mp) + trib(n-2, mp) + trib(n-3, mp);
        mp.put(n, result);
        return result;
    }
    public static void main(String[] args) {
         int n=8;

         System.out.println(trib(n));
    }
}
