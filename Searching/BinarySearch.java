public class BinarySearch {
 
    static boolean binarySearch(int arr[],int target) {
        int n=arr.length;
        int st=0 , end=n-1;
        while(st<=end) {
            int mid=(st+end)/2;

            if(target ==arr[mid]) {
                return true;
            } else if(target < arr[mid]) {
                end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=0;
        while(target !=10) {
        System.out.printf("%d exists in arr: %b \n" , target, binarySearch(arr, target));
        target++;    
    }
    }
}
