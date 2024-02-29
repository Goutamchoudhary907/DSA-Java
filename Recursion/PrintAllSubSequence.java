import java.util.Scanner;

public class PrintAllSubSequence {
    static void printSubsequence(String s, String currAns) {
        if (s.length() == 0) {
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        printSubsequence(remString, currAns + curr); // add curr
        printSubsequence(remString, currAns); // do not add curr
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = Sc.nextLine();
        Sc.close();
        System.out.println("Sub Sequences :");
        printSubsequence(s, "");
    }
}
