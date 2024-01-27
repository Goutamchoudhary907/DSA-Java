public class PrintAllSubStr {
    public static void main(String[] args) {

        String str = "abcd";

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(str.substring(i, j) + " ");
            }
        }
    }
}
