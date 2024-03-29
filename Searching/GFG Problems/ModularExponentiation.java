public class ModularExponentiation {
    public static long PowMod(long x, long n, long m)
    {
        if (n == 0) {
            return 1 % m;
        }
        long result = 1;
        x %= m;
        while (n > 0) {
            if (n % 2 == 1) {
                result = (result * x) % m;
            }
            x = (x * x) % m;
            n /= 2;
        }

        return result;
    }
    public static void main(String[] args) {
     long  x=142, n=55, m=741 ;
     System.out.println(PowMod(x, n, m));
    }
}
