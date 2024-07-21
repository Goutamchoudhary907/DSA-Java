public class ReverseIncreasingLetterTriangle {
    public static void nLetterTriangle(int n) {
        for(int i=n;i>=1;i--){
             char letter='A';
             for(int j=1;j<=i;j++){
              System.out.print(letter+" ");
              letter++;
             }
             System.out.println();
         }
     }
    public static void main(String[] args) {
         int n=3;
         nLetterTriangle(n);
    }
}
