import java.util.Scanner;

public class ReverseStringRecursion {
    static String reverseString(String s, int idx) {
        if (idx == s.length())
            return "";
        String smallAns = reverseString(s, idx + 1);
        return smallAns + s.charAt(idx);
        // TC =O(n ^2)
    }

    static String reverse(String s) {         // without idx
    if(s.length()==0) return "" ;
    String smallAns=reverse(s.substring(1));
    return smallAns +s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = Sc.nextLine();
        Sc.close();
        System.out.println(reverseString(s, 0));
        System.out.println(reverse(s));
    }
}
