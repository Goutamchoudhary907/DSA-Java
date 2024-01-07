import java.util.Scanner;

public class SumByForLoop {
    public static void main(String[] args) {
            Scanner Sc=new Scanner(System.in);
    System.out.println("Enter Number");
    int n=Sc.nextInt();
     Sc.close();

     int sum=0;
     for(int num=1; num<=n ; num++)
     {
        sum= sum +num;
     }
     System.out.println("Sum of Numbers:" + sum);
    }
}
