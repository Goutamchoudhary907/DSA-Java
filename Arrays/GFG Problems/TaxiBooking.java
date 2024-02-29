public class TaxiBooking {
   static int minimumTime(int N, int cur, int[] pos, int[] time) {
        int temp=0;
        int sum=Integer.MAX_VALUE;
       for(int i=0;i<N;i++) {
           temp=(Math.abs(cur-pos[i])) *time[i];
           System.out.println(temp);
           if(temp < sum) {
               sum=temp;
           }
       }
       temp=0;
       return sum;
    }
   public static void main(String[] args) {
    int N=3, curr=4;
    int [] pos={1,5,6};
    int []time={2,3,1};
    System.out.println(minimumTime(N, curr, pos, time));
   } 
}