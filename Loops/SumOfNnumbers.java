import java.util.Scanner;

public class SumOfNnumbers {
  
 public static void main(String[] args) {
    
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter Number");
    int n=Sc.nextInt();
     Sc.close();

    int num=1 , sum=0;
    while (num<=n) {
       sum=sum+num;
        num++;
    }

    System.out.println(sum);
 }   
}

