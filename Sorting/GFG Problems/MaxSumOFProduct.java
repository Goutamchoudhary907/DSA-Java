import java.util.Arrays;

public class MaxSumOFProduct {
  static  long MaxSum(long []A, long []B, int N) 
    { 
        long sum=0;
    Arrays.sort(A);
    Arrays.sort(B);
    for(int i=N-1;i>=0;i--) {
     long product= A[i] *B[i];
     sum +=product;
    }
    return sum;
    }
    public static void main(String[] args) {
        long A[]={1L,2L,3L,4L,5L};
        long B[]={6L,7L,8L,9L,10L};
        int N=A.length;
        System.out.println(MaxSum(A, B, N));
    }
}
