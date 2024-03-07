public class RecursiveSequence {
    static long computeF(int n) {
      long mod=1000000007;
      long x=1 , ans=0;
      for(int i=1;i<=n;++i) {
        long temp=1;
        for(int j=1;j<=i;++j) {
            temp=(temp*x)%mod;
            ++x;
        }
        ans=(ans+temp)%mod;
      }
      return ans;
    }
    
    public static void main(String[] args) {
        int n=5;
        System.out.println(computeF(n));
    }
}
