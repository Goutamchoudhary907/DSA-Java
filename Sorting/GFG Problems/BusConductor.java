import java.util.Arrays;

public class BusConductor {
    public static int findMoves(int n, int[] chairs, int[] passengers) {
        int moves=0;
        Arrays.sort(chairs);
        Arrays.sort(passengers);
     for(int i=0;i<n;i++) {
        if(chairs[i] ==passengers[i]) {
          moves+=0;
        }
        if(chairs[i] < passengers[i]) {
           int diff= passengers[i]-chairs[i];
           moves +=diff;
        }
        if(passengers[i] < chairs[i]) {
            int diff=chairs[i]-passengers[i];
            moves +=diff;    
        }
     }
     return moves;
    }
  
    public static int findMoves2(int n, int[] chairs, int[] passengers) {
      Arrays.sort(chairs);
      Arrays.sort(passengers);
      int moves=0;
      for(int i=0;i<n;i++) {
      int diff=Math.abs(chairs[i] -passengers[i]);
      moves +=diff;
      }
      return moves;
    }

    public static void main(String[] args) {
    int chairs[] ={5,5,7,7};
    int passengers[]={1,3,6,9};
    int n=chairs.length;
    System.out.println(findMoves(n, chairs, passengers));
    System.out.println(findMoves2(n, chairs, passengers));
    }
}
