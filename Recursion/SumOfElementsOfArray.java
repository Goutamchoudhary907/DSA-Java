import java.util.Scanner;

public class SumOfElementsOfArray {
    static int sum(int arr[], int idx) {
        if (idx == arr.length) // or if(idx == arr.length-1) return arr[idx] ;
            return 0;

        int ans = sum(arr, idx + 1);
        return ans + arr[idx];
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
        System.out.println("Sum :" + sum(arr, 0));
    }
}

// TC = O(n)
// SC = O(n)