/*
 * Count the number of triplets whose sum is equal to the given value of x
 */

import java.util.Scanner;

public class TripletSum {
     static int tripletsum(int arr[] , int x) {
      
        int count=0;
        
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                for(int k=j+1 ;k<arr.length;k++){
             if(arr[i] + arr[j] + arr[k] == x) {
                count ++; 
           }
        }
        }
    }
        return count;
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

        System.out.println("Enter Target sum:");
        int x = Sc.nextInt();

        Sc.close();
        

        System.out.println("total number of pairs whose sum is " + x +"is " + tripletsum(arr, x) );
}
}
