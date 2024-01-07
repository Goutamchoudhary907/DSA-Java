import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
    
      System.out.println("Enter Age:");
    int age=sc.nextInt();
    sc.close();

    if (age<=12)
     {
        if (age<=5)
        {
            System.out.println("Toddler");
        }
        else
        {
            System.out.println("Child");
        } 
    }
    
    else if (age>12 && age<18)
     {
         System.out.println("Teenager");
    }
    else
    {
        System.out.println("Adult");
    }
    }
}
