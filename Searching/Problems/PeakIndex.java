// Peak index in mountain array 

public class PeakIndex {
    public static int peakIndex(int arr[]) {
        int st=0 , end=arr.length-1;
        int ans=-1;

        while(st<=end) {
            int mid=st + (end-st)/2;
            if(arr[mid] < arr[mid+1]) {
                ans=mid+1;
                st=mid+1;
            } else {
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,1,0};
        System.out.println(peakIndex(arr));
    }
}
