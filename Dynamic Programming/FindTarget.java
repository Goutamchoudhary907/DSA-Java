import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class FindTarget {
    public static boolean sumPossible(int target, List<Integer> numbers){
      if(target==0) {
        return true;
      } 
      if(target < 0) {
        return false;
      }

      for(int num: numbers){
        int subTarget=target-num;

        if(sumPossible(subTarget, numbers)){
            return true;
        }
      }
      return false;
    }

    public static boolean sumPossible2(int target, List<Integer> numbers){
     return sumPossible2(target, numbers,new HashMap<>());
    }
   
    public static boolean sumPossible2(int target, List<Integer> numbers, HashMap<Integer,Boolean> mp){
        if(target==0) {
          return true;
        } 
        if(target < 0) {
          return false;
        }
  
        if(mp.containsKey(target)){
            return mp.get(target);
        }
        for(int num: numbers){
          int subTarget=target-num;
  
          if(sumPossible2(subTarget, numbers,mp)){
            mp.put(target,true);
              return true;
          }
        }
        mp.put(target,false);
        return false;
      }
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        int target=4;

        System.out.println(sumPossible(target, l));

        System.out.println(sumPossible2(target, l));
    }
}
