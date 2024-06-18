import java.util.HashMap;

public class TwoSumInArray {
    
    public static int[] twoSum(int[] nums, int target){
        int n=nums.length;
        int[]ans={-1};

        for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
            if(nums[j]==target-nums[i]){
                ans=new int[] {i,j};
                return ans;
            }
           } 
        }
        return ans;
    }

    public static int[] twoSum2(int[] nums, int target){
        int n=nums.length;
        int[]ans={-1};
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int partner=target-nums[i];
            if(mp.containsKey(partner)){
                ans=new int[] {i, mp.get(partner)};
                return ans;
            }
            mp.put(nums[i], i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]arr={14,7,10,4,5,9,1,2};
        int target=13;
     int []ans=twoSum2(arr, target);
     for(int i=0;i<ans.length;i++){
    System.out.print(ans[i]+" ");
     }
    }
}
