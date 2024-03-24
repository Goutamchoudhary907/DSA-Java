// Return peak element index

public class PeakElement {
    public static int findPeakElement(int arr[]){
        int n=arr.length-1;
        int st=0 , end=n-1;
        while(st<=end) {
            int mid=st+ (end-st)/2;
            if((mid==0 || arr[mid] > arr[mid-1]) &&( mid==n-1 ||arr[mid]>arr[mid+1])) {
                return mid;
            }
            if(arr[mid]< arr[mid+1]) {           // uphill/ ascending side
               st=mid+1;
            } else {                            // downhill 
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={1,2,1,3,5,6,4};
        System.out.println(findPeakElement(arr));
    }
}
