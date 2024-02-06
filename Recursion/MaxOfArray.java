import java.util.Scanner;

public class MaxOfArray {
    static int max(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int smallAns = max(arr, idx + 1);
        return Math.max(arr[idx], smallAns);
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
        System.out.println(max(arr, 0));
    }
}

// TC= O(n)
// SC= O(n)     where n is length of array