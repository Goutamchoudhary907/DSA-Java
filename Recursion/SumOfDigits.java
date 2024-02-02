import java.util.Scanner;

public class SumOfDigits {
    static int sumOfDigits(int n) {
        if (n >= 0 && n <= 9)
            return n;
        return sumOfDigits(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = Sc.nextInt();
        Sc.close();
        System.out.println(sumOfDigits(n));
    }
}
