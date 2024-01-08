import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int n = Sc.nextInt();
        Sc.close();

        int Original_n=n;                          // to store original value of n beacuse in loop we chamge the value of 
        int count=0;

        while (n>0) {
            n=n/10;                                // If we divide n by 10 its one digit is reduce
            count++;

        }
        System.out.println("Number Of Digits in " + Original_n + "=" + count);
    }
}
