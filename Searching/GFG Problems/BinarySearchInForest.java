import java.util.Arrays;

public class BinarySearchInForest {
    static int find_height(int tree[], int n, int k)
    {
        
        int left = 0;                             // Minimum possible height
        int right = getMaxHeight(tree);           // Maximum possible height

        while (left < right) {
            int mid = left + (right - left) / 2;
            int totalWood = getTotalWood(tree, mid);

            if (totalWood == k) {
                return mid;                        // Found the exact height
            } else if (totalWood < k) {
                // Need to cut higher
                right = mid;
            } else {
                // Need to cut lower
                left = mid + 1;
            }
        }

        return -1;                                  // Not possible to collect exactly k units of wood
    }

    private static int getMaxHeight(int[] tree) {
        int max = Integer.MIN_VALUE;
        for (int height : tree) {
            max = Math.max(max, height);
        }
        return max;
    }

    private static int getTotalWood(int[] tree, int height) {
        int total = 0;
        for (int t : tree) {
            if (t > height) {
                total += (t - height);
            }
        }
        return total;
    }
  
  static int findHeight(int tree[], int n, int k)
    {
        Arrays.sort(tree);
        int left=0;
        int right=tree[n-1];
        
        while(left<=right){
            int mid=left+(right-left)/2;
            
            int total=0;
            for(int i=0;i<n;i++){
                if(tree[i]>mid){
                    total+=(tree[i]-mid);
                }
            }
            if(total==k)return mid;
            if(total>k){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 5, k = 4 ;
        int tree[] = {2, 3, 6, 2, 4} ;
        // System.out.println(find_height(tree, n, k));
        System.out.println(findHeight(tree, n, k));
    }
}
