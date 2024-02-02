/*
 * Print numbers from n to 1
 */
import java.util.Scanner;

public class PrintNaturalNumbersNto1 {
    static void printDecreasing(int n) {
        if (n==1) {
            System.out.println(1);
            return ;
        }
        System.out.println(n);                  // here self work is done first then recursive work is done vice versa for print 1 to n
        printDecreasing(n-1);
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=Sc.nextInt();
        Sc.close();
        printDecreasing(n);
    }
}
