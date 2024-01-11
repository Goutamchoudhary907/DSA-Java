/*
 * Find the total number of pairs whose sum is euqal to the given value X
 */

import java.util.Scanner;

public class TotalPairs {
    
    static int totalPairs(int arr[] , int x) {
      
        int count=0;
        
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++)
            {
             if(arr[i] + arr[j] == x) {
                count ++; 
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
        

        System.out.println("total number of pairs whose sum is " + x +"is " + totalPairs(arr, x) );
}
}
