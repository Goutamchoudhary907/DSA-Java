/*
 * Find Second smallest element of an array
 */

import java.util.Scanner;

public class SecondSmallest {
    static int findMin(int arr[] ){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] <min) {
             min =arr[i] ;                
            }
        }
     return min;
    }

 static int secondMin(int arr[]) {
    int min=findMin(arr);
    for(int i=0;i<arr.length;i++) {
        if (arr[i] == min) {
            arr[i] =Integer.MAX_VALUE;
        }
    }
    int secondmin=findMin(arr);
    return secondmin;

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
        System.out.println("Second Smallest element : " + secondMin(arr));
}
}