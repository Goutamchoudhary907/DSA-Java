import java.util.Scanner;

public class KeypadCombination {
    static void combination(String dig, String[] keypad, String res) {
        if (dig.length() == 0) {
            System.out.print(res + " ");
            return;
        }
        int currNum = dig.charAt(0) - '0';         //2 
        String currChoice = keypad[currNum];             // choices for 2 which are abc
        for (int i = 0; i < currChoice.length(); i++) {
            combination(dig.substring(1), keypad, res + currChoice.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String dig = Sc.nextLine();
        Sc.close();
        String[] keypad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        combination(dig, keypad, "");
    }
}
