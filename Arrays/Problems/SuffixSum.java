import java.util.Scanner;

public class SuffixSum {
    
    static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    static int[] suffixSum(int arr[]) {
        int n=arr.length;
        for(int i=n-2;i>=0;i--) {
        arr[i] = arr[i] + arr[i+1] ;
        }
        return arr;
    }

    public static void main(String[] args) {
    
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size=Sc.nextInt();
        int arr[] =new int [size];
 
        System.out.print("Enter elements of array:");
        for(int i=0;i<size;i++) {
            arr[i] =Sc.nextInt();
        }
          Sc.close();
          System.out.print("Original array:");
          printArray(arr);
         int [] suffix=suffixSum(arr);
         printArray(suffix);

        }
}
