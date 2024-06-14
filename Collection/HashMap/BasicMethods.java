import java.util.HashMap;
import java.util.Map;

public class BasicMethods {
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>();

        // insertion
        mp.put("Aakash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);

        //Getting value of a key 
        System.out.println(mp.get("Yash"));
        System.out.println(mp.get("Rahul"));

        // changing/ updating values
        mp.put("Aakash",25); 

       // remove the pair from hashmap
       mp.remove("Aakash"); 

       // checking if a key exits in the map
       System.out.println(mp.containsKey("Yash"));
       System.out.println(mp.containsKey("Riya"));
       

       // adding a new entry if it doesn't exists
       mp.putIfAbsent("Yashika", 30);
       mp.putIfAbsent("Yash", 30);
       System.out.println(mp);


       // get all keys in the map 
       System.out.println(mp.keySet());

       // get all values 
       System.out.println(mp.values());
       
       // get values with keys 
       System.out.println(mp.entrySet());

       /// traverse 
       for(String key: mp.keySet()) {
        System.out.printf("Age of %s is %d\n" , key, mp.get(key));
 System.out.println(mp.entrySet());
       }
    }
}
