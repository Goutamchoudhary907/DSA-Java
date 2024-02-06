import java.util.Scanner;

public class PrintArrayUsingRecursion {
    
    static void printArray(int arr[] ,int idx) {
        if(idx==arr.length) return;

        System.out.println(arr[idx]);
        printArray(arr, idx+1);
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=Sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<arr.length;i++) {
          arr[i] =Sc.nextInt();
        }
        Sc.close();
        printArray(arr, 0);
    }
}
