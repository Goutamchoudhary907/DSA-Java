import java.util.Scanner;

public class ConditionalOp2 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int value=sc.nextInt();
        sc.close();
        if(value %3 ==0 || value %5 ==0)              // Check divisible by 5 or 3
        {
            System.out.println("Valid Number " + value);
        }
    }
}
