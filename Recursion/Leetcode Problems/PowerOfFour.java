public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        if((n&(n-1))!=0) return false;
         return (n-1)%3==0;
     }
    public static void main(String[] args) {
        int n=64;
        System.out.println(isPowerOfFour(n));
    }
}
