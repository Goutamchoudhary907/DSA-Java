import java.util.Scanner;

public class NumericRectPattern {
    public static void main(String[] args) {
           Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int r=Sc.nextInt();
        Sc.close();

        for(int i=1;i<=r;i++) {
            for(int j=i;j<=r;j++) {
                System.out.print(j);
            }
            for(int k=1;k<=i-1;k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
