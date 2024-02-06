import java.util.ArrayList;
import java.util.Scanner;

public class FindALLindicesOfX {
    static void findAllIndices(int arr[], int n, int x, int idx) {
        if (idx >= n)
            return;

        if (arr[idx] == x) {
            System.out.println(idx);
        }
        findAllIndices(arr, n, x, idx + 1);
    }

    // write method to return array list of integers

    static ArrayList<Integer> allIndices(int arr[], int n, int x, int idx) {
        if (idx >= n) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if (arr[idx] == x) {
            ans.add(idx);
        }
        ArrayList<Integer> smallAns = allIndices(arr, n, x, idx + 1);
        ans.addAll(smallAns);
       return ans;
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
     
      //  findAllIndices(arr, n, x, 0);

        System.out.println(allIndices(arr, n, x, 0));
       
        Sc.close();
    }
}