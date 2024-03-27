import java.util.Arrays;

public class IdenticalArray {
    public static int check (int arr[], int[] brr, int n) {
    Arrays.sort(arr);
    Arrays.sort(brr);
    if(Arrays.equals(arr, brr)) {
        return 1;
    }
    return 0;
    }
    public static void main(String[] args) {
         int arr[]={1,2,3,4,5};
         int brr[]={3,4,1,2,5};
         System.out.println(check(arr, brr, arr.length));
    }
}
