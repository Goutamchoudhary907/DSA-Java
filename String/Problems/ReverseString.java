public class ReverseString {
  static void reverseString(char s[]) {

    int i = 0, j = s.length - 1;
    while (i < j) {
      char temp = s[i];
      s[i] = s[j];
      s[j] = temp;
      i++;
      j--;
    }
  }

  public static void main(String[] args) {

    char ch[] = { 'H', 'E', 'L', 'L', 'O' };
    System.out.println(ch);
    reverseString(ch);
    System.out.println(ch);
  }
}
