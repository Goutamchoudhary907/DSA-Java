/*
 * Rotate the given array by k steps where is non negetive and can also be greater than n (size of array)
 */

import java.util.Scanner;

public class RotateArray {

static void printArray(int arr[]) {
    for(int i=0;i<arr.length;i++) {
        System.out.println(arr[i]);
}
}

    static int[] rotateArray(int arr[], int k) {
        int n=arr.length;
        k=k%n;
        int [] ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++) {
            ans[j++] =arr[i];
        }
        for(int i=0;i<n-k;i++) {
            ans[j++] =arr[i];

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
    System.out.println("Enter k:");
    int k = Sc.nextInt();

    Sc.close();

     System.out.println("Original array");
     printArray(arr);
     int ans[] =rotateArray(arr, k);
     System.out.println("Array after rotation:");
     printArray(ans);
    }
}
