import java.util.Arrays;

public class CBASubsequence {
    static String cbaSubsequence(String S, int N) {
      
    char []c=S.toCharArray();
    Arrays.sort(c);
        return new String(c);
    }

    public static void main(String[] args) {
        String S = "cab";
        System.out.println(cbaSubsequence(S, S.length()));
        // System.out.println(cbaSubsequence(S, S.length()));
    }
}
