import java.util.Scanner;

public class HollowRectnagle {
public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int r=Sc.nextInt();
        System.out.println("Enter Number of columns");
        int c=Sc.nextInt();
        Sc.close();

        for(int i=1;i<=r;i++) {
            for(int j=1;j<=c;j++) {
                if (i==1 || i==r || j==1 || j==c) {
                    System.out.print(j);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
}
    
}