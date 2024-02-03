import java.util.Scanner;

public class Power {
    static int pow(int p, int q) {           // Time Complexity O(q)  & Space Complexity O(q)
        if (q == 0)
            return 1;
        return pow(p, q - 1) * p;
    }

    static int pow2(int p, int q) {
        if (q == 0)
            return 1;
        int smallPow = pow(p, q / 2);
        if (q % 2 == 0) {
            return smallPow * smallPow;
        }
        return p * smallPow * smallPow;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter p:");
        int p = Sc.nextInt();
        System.out.println("Enter q:");
        int q = Sc.nextInt();
        Sc.close();
        System.out.println(pow(p, q));
        System.out.println(pow2(p, q));
    }
}

