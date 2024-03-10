public class DecodeString {
    public static String decodeString(String s) {
        String ans="";
        for(int i=1;i<s.length()-2;i++) {
        if(s.charAt(i)=='[' && s.charAt(i+2) ==']') {
           int curr= s.charAt(i+1);
           int no=s.charAt(i-1);
           for(int j=0;j<no;j++) {
             ans += curr;
           }
        }    // wrong ans aaiga abhi
    }
    return ans;
    }
    public static void main(String[] args) {
        String s="3[a]2[bc]";
      System.out.println(decodeString(s));
    }
}
