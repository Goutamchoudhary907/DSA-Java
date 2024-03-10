public class powerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if((n&(n-1))!=0) return false;
         return (n-1)%1==0;
     }
    public static void main(String[] args) {
        int n=64;
        System.out.println(isPowerOfTwo(n));
    }
}

