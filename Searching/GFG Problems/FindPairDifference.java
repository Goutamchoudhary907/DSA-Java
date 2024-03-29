import java.util.Arrays;

public class FindPairDifference {
    public static boolean findPair(int arr[], int size, int n)
    {                                                     //TC= O(n^2)
        Arrays.sort(arr);
        for(int i=0;i<size;i++) {
            for(int j=i+1;j<size;j++) {
            if(Math.abs(arr[i]-arr[j])==n) {
             return true;
            }    
            }
        }
        return false;
    }

    public static boolean findPair2(int arr[], int size, int n)
    {
        Arrays.sort(arr); 
        int left = 0;
        int right = 1;
        
        while (right < arr.length) {
            int diff = arr[right] - arr[left];
            
            if (diff == n) {
                return true;                                      // Found a pair with the given difference
            } else if (diff < n) {
                right++;                                          // Move right pointer to increase the difference
            } else {
                left++;                                           // Move left pointer to decrease the difference
                if (left == right) {
                    right++;                                      // Ensure right is always ahead of left
                }
            }
        }
        return false;                                             // No pair found with the given difference
    }

    public boolean findPair3(int arr[], int size, int n)
    {
        Arrays.sort(arr);
        int i=0;
        int j=1;
        while(i<size && j<size){
          if(i!=j && arr[j]-arr[i]==n){
              return true;
          }else if(arr[j]-arr[i]<n){
              j++;
          }else{
              i++;
          }
      }
        return false;
    }
    public static void main(String[] args) {
         int arr[]={1 ,2 ,6, 3, 4};
         int n=0;
         System.out.println(findPair(arr, arr.length, n));

         System.out.println(findPair2(arr, arr.length, n));
    }
}
