import java.util.Scanner;

public class FibonacciNumber {
    static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int prev = fib(n - 1);
        int prevPrev = fib(n - 2);

        return prev + prevPrev;
    }
    static int fib2(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = Sc.nextInt();
        Sc.close();
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
