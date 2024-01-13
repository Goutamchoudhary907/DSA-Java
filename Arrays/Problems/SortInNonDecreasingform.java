/*
 * Sort the given array in non dreacresing order, return an array of the sequares of each numbers sorted in non decreasing order
 */

import java.util.Scanner;

public class SortInNonDecreasingform {
    static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    
      static void swap(int arr[] , int i ,int j) {
       int temp= arr[i];
       arr[i]=arr[j];
       arr[j] =temp;
      }

      static void power(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n ;i++) {
            arr[i] *=arr[i];
        }

        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n-1;j++) {
              if(arr[i] > arr[j]) {
                swap(arr, i, j);
              }
            }
        }
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
       System.out.println("original Array:");
       printArray(arr);
        power(arr);
       System.out.println("Sorted array");
       printArray(arr);
      }

}
