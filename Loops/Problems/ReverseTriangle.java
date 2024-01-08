import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {

        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int r=Sc.nextInt();
        Sc.close();

        for(int i=r;i>=1;i--) {
            for(int j=1;j<=i;j++) {
           // for(int j=1;j<=(r+1-i);j++) {     if we do this upper loop is also reversed
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

 
