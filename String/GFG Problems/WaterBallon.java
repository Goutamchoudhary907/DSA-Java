public class WaterBallon {
    static String sequence(String st) {
        if (st == null || st.length() <= 2) {
            return st;
        }
        StringBuilder modifiedSequence = new StringBuilder();
        int count = 1;
        char prev = st.charAt(0);
        modifiedSequence.append(prev);
        for (int i = 1; i < st.length(); i++) {
            char current = st.charAt(i);
            if (current == prev) {
                count++;
                if (count <= 2) {
                    modifiedSequence.append(current);
                }
            } else {
                count = 1;
                modifiedSequence.append(current);
                prev = current;
            }
        }
        return modifiedSequence.toString();
    }

    public static void main(String[] args) {
        String st = "AAAAAA";
        System.out.println(sequence(st));
    }
}
