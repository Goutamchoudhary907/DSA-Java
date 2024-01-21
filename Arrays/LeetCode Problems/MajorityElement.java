import java.util.Scanner;
import java.util.Arrays;

public class MajorityElement {
    static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    static int majority(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        return arr[n / 2];
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size = Sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Elements of Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Sc.nextInt();
        }
        Sc.close();
        int result = majority(arr);
        System.out.println("Majority element:"+result);
   System.out.println("Array:");
   printArray(arr);
    }
}
