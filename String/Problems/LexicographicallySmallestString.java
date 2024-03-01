public class LexicographicallySmallestString {
    static String smallestEquivalentString(String s1, String s2, String baseStr) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length();i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
               if(s1.charAt(i) >s2.charAt(i)) {
                sb.append(s2.charAt(i));
               } else if(s2.charAt(i) > s1.charAt(i)) {
                sb.append(s1.charAt(i));
               }
            }
            else if(s1.charAt(i) == s2.charAt(i)) {
                if(s1.charAt(i) == s1.charAt(i+1)  || s2.charAt(i) == s2.charAt(i+1)) {
                    if(s1.charAt(i+1) >s2.charAt(i+1)) {
                        sb.append(s2.charAt(i+1));
                       } else if(s2.charAt(i+1) > s1.charAt(i+1)) {
                        sb.append(s1.charAt(i+1));
                       }
                } else {
                    sb.append(s1.charAt(i));
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s1="parker";
        String s2="morris";
        String baseStr="parser";
      System.out.println(smallestEquivalentString(s1, s2, baseStr));
    }
}
