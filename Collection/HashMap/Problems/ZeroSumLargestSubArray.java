import java.util.HashMap;

public class ZeroSumLargestSubArray {
    
    public static int largestSubArray(int arr[]){
   
        HashMap<Integer, Integer> mp=new HashMap<>();
        int maxLen=0 , prefSum=0;
         mp.put(0, -1);
         for(int i=0;i<arr.length;i++){
            prefSum+=arr[i];
            if(mp.containsKey(prefSum)){
                maxLen=Math.max(maxLen, i-mp.get(prefSum));
            } else {
                mp.put(prefSum,i);
            }
         }
         return maxLen;
    }
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10};
        int maxLen=largestSubArray(arr);
        System.out.println(maxLen);
    }
}
