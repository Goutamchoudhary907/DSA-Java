import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            int count[] = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 97]++;
            }
            for (int i = 0; i < t.length(); i++) {
                count[t.charAt(i) - 97]--;
            }
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++; // increment the count of s[i]
                count[t.charAt(i) - 'a']--; // decrement the count of t[i]
            }
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter two Strings in lower case:");
        String s = Sc.nextLine();
        String t = Sc.nextLine();
        Sc.close();
        System.out.println(isAnagram(s, t));
    }
}
