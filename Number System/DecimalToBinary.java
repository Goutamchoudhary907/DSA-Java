import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

         System.out.println("Enter Decimal Number");
        Scanner Sc =new Scanner(System.in);
        int decimal_num=Sc.nextInt();
        Sc.close();

        int ans=0;
        int power=1;         // Powers of 10 

        while (decimal_num >0) {
            
            int parity =decimal_num % 2;
            ans+=(parity *power);
            power *=10;
            decimal_num /= 2;

        }
        System.out.println(ans);
    }
}
