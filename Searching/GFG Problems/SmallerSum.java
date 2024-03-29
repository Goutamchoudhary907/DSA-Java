import java.util.Arrays;

public class SmallerSum {
    public static long[] smallerSum(int n,int arr[])
    {                                                   //TC=O(n*n)
        long []pref=new long[n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(arr[j] <arr[i]) {
                    pref[i] +=arr[j];
                }
            }
        }
        return pref;
    }
 public static long[] smallerSum2(int n,int arr[])
    {
        int arr2[] = new int[n]; 
        for(int i=0; i<arr.length; i++)
        arr2[i]=arr[i];
        Arrays.sort(arr2);
        long sum[] = new long[n];
        sum[0]=arr2[0];
        
        for(int i=1; i<sum.length; i++)
        sum[i]=sum[i-1]+arr2[i];
        long[] res = new long[n];
        for(int i=0; i<n; i++)
        {
            int index=bsearch(arr[i],n,arr2);
            if(index>0)
            res[i]=sum[index-1];
        }
        return res;
    }
    public static int bsearch(int val, int n, int arr[])
    {
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>=val)
            {
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return ans;
  }
    public static void main(String[] args) {
        int arr[]={3,5,1,8,9};
        int n=arr.length;
        // long []pref=smallerSum(n, arr);
        long pref[]=smallerSum2(n, arr);
        for(long i:pref) {
            System.out.print(i+" ");
        }
    }
}
