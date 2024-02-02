public class DefangingIPAddress {
    static String defangIPaddr(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '.') {
                sb.append("[.]");
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public String defangIPaddr2(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        String s = "255.100.50.0";
        System.out.println(defangIPaddr(s));
    }
}
