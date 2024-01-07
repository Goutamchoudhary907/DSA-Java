import java.util.Scanner;

public class TernaryOp {
    public static void main(String[] args) {
        
          Scanner sc=new Scanner(System.in);
    
      System.out.println("Enter Number:");
    int num=sc.nextInt();
    sc.close();

    String ans;
    ans= (num%2==0) ? "Even" : "Odd";
    System.out.println(ans);
    }
}
