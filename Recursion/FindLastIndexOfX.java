import java.util.Scanner;

public class FindLastIndexOfX {
    static int lastIndex(int arr[], int n, int x, int idx) {
        int ans = -1;
        if (idx >= n) {
            return ans;
        }
        if (arr[idx] == x) {
            ans = idx;
        }
        return lastIndex(arr, n, x, idx + 1);
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
        System.out.println("Enter x:");
        int x = Sc.nextInt();
        Sc.close();
        System.out.println(lastIndex(arr, n, x, 0));
    }
}
