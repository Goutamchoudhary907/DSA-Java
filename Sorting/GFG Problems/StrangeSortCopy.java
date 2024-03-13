import java.util.Arrays;

public class StrangeSortCopy {
    static void strangeSort (int A[], int N, int K)
    {
        for(int i=0;i<N;i++) {
           if(i !=K-1) { 
            for(int j=i+1;j<N;j++) {
                if(j!= K-1 && A[j] <A[i]) {
                    int temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                   }
            }
        }
        }
    }
    static void strangeSort2 (int A[], int N, int K)
    {
         // your code here
        // int ind1 = 0, ind2 = 0;
        int value = A[K-1];
        A[K-1]=Integer.MAX_VALUE;
        
        Arrays.sort(A);
        for (int i = N-1 ; i>=K ; i--){
            A[i] = A[i-1];
        }
        
        A[K-1] = value;
    }
    public static void main(String[] args) {
        int A[]={3,12,30,79,2};
        int K=2, N=5;
      strangeSort2(A, N, K);
      for(int i:A) {
        System.out.print(i+" ");
      }
      System.out.println();
    }
}
