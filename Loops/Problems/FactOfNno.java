// Program to calculate Factoiral of N numbers

import java.util.Scanner;

public class FactOfNno {
    public static void main(String[] args) {

                Scanner Sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int n = Sc.nextInt();
        Sc.close();

        int fact=1;
        for(int i=1;i<=n;i++) {
            fact=fact*i;
            System.out.println("Factorial of " +i+":" + fact);
        }
    }
}
