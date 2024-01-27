public class ReverseWordsInSentence {
    public static void main(String[] args) {

        String str = "I am an online educator";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            } else {
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }
        sb.reverse();                    // this is because last word is not reverse because there is no space come after it 
        ans +=sb;
        System.out.println(ans);
    }
}
