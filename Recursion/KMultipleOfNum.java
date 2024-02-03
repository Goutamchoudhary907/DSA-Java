import java.util.Scanner;

public class KMultipleOfNum {
    static void multiples(int n, int k) {
        if (k == 1) {
            System.out.println(n);
            return;
        }
        multiples(n, k-1);
        System.out.println(n*k);
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int n = Sc.nextInt();
        System.out.println("Enter k:");
        int k = Sc.nextInt();
        Sc.close();
        multiples(n, k);
    }
}
