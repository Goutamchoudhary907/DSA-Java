import java.util.Scanner;

public class PrefixSumQueries {

    static void printArray(int arr[] ) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] prefixSum(int arr[]) {
        int n=arr.length;
  
        for(int i=1;i<n ;i++) {
          arr[i] =arr[i-1] +arr[i];              // //  arr[3]= arr[0]+arr[1]+arr[2]+arr[3]
      }
      return arr;  
    }
     public static void main(String[] args) {
          Scanner Sc =new Scanner(System.in);
    System.out.println("Enter Size of Array:");
    int size = Sc.nextInt();

    int arr [] =new int [size+1];

    System.out.println("Enter Elements of Array:");
    for(int i=1;i<=size;i++) {
       arr[i]= Sc.nextInt();
    }
   int [] prefArray=prefixSum(arr);

    System.out.println("Enter number of queries:");
    int q = Sc.nextInt();

       while(q--> 0) {
        System.out.print("Enter range to find sum:");
        int l = Sc.nextInt();
        int r = Sc.nextInt();

            int ans=prefArray[r] - prefArray[l-1];
            System.out.println("Sum " + ans);
     }
     Sc.close();
 }
}


