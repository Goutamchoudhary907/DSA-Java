import java.util.Arrays;
import java.util.Scanner;

public class SmallestAndLargestElement
 {
    static int[] smallAndLargeElement(int arr[]){
        Arrays.sort(arr);
        int [] ans ={arr[0] , arr[arr.length-1]};
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
        Sc.close();
       int [] ans=smallAndLargeElement(arr);
        System.out.println("Smallest element :" + ans[0]);
        System.out.println("Largest element :" + ans[1]);
}
}
