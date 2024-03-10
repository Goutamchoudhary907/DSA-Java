public class PowerOfThree {
    static boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        if((n&(n-1))==0) return false;
         return (n-2)%1==0;
    }
    public static void main(String[] args) {
        int n=99;
        System.out.println(isPowerOfThree(n));
    }
}
