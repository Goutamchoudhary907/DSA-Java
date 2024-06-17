import java.util.*;
public class ValidAnagram {
    
    public static boolean anagram(String s, String t){
        if(s.length() != t.length()) return false;
     Map<Character, Integer> mp=new HashMap<>();
 
     for(int i=0;i<s.length();i++) {
        char ch=s.charAt(i);
        if(!mp.containsKey(ch)){
         mp.put(ch, 1);
        } else {
            mp.put(ch, mp.get(ch)+1);
        }
     }

     Map<Character, Integer> tp=new HashMap<>();
     for(int i=0;i<t.length();i++) {
        char ch=t.charAt(i);
        if(!tp.containsKey(ch)){
         tp.put(ch, 1);
        } else {
            tp.put(ch, tp.get(ch)+1);
        }
     }
      return mp.equals(tp);
    }

    public static boolean anagram2(String s, String t){
        if(s.length() != t.length()) return false;
        Map<Character, Integer> mp=new HashMap<>();
    
        for(int i=0;i<s.length();i++) {
           char ch=s.charAt(i);
           if(!mp.containsKey(ch)){
            mp.put(ch, 1);
           } else {
               mp.put(ch, mp.get(ch)+1);
           }
        }
        for(int i=0;i<t.length();i++) {
            char ch=t.charAt(i);
            if(!mp.containsKey(ch))  return false;
            int currFreq=mp.get(ch);
            mp.put(ch, currFreq-1);
        }
        for(Integer i:mp.values()){
            if(i !=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="Keen";
        String t="Knee";
        System.out.println(anagram(s, t));

        System.out.println(anagram2(s, t));
    }
}
