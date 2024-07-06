import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class MinCoins {
    public static int minChange(int amount, List<Integer> coins){
     if(amount==0){
        return 0;
     }   
     if(amount<0){
        return -1;
     }

     int minCoins=-1;
     for(int coin: coins){
        int subAmount=amount-coin;
        int subCoins=minChange(subAmount, coins);
        if(subCoins !=-1){
            int numCoins=subCoins+1;
            if(numCoins < minCoins || minCoins==-1){
                minCoins =numCoins;
            }
        }
     }
     return minCoins;
    }

    public static int minChange2(int amount, List<Integer> coins){
         return minChange2(amount, coins,new HashMap <>());
    }
    public static int minChange2(int amount, List<Integer> coins,HashMap<Integer,Integer> mp ){
        if(amount==0){
           return 0;
        }   
        if(amount<0){
           return -1;
        }
     if(mp.containsKey(amount)){
      return mp.get(amount);
     }
        int minCoins=-1;
        for(int coin: coins){
           int subAmount=amount-coin;
           int subCoins=minChange2(subAmount, coins,mp);
           if(subCoins !=-1){
               int numCoins=subCoins+1;
               if(numCoins < minCoins || minCoins==-1){
                   minCoins =numCoins;
               }
           }
        }
        mp.put(amount, minCoins); 
        return minCoins;
       }
    public static void main(String[] args) {
         List<Integer> l=new ArrayList<>();
         l.add(1);
         l.add(2);
         l.add(3);

         int amount=5;

         System.out.println(minChange2(amount, l,new HashMap<>()));
    }
}
