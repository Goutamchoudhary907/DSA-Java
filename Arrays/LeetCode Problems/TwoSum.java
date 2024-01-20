import java.util.Scanner;

class TwoSum {
    static int[] twoSum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                  return new int []{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size1 = Sc.nextInt();

        int nums1[] = new int[size1];

        System.out.println("Enter Elements of Array:");
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = Sc.nextInt();
        }
        System.out.println("Enter target:");
        int target = Sc.nextInt();

        Sc.close();
      int ans[]=twoSum(nums1, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
