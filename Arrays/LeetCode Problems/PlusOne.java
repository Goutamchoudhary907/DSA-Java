import java.util.Scanner;

public class PlusOne {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
 
    static int[] plusOne(int arr[]) {
    for (int i = arr.length - 1; i >= 0; i--) {
        if (arr[i] < 9) {
            arr[i]++;
            return arr;
        }
        arr[i] = 0;
    }

    
    arr = new int[arr.length + 1];
    arr[0] = 1;
    return arr;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n = Sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements of Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Sc.nextInt();
        }
        Sc.close();
        System.out.println("Original:");
        printArray(arr);
       arr= plusOne(arr);
        System.out.println("Changed:");
        printArray(arr);
    }
}