/*
 * Sum of series : 1-2+3-4+ 5 ...n
 * Odd  numbers are Add ,  even are subtract
 */

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
                Scanner Sc= new Scanner(System.in);
        System.out.println("Enter Number of terms");
        int n = Sc.nextInt();
        Sc.close();
     
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            if (i%2==0) {
                ans-=i;
            }
            else
            {
                ans+=i;

            }
        }
        System.out.println("Answer:" +ans);
    }
}
