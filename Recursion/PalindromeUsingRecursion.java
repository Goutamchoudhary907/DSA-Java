import java.util.Scanner;
public class PalindromeUsingRecursion {
    static String reverseString(String s, int idx) {
        if (idx == s.length())
            return "";
        String smallAns = reverseString(s, idx + 1);
        return smallAns + s.charAt(idx);
    }
    public static void main(String[] args) {
          Scanner Sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = Sc.nextLine();
        Sc.close();
        String rev=reverseString(s, 0);
        if(rev.equals(s)) {
            System.out.printf("%s is Palindrome" , s);
        } else{
            System.out.printf("%s is not palindrome" ,s);;
        }
    }
}
