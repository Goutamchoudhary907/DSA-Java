import java.util.Scanner;

public class ConditionalOp {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int value=sc.nextInt();
        sc.close();

        if(value % 2==0 && value %3==0)          // Check if the number is odd even and also divisible by 3
        {
            System.out.println("Valid Number "+ value);
        }
    }
}
