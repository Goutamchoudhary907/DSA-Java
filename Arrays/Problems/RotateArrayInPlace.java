/*
 * Rotate the given array by k steps where k is non negetive and can also be greater than n (size of array)
  Without using another array  , without using extra space do in-place
 */

import java.util.Scanner;

public class RotateArrayInPlace {
    static void swapArray(int arr[] , int i, int j) {
        int temp=arr[i];
        arr[i] =arr[j];
        arr[j] =temp;
    }
    static void reverseArray(int arr[] ,int i, int j) {
        while(i<j) {
            swapArray(arr,i,j);
            i++;
            j--;

        }
    }
      static void rotateInPLace(int arr[] ,int k) {
          int n=arr.length;
          k=k%n;
          reverseArray(arr,0, n-k-1);
          reverseArray(arr, n-k, n-1);
           reverseArray(arr, 0, n-1);
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
    rotateInPLace(arr,k);
    System.out.println("Reversed array");
    for(int i=0;i<arr.length;i++) {
        System.out.println(arr[i]);
    }
}
}
 