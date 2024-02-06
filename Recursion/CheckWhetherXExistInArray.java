import java.util.Scanner;

public class CheckWhetherXExistInArray {

    static boolean checkX(int arr[], int n, int idx, int x) {
        if (idx >= n)  return false;
        if (arr[idx] == x) return true;
        return checkX(arr, n, idx+1, x) ;
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
        if (checkX(arr, n, 0,x)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// TC = O(n)
// SC = O(n)