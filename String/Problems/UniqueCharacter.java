public class UniqueCharacter {
    static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (i == s.lastIndexOf(c) && i == s.indexOf(c))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetvtdcode";
        System.out.println(firstUniqChar(s));
    }
}