/*
 * find kth largest element in an array without sort array   leetcode 215
 */

import java.util.Scanner;

public class KthLargestUsingQuickSort {
    static int findKthLargest(int[] nums, int k) {
        return quickselect(nums, 0, nums.length - 1, k);
    }

    static int quickselect(int[] nums, int left, int right, int k) {
        int pivot = left;
        for (int i = left; i < right; i++) {
            if (nums[i] <= nums[right]) {
                swap(nums, pivot++, i);
            }
        }
        swap(nums, pivot, right);
        int count = right - pivot + 1;
        if (count == k) {
            return nums[pivot];
        } else if (count > k) {
            return quickselect(nums, pivot + 1, right, k);
        }
        return quickselect(nums, left, pivot - 1, k - count);
    }

    static void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size = Sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements of Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Sc.nextInt();
        }
        System.out.println("Enter k :");
        int k = Sc.nextInt();
        Sc.close();
        System.out.println(findKthLargest(arr, k));
    }
}
