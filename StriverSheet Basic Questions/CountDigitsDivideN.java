public class CountDigitsDivideN {
    
    static int evenlyDivides(int N){
     int count=0;
     int divisor=N;
     while (divisor>0) {
          int mod=divisor%10;
          if(mod!=0 && N %mod==0){
           count++;   
        }
         divisor=divisor/10;
     }
     return count;
   }
    public static void main(String[] args) {
         int N=22074;
         System.out.println(evenlyDivides(N));
    }
}
