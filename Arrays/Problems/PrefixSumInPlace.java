import java.util.Scanner;

public class PrefixSumInPlace {
     static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] prefixSum(int arr[]) {
      int n=arr.length;

      for(int i=1;i<n ;i++) {
        arr[i] =arr[i-1] +arr[i];             // Here we add sum of previous element and current element in place of current element 
      }                                        // means in arr[3] add sum upto arr[2] and arr[3]  , arr[3] = sum upto arr[2]+arr[3]
      return arr;                             // or arr[3]= arr[0]+arr[1]+arr[2]+arr[3]
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
       System.out.println("Original array:");
       printArray(arr);
     int [] pref= prefixSum(arr);
     System.out.println("Prefix sum:");
      printArray(pref);
 }
}
