import java.util.Arrays;

public class MaximizeToys {
    static int toyCount(int N, int K, int arr[]) {
        Arrays.sort(arr);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
        if (arr[i] < K && sum <= K) {
        sum += arr[i];
        count++;
       }
    }
// wrong ans
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,111,200,1000,10};
        int K=50;
        int N=arr.length;
        System.out.println(toyCount(N, K, arr));
    }
}
