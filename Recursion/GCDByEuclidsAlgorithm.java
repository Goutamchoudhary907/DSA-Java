/*
 * Euclid's Algorithm : 
 * GCD(x,y) = GCD (y, x%y)
 * GCD(x,0) = x
 */

import java.util.Scanner;

public class GCDByEuclidsAlgorithm {
    static int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = Sc.nextInt();
        System.out.println("Enter y:");
        int y = Sc.nextInt();
        Sc.close();
        System.out.println(gcd(x, y));
    }
}