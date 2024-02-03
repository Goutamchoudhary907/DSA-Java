/*
 * Sum of n natural numbers with alternate sign 
 * 1-2+3-4+5-6+7-8+9-10
*/

import java.util.Scanner;

public class SumOfNNaturalNumAlternateSign {
    static int sum(int n) {
        if (n == 0)
            return 0;
        if (n % 2 == 0) { // even
            return sum(n - 1) - n;
        } else { // odd
            return sum(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = Sc.nextInt();
        Sc.close();
        System.out.println(sum(n));
    }
}

// Time Complexity = O(N)
// Space Complexity =O(N)