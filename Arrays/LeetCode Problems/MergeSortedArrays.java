import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, i = m + n - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i--] = nums1[p1--];
            } else {
                nums1[i--] = nums2[p2--];
            }
        }
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1; // Pointer for nums1
            int j = n - 1; // Pointer for nums2
            int k = m + n - 1; // Pointer for merged array
    
            while (i >= 0 && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i];
                    i--;
                } else {
                    nums1[k] = nums2[j];
                    j--;
                }
                k--;
            }
    
            // If there are remaining elements in nums2, copy them to nums1
            while (j >= 0) {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
    
    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter size of array 1:");
        int m = Sc.nextInt();
        int nums1[] = new int[m];

        System.out.println("Enter Elements of Array 1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = Sc.nextInt();
        }
        System.out.println("Enter size of array 2:");
        int n = Sc.nextInt();
        int nums2[] = new int[n];

        System.out.println("Enter Elements of Array 2 :");
        for (int i = 0; i < n; i++) {
            nums2[i] = Sc.nextInt();
        }
        Sc.close();
       // nums1 = new int[m + n];
       Arrays.copyOf(nums1, m+n);
       merge(nums1, m, nums2, n);
        printArray(nums1);
    }
}