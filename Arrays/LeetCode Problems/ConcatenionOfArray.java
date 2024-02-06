import java.util.Scanner;

public class ConcatenionOfArray {
    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = ans[i + nums.length] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size = Sc.nextInt();
        int nums[] = new int[size];
        System.out.println("Enter Elements of Array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Sc.nextInt();
        }
        Sc.close();
        int ans[] =getConcatenation(nums);
        for(int i=0;i<ans.length;i++) {
            System.out.print(ans[i] +" ");
        }
    }
}
