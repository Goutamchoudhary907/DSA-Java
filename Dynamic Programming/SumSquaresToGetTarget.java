import java.util.HashMap;

public class SumSquaresToGetTarget {

    public static int summingSquares(int n, HashMap<Integer, Integer> mp){
       if(n==0) {
        return 0;
       }
       if(mp.containsKey(n)){
        return mp.get(n);
       }
       int minSquares=Integer.MAX_VALUE;
       for (int i = 1;i <=Math.sqrt(n);i++) {
            int square=i*i;
            int numSquares= 1+summingSquares(n-square,mp);
            if(numSquares < minSquares){
                minSquares=numSquares;
            }
       }
       int result=minSquares;
       mp.putIfAbsent(n,result);
       return result;
    }
    public static void main(String[] args) {
        int n=12;
        System.out.println(summingSquares(n,new HashMap<>()));
    }
}
