import java.util.Arrays;
public class PermutationsInArray {
    public static boolean isPossible(long a[], long b[], int n, long k) {
     Arrays.sort(a);
     Arrays.sort(b);
     for(int i = 0; i < b.length / 2; i++) {
        long temp = b[i];
        b[i] = b[b.length - i - 1];
        b[b.length - i - 1] = temp;
    }
    int count=0;
    for(int i=0;i<a.length;i++) {
        if(a[i] +b[i] >=k) {
            count++;
        }
    }if(count==a.length) {
        return true;
    }
    return false;
    }
    public static void main(String[] args) {
        long a[]={1,2,2,1};
        long b[]={3,3,3,4};
        int k=10;
        System.out.println(isPossible(a, b,a.length, k));
    }
}
