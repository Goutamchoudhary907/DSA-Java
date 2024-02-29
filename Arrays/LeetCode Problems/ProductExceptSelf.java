import java.util.Scanner;

public class ProductExceptSelf {
    static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] resultArray = new int[n];
        int product = 1;
        for (int i = 0; i < n; i++) {
            resultArray[i] = product;
            product *= nums[i];
        }
        product = 1;

        for (int i = n - 1; i >= 0; i--) {
            resultArray[i] *= product;
            product *= nums[i];
        }
        return resultArray;
    }

    static int[] productExceptSelf2(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        suffix[suffix.length - 1] = 1;
        for (int i = nums.length-2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }

    static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
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
        Sc.close();
        int[] nums = productExceptSelf(arr);
        printArray(nums);
        int ans[] = productExceptSelf2(arr);
        printArray(ans);
    }
}