import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
           Scanner Sc=new Scanner(System.in);
    System.out.println("Enter Number");
    int n=Sc.nextInt();
     Sc.close();

     for(int num=n; num>=1; num-=2)             // Decreament by 2
     {
        System.out.println(num);
     }
    }
}


/*
int num=n;
 * for(; num>=1 ;)
 * {
 * num-=2  
 * } 
 * 
 * we can also write for loop like this   all the three conditions are optional 
 */