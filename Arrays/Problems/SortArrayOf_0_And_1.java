/*
 *  Sort given array which consist of only 1 and 0, without using Arrays.sort method 
 */

import java.util.Scanner;

public class SortArrayOf_0_And_1 {
    static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    static void sortArray(int arr[]) {
        int count=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==0) {
                count ++;
            }
        }
      for(int i=0;i<arr.length;i++) {
        if (i < count) {
            arr[i] =0;
        }
        else {
            arr[i] =1;
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
       sortArray(arr);
       System.out.println("Sorted array");
       printArray(arr);
       
    }
}
