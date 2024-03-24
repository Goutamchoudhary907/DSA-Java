/*Leetcode 240 
 * row wise sorted and column wise also sorted 
 */
public class SearchIn2DArray {
   public static boolean searchMatrix(int arr[][], int target) {
    int n=arr.length;
    int m=arr[0].length;
     int i=0 , j=m-1;
  
     while (i<n && j>=0) {
        if(arr[i][j] == target) return true;

        if(target < arr[i][j]) {
            j--;                // move left
        } else {
            i++;                // move down
        }
     }
     return false;
   } 
   public static void main(String[] args) {
    int arr[][]={{1,  4,  7,  11, 15} ,
                 {2,  5,  8,  12, 19} , 
                 {3,  6,  9,  16, 22} ,
                 {10, 13, 14, 17, 24} ,
                 {18, 21, 23, 26, 30} };
      int target=5;
      System.out.println(searchMatrix(arr, target));           
   }
}
// TC=O(n+m)