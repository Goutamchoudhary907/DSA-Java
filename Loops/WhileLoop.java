import java.util.Scanner;

public class WhileLoop {
 public static void main(String[] args) {
    
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter Number");
    int n=Sc.nextInt();
     Sc.close();

    int num=1;
    while (num<=n) {
        System.out.println(num);
        num++;

    }
 }   
}
