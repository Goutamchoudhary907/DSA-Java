import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NoOfWaysToGetAmountByCoins {
    
     public static int countingChnages(int amount,List<Integer> coins){
       return countingChnages(amount,0, coins, new HashMap<>());
     }

     public static int countingChnages(int amount,int coinIdx,List<Integer> coins ,HashMap<List<Integer>, Integer> mp){
        if(amount==0){
            return 1;
        }
        if(coinIdx >= coins.size()){
            return 0;
        }

        List<Integer> key=List.of(amount,coinIdx);
        if(mp.containsKey(key)){
            return mp.get(key);
        }
        int totalWays=0;
        int value=coins.get(coinIdx);
        for(int qty=0 ; qty*value <= amount ; qty++){
            int subAmount=amount- (qty*value);
            totalWays +=countingChnages(subAmount, coinIdx+1, coins,mp);
        }
        mp.put(key,totalWays);
        return totalWays;
     }

     public static void main(String[] args) {
        int amount=4;
        List<Integer> coins=new ArrayList<>();
        coins.add(1);
        coins.add(2);
        coins.add(3);
        System.out.println(countingChnages(amount, coins));
     }
}
