import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
                 Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int r=Sc.nextInt();
        Sc.close();

        for(int i=1;i<=r;i++) {
            for(int j=1;j<=i;j++) {
           //     System.out.print("*");
          System.out.print(j);           //   same code for numeric triangular pattern
            }
            System.out.println();
        }
    }
}
