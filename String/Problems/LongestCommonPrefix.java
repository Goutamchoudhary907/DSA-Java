import java.util.Arrays;

public class LongestCommonPrefix {
    static String longestCommonPrefix(String s[]) {
        Arrays.sort(s);
        String s1 = s[0];
        String s2 = s[s.length - 1];

        int index = 0;
        while (index < s1.length() - 1) {
            if (s1.charAt(index) == s2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return index == 0 ? "" : s1.substring(0, index);
    }

    static String longestCommonPrefix2(String[] s) {
        String shortest = s[0];
        for (String str : s) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }
        for (int i = 0; i < shortest.length(); i++) {
            for (String str : s) {
                if (str.charAt(i) != shortest.charAt(i)) {
                    return shortest.substring(0, i);
                }
            }
        }
        return shortest;
    }

    public static void main(String[] args) {
        String s[] = { "a" };
        System.out.println(longestCommonPrefix2(s));
    }
}
