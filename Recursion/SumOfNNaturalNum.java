import java.util.Scanner;

public class SumOfNNaturalNum {
    static int sum(int n) {
        if(n==0) return 0;
       return sum(n-1) +n ;
    }
    public static void main(String[] args) {
         Scanner Sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = Sc.nextInt();
        Sc.close();
        System.out.println(sum(n));
    }
}
