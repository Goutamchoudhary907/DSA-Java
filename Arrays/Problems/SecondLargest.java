/*
 * Find Second largest element of an array
 */

 import java.util.Scanner;
 public class SecondLargest {
 
 static int findMax(int []arr)
 {    int max;
     max= Integer.MIN_VALUE ;
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i] > max) {
             max=arr[i];
         }
     }
     return max;
 
 }
 
 static int findSecondMax(int arr[]) {
     int max= findMax(arr);
 
     for(int i=0;i<arr.length;i++) {
         if(arr[i]==max) {
             arr[i] =Integer.MIN_VALUE;
         }
     }
     int secondMax = findMax(arr);
     return secondMax;
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
         System.out.println("Second largest element : " +findSecondMax(arr));
 }
 }