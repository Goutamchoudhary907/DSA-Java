// Find the index of minimum element in a rotated sorted array 

public class FindMinInRotatedArray {

    static int findMin(int arr[]) {
        int n=arr.length;
      int st=0 , end=n-1;
      int ans=-1;

      while(st <=end) {
        int mid=st +(end-st)/2;
        if(arr[mid] <= arr[n-1]) {
           ans=mid;
           end=mid-1; 
        } else {
            st=mid+1;
        }
      }
      return ans;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,6,1,2};
    System.out.println("Index of minimum element:"+findMin(arr));
    }
}

// TC= O(log n)