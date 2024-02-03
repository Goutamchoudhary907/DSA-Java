import java.util.Scanner;

public class CountOfDigits {
    static int countOfDigits(int n) {
        if(n==0) return 0;
        if (n/10 == 0)
            return 1;
        return countOfDigits(n / 10) +1;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = Sc.nextInt();
        Sc.close();
        System.out.println(countOfDigits(n));
    }
}
