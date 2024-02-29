public class SameCharInTwoStrings {
    static int sameChar(String A, String B) {
        A=A.toLowerCase();
        B=B.toLowerCase();
        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == B.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String A = "choice";
        String B = "chancE";
        System.out.println(sameChar(A, B));
    }
}
