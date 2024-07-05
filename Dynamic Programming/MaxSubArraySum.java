// Kadane's algorithm
public class MaxSubArraySum {
    public static int maxSubArraySum(int arr[]){
        int currMax=arr[0];
        int maxSoFar=arr[0];
        int start=0 , end=0;
        for (int i = 1;i < arr.length;i++) {
             currMax= currMax + arr[i];         // element becomes part of curr sub array
            if(currMax < arr[i]){
                currMax=arr[i];                // create own subArray
                start=i;
            }
            if(maxSoFar < currMax){
                maxSoFar =currMax;
                end=i;
            }
        }
           System.out.print("Array elements include in subArray: ");
           for (int i = start;i <= end;i++) {
                System.out.print(arr[i]+" ");
           } System.out.println();
        return maxSoFar;
    }
    public static void main(String[] args) {
        int arr[]={4,3,-2,6,-12,7,-1,6};

        System.out.println("Max sum: "+maxSubArraySum(arr));
    }
}
