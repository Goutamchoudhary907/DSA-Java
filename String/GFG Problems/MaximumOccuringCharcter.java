import java.util.HashMap;

public class MaximumOccuringCharcter {
    public static char getMaxOccuringChar(String line)
    {
       int max=0;
       char result=Character.MIN_VALUE;
       HashMap <Character,Integer> map=new HashMap<>();
       for(int i=0;i<line.length();i++) {
           char ch=line.charAt(i);
           map.put(ch,map.getOrDefault(ch,0)+1);
           if(map.get(ch) >max) {
               result=ch;
               max=map.get(ch);
           }
           if(map.get(ch)==max && ch<result){
               result =ch;
           }
       }
          return result;
    }
    public static void main(String[] args) {
        String s="testsample";
        System.out.println(getMaxOccuringChar(s));
    }
}
