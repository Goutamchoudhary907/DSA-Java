import java.util.*;
public class MapInterfaceExample {
    public static void main(String[] args) {
        Map<Integer,String> mp=new HashMap<>();
        mp.put(1, "Riya");
        mp.put(2, "Aman");
        mp.put(3, "Rohan");
        
        System.out.println(mp);
        System.out.println(mp.get(2));
        System.out.println(mp.containsKey(4));

        System.out.println(mp.containsValue("Riya"));

        // mp.put(1, "Ram");       // overwrite 
        mp.putIfAbsent(1, "Ram");       // put only if key is absent 
        System.out.println(mp);


        System.out.println(mp.entrySet());         // print whole map
        System.out.println(mp.keySet());           // print only keys
        System.out.println(mp.values());           // print only values


        // iterate over keys 
      for(Integer i:mp.keySet()) {
        System.out.println(i);
      }

       // iterate over values 
       for(var i:mp.values()) {
        System.out.println(i);
      }

      // iterate over key values mapping 
      for(var e:mp.entrySet()) {
        System.out.println(e);
      }
    }
}
