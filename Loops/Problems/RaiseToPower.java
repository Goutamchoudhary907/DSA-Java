import java.util.Scanner;

public class RaiseToPower {
    public static void main(String[] args) {
                Scanner Sc= new Scanner(System.in);
        System.out.println("Enter two Numbers");
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        Sc.close();

        int ans=1;
        for(int i=1;i<=b;i++)
        {
            ans*=a;
        }
        System.out.println(ans);
    }
}
