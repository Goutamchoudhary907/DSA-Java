import java.util.Scanner;
public class MergeSortedArrays {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
/*
 * static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for nums1
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Pointer for the end of nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                // Swap the elements
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
            }
            // Move the pointers
            i--;
            j--;
            k--;
        }
 */
    static void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1=m-1 , p2=n-1 ,i=m+n-1;
    while (p2>=0) {
        if (p1>=0 && nums1[p1] > nums2[p2]) {
            nums1[i--] = nums1[p1--];
        } else {
            nums1[i--] =nums2[p2--];
        }
    }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int m=6;
        int nums1[] = new int[m];

        System.out.println("Enter Elements of Array 1:");
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = Sc.nextInt();
        }
        int n=3;
        int nums2[] = new int[n];

        System.out.println("Enter Elements of Array 2 :");
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = Sc.nextInt();
        }
        Sc.close();
        nums1= new int[m+n];
         merge(nums1,m , nums2 ,n);
         printArray(nums1);
    }
}