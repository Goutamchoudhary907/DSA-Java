import java.util.Arrays;
import java.util.Scanner;

public class KthElementSmallAndLargest {
    
       static int[] KthsmallAndLargeElement(int arr[], int k){
        Arrays.sort(arr);
        int [] ans ={arr[k-1] , arr[arr.length-k]};
        return ans;
    }
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size = Sc.nextInt();

        int arr [] =new int [size];

        System.out.println("Enter Elements of Array:");
        for(int i=0;i<arr.length;i++) {
           arr[i]= Sc.nextInt();
        }

        System.out.println("Enter K:");
        int k = Sc.nextInt();

        Sc.close();
       int [] ans=KthsmallAndLargeElement(arr ,k);
        System.out.println(k +"th Smallest element :" + ans[0]);
        System.out.println(k +"th Largest element :" + ans[1]);
}
}
