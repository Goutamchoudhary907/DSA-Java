import java.util.Scanner;

public class FrogJump {
    static int best(int[] h, int n, int idx) {
        if (idx==n-1) return 0;
       int op1=Math.abs(h[idx] - h[idx+1]) + best(h, n, idx+1) ;
       if(idx ==n-2) return op1;
       int op2=Math.abs(h[idx] - h[idx+2]) + best(h, n, idx+2) ;
       return Math.min(op1, op2);
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = Sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Sc.nextInt();
        }
        Sc.close();
       System.out.println(best(arr, n, 0));
    }
}
