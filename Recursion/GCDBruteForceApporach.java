import java.util.Scanner;

public class GCDBruteForceApporach {
    static int gcd(int x, int y) { // TC = O(Min(x,y))
        int min = Math.min(x, y);
        for (int i = min; i >= 2; i--) {
            if (x % i == 0 && y % i == 0) {
                return i;
            }
        }
        return 1;
    }

    static int gcd2(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = Sc.nextInt();
        System.out.println("Enter y:");
        int y = Sc.nextInt();
        Sc.close();
        System.out.println("The GCD of " + x + " and " + y + " is: " + gcd(x, y));

        System.out.println(gcd2(x, y));
    }
}
