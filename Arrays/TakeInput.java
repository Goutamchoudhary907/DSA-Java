import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        int [] arr =new int [5];
          
     Scanner Sc=new Scanner(System.in);
     System.out.println("Enter size of array");
     int n=Sc.nextInt();
    

    System.out.println("Enter " +n +" elements of array" );
    for(int i=0;i<arr.length;i++) {
        arr[i] =Sc.nextInt();
    }

    Sc.close();
    System.out.println("You Entered elements:");
    for(int i=0;i<arr.length;i++) {
        System.out.println(arr[i]+ " ");
    }
    }
}
