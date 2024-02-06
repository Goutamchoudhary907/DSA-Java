import java.util.Scanner;

public class RemoveOccuranceOfChar {
    static String removeA(String str, int i) {
        if (i >= str.length())
            return "";

        String smallAns = removeA(str, i + 1);
        char currChar = str.charAt(i);
        if (currChar != 'a') {
            return currChar + smallAns;
        } else {
            return smallAns;
        }
    }
    // TC= n * n (because time taken in string concetenation is order of lenght of
    // string )
    // So TC = O(n ^2)

    // Second approach without passing index , done with substring
    static String removeA2(String s) {
        if (s.length() == 0)
            return "";
        String smallAns = removeA2(s.substring(1));
        char currChar = s.charAt(0);
        if (currChar != 'a') {
            return currChar + smallAns;
        } else {
            return smallAns;
        }
    }

    // TC = n * 2n (one n for substring and other for string contetenation)
    // So TC= O(2 n^2 ) = O(n^2)
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = Sc.nextLine();
        Sc.close();
        System.out.println(removeA(s, 0));
        System.out.println(removeA2(s));
    }
}
