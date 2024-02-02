public class JewelsAndStones {
    static int numJewelsInStones(String j, String s) {
        int count =0;
        for(int i=0;i<j.length();i++) {
            for(int k=0;k<s.length();k++) {
            if (j.charAt(i) == s.charAt(k)) {
                count++;
            }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String j="aA";
        String s="aAAbbbb";
        System.out.println(numJewelsInStones(j, s));
    }
}
