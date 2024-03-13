import java.util.Arrays;

public class MegaSale {
  public static long maxProfit(int[] A, int N, int m) {
    long profit=0;
    Arrays.sort(A);
    for(int i=0;i<N;i++){
        if(m>0 && A[i]<0){
           profit+=A[i];
           m--;
        }
    }
    return profit<0? -(profit):profit;
    }

    public static void main(String[] args) {
        int arr[] = { 8,-4,-9,3,-1,-2,9,6};
        int  n = 8,m = 1;
        System.out.println(maxProfit(arr, n, m));       
}
}
