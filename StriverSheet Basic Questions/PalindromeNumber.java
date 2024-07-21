public class PalindromeNumber {
    public static  boolean isPalindrome(int x) {
        String ans=Integer.toString(x);
         int i=0;
         int j=ans.length()-1;
        while (i <j) {
         if(ans.charAt(i) !=ans.charAt(j)){
            return false;
         }            
         i++;
         j--;
        }
        return true;
    }

    public static boolean isPalindrome2(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return (x == reversed) || (x == reversed / 10);
    }
    public static void main(String[] args) {
        int x=-121;
        System.out.println(isPalindrome2(x));
    }
}
