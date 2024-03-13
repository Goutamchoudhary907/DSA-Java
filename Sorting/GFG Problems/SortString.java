public class SortString {
     static String soort(String inputString) {
        char[] charArray = inputString.toCharArray();

        // Bubble sort (for illustration purposes)         // or directly use Arrays.sort(charArray)
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
     }
     return new String(charArray);
    }
  public static void main(String[] args) {
    String s="edcab";
    // System.out.println(sortString(s));
    System.out.println(soort(s)) ;
  }
}
