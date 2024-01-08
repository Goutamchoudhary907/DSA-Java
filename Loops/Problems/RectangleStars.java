import java.util.Scanner;

public class RectangleStars {
    public static void main(String[] args) {
        
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int r=Sc.nextInt();
        System.out.println("Enter Number of columns");
        int c=Sc.nextInt();
        Sc.close();

        for(int i=1;i<=r;i++) {
            for(int j=1;j<=c;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
