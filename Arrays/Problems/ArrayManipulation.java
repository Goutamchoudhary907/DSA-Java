/*
 * Find the unique element in a given array where all the elements are being repeated twice with one value being unique
 *  find the unique element which come only one time
 */

import java.util.Scanner;

public class ArrayManipulation {
     static int uniqueNumber(int arr[]) {
      

        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
             
             if(arr[i] == arr[j]) {                       // if both arr[i] and arr[j] is equal we assign them -1 
                arr[i] =-1;
                arr[j] = -1;
           }
        }
    } 
     int ans=-1;
     for(int i=0;i<arr.length;i++) {
        if(arr[i] > 0) {                           // now check if arr[i] is greater than zero than it is unique element ans it is required ans 
            ans=arr[i]; 
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
        

         System.out.println("Unique element is : "+ uniqueNumber(arr) );
}
}
