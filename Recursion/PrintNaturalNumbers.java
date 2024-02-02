import java.util.Scanner;

public class PrintNaturalNumbers {

    static void printIncreasing(int n) {
        if (n==1) {
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
       System.out.println("Enter n:");
        int n=Sc.nextInt();
        printIncreasing(n);
        Sc.close();
    }
}