import java.util.Scanner;

public class FindIndexOfX {
    static int findIndex(int arr[], int n, int x, int idx) {

        if (idx >= n)
            return -1;
        if (arr[idx] == x)
            return idx;
        return findIndex(arr, n, x, idx + 1);
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
        System.out.print("Enter x:");
        int x = Sc.nextInt();
        Sc.close();
        System.out.println(findIndex(arr, n, x, 0));

    }
}