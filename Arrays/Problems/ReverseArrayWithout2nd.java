import java.util.Scanner;
public class ReverseArrayWithout2nd {
    
    static void swapArray(int arr[] , int i, int j) {
        int temp=arr[i];
        arr[i] =arr[j];
        arr[j] =temp;
    }
    static void reverseArray(int arr[]) {
        int i=0 , j=arr.length-1;

        while(i<j) {
            swapArray(arr,i,j);
            i++;
            j--;

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
    reverseArray(arr);
    System.out.println("Reversed array");
    for(int i=0;i<arr.length;i++) {
        System.out.println(arr[i]);
    }
}}