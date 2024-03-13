public class BInSort {
    static void binSort(int A[], int N) {
        int i = 0, j = N - 1;
        while (i > j) {
            if (A[i] == 1 && A[j] == 0) {
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
                i++;
                j--;
            } 
            while (A[i]==0) i++;
            while(A[j]==1) j--;
        }
    }
    static void print(int arr[]) {
        for(int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] A={1,0,1,1,0};
     print(A);
     binSort(A, A.length);
     print(A);
    }
}
