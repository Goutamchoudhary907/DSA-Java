public class RecursiveBinarySearch {
    
    static boolean recBinarySearch(int arr[] , int st, int end , int target) {
        if(st>end) return false;
        int mid=(st+end) /2;
        if(target == arr[mid]) {
            return true;
        }  else if(target < arr[mid]) {
            return recBinarySearch(arr, st, mid-1, target);
        } else {
            return recBinarySearch(arr, mid+1, end, target);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=0;
        while(target !=10) {
        System.out.printf("%d exists in arr: %b \n" , target, recBinarySearch(arr, 0, arr.length-1,target));
        target++;    
    }
    } 
}
 