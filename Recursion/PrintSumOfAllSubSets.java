/*
 * Given an array of integers , print sum of all subsets of it 
 */

import java.util.Scanner;

public class PrintSumOfAllSubSets {
    static void subsetSum(int arr[], int n, int idx, int currsum) {
        if (idx >= n) {
            System.out.println(currsum);
            return;
        }
        subsetSum(arr, n, idx + 1, currsum + arr[idx]); // include (curr idx +currsum)
        subsetSum(arr, n, idx + 1, currsum); // exclude (curr ans)
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = Sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Sc.nextInt();
        }
        Sc.close();
        subsetSum(arr, n, 0, 0);
    }
}
