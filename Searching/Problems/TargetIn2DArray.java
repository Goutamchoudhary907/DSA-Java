// search the target in 2D array  , integers in each row are sorted from left to right 
// and the first integer of each row is greater than the last integer of the previous row

public class TargetIn2DArray {

    public static  boolean search(int arr[][], int target) {
        int n = arr.length; // number of rows
        int m = arr[0].length; // number of column

        int st = 0, end = n * m - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            int midElement = arr[mid / m][mid % m];       /*  Find index like linear array , convert arr[1][0] into 4 if arr= 1   3   5   7
                                                                                                                            10  11  16  20 
                                                                                                                            23  30  34  60     */
            if (midElement == target) {
                return true;
            }
            if (target < midElement) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] ={ {1,3,5,7} , {10,11,16,20} , {23,30,34,60}} ;
        int target=3;
        System.out.println(search(arr, target));
    }
}

// TC= O(log (n*m))