public class DivisorGame {
    public static boolean divisorGame(int N) {
        if (N % 2 == 0) 
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int N=3;
        System.out.println(divisorGame(N));
    }
}
