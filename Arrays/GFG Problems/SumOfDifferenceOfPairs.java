 class SumOfDifferenceOfPairs {
    static long findMinSum(int[] A,int[] B,int N) { 
     long sum=0;
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
            sum += A[i]-B[j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int A[]={1,2,3,4};
        int B[]={4,3,2,1,};
        System.out.println(findMinSum(A, B, A.length));
    }
}
