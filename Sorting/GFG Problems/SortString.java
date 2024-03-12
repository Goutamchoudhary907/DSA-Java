public class SortString {
    static String sortString(String s) {
      char ch[]=s.toCharArray();
      for(int i=0;i<ch.length;i++) {
      for(int j=i+1;j<ch.length;j++) {
       if(ch[i] > ch[j]) {
        char temp=ch[i] ;
        ch[i]=ch[j];
        ch[j]=temp;
       }
      }
      }
      return ch.toString();
     }
     static String soort(String inputString) {
        char[] charArray = inputString.toCharArray();

        // Bubble sort (for illustration purposes)
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
     }
     return charArray.toString();
    }
  public static void main(String[] args) {
    String s="edcab";
    // System.out.println(sortString(s));
    System.out.println(soort(s)) ;
  }
}
