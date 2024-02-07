/*
 * Check the prefix sum of a part of the array is equal to the suffix sum of rest of the array
 */

import java.util.Scanner;
public class PrefixEqualToSufix {
       
     static int findTotalSum(int arr[]) {
        int totalSum=0;
        for(int i=0;i<arr.length;i++) {
         totalSum += arr[i];
        }
        return totalSum;
     }

     static boolean equalPartition(int arr[]) {
       int totalSum =findTotalSum(arr);
       int prefixSum=0;
       for(int i=0;i<arr.length;i++) {
         prefixSum+= arr[i];
       
       int suffixSum=totalSum-prefixSum;

       if(prefixSum == suffixSum) {
         return true; 
       }
      }
       return false;
     }

    public static void main(String[] args) {
          Scanner Sc =new Scanner(System.in);
    System.out.print("Enter Size of Array:");
    int size = Sc.nextInt();

    int arr [] =new int [size];

    System.out.println("Enter Elements of Array:");
    for(int i=0;i<arr.length;i++) {
       arr[i]= Sc.nextInt();
    }
       Sc.close();
      System.out.println("Partition possible:" + equalPartition(arr)); 
}
}