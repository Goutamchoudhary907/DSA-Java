import java.util.Scanner;

public class IsArraySorted {
    static boolean isSorted(int arr[] , int n , int idx) {
        if(idx==n-1) return true;

        if (arr[idx] > arr[idx+1]) {
            return false;
        }
        return isSorted(arr, n, idx+1);
    }
    public static void main(String[] args) {
         Scanner Sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = Sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Sc.nextInt();
        }
        Sc.close();
        System.out.println(isSorted(arr, n, 0));
    }
}
