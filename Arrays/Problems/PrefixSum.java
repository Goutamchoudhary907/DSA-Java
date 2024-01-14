/*
 * Calculate prefix sum of given array with using another array 
 * here we can create new array 
 */

import java.util.Scanner;

public class PrefixSum {
    static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] prefixSum(int arr[]) {
      int n=arr.length;
      int [] pref=new int [n];    
      pref[0]= arr[0];

      for(int i=1;i<n ;i++) {
        pref[i] =pref[i-1] +arr[i];
      }
      return pref;
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
       int []pref =prefixSum(arr);
       printArray(pref);
 }
}
