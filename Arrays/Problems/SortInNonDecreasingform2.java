import java.util.Scanner;

public class SortInNonDecreasingform2 {
    
    static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int arr[] , int i ,int j) {
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j] =temp;
       }

    static void reverse(int arr[]) {
        int i=0 , j=arr.length-1;
        while(i<j) {
            swap(arr,i,j);
            i++;
            j--;

        }
    }
    static int [] sortSquares(int arr[]) {
        int n =arr.length;
        int left =0 , right = n-1;
        int ans[] = new int[n];
        int k=0;

        while (left <= right) {
            if(Math.abs(arr[left]) > Math.abs(arr[right])) {
             ans[k++] = arr[left] * arr[left];
             left++;             
            } else {
                ans[k++] =arr[right] * arr[right];
                right--;
            }
        }
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
       System.out.println("Original array:");
       printArray(arr);
       int ans[]= sortSquares(arr);

       System.out.println("Sorted array:");
       reverse(ans);
       printArray(ans);
}
}