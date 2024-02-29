import java.util.Scanner;

public class PalindromeWithoutReverse {
    static boolean retrunPalindrome(String s ,int l ,int r) {
    if(l>=r) return true;
    return(s.charAt(l)== s.charAt(r) && retrunPalindrome(s, l+1, r-1));
    }
    public static void main(String[] args) {
          Scanner Sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = Sc.nextLine();
        Sc.close();
        System.out.println(retrunPalindrome(s, 0, s.length()-1));
    }
}

// TC = O(n)