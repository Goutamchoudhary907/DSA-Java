import java.util.ArrayList;

public class PalindromicPartitions {
    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        dfs(S, 0, new ArrayList<>(), result);
        return result;
    }

    private static void dfs(String s, int start, ArrayList<String> currentList, ArrayList<ArrayList<String>> result) {
        if (start >= s.length()) {
            result.add(new ArrayList<>(currentList));
            return;
        }
        for (int end = start + 1; end <= s.length(); end++) {
            String substring = s.substring(start, end);
            if (isPalindrome(substring)) {
                currentList.add(substring);
                dfs(s, end, currentList, result);
                currentList.remove(currentList.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String S = "geeks";
        System.out.println(allPalindromicPerms(S));
    }
}
