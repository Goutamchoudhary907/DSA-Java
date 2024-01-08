import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
             Scanner Sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int n = Sc.nextInt();
        Sc.close();

        int ans=0;

        while (n>0)
        {
        ans= ans*10 + n%10;
        n=n/10;    
        }
        System.out.println("Reversed Number:" +ans);
    }
}
