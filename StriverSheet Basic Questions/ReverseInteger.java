public class ReverseInteger {

    public static int reverse(int x) {
        boolean isNegative = x < 0;
        x = Math.abs(x);
        StringBuilder ans = new StringBuilder();
        while (x > 0) {
            int temp = x % 10;
            ans.append(temp);
            x = x / 10;
        }
        String res = ans.toString();
        try {
            int reversed = Integer.parseInt(res);
            return isNegative ? -reversed : reversed;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static int reverse2(int x) {
        int prevRev = 0, rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            if ((rev - x % 10) / 10 != prevRev) {
                return 0;
            }
            prevRev = rev;
            x = x / 10;
        }
        return rev;
    }

    class Solution {
        public int reverse(int x) {
            int num = Math.abs(x);
            int rev = 0;
            while (num != 0) {
                int ld = num % 10;
                if (rev > (Integer.MAX_VALUE - ld) / 10) {
                    return 0;
                }
                rev = rev * 10 + ld;
                num = num / 10;
            }
            return (x < 0) ? (-rev) : rev;
        }
    }

    public static void main(String[] args) {
        int x = 120;
        System.out.println(reverse2(x));
    }
}
