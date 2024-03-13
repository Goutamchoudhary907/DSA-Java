import java.util.Arrays;

public class MinimumDifferencePair {
    public static int minimum_difference(int[] nums)
    {
        int diff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++) {
       diff= Math.min(diff, nums[i+1] -nums[i]);
        }
        return diff;   
    }
    public static void main(String[] args) {
        int nums[]={3,10,8,6};
     System.out.println(minimum_difference(nums));
    }
}
