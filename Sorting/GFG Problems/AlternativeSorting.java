import java.util.ArrayList;
import java.util.Arrays;

public class AlternativeSorting {
 static  ArrayList<Long> l=new ArrayList<>();
     static ArrayList<Long> alternateSort(long arr[] ,int N)
    { 
      Arrays.sort(arr);
      ArrayList<Long> l=new ArrayList<>();
      int i=0 , j=N-1;
      while(i<j) {
        l.add(arr[j--]);
        l.add(arr[i++]);
      }
      return l;
    }

    public static void main(String[] args) {
     long arr[]={7,1,2,3,4,5,6};
     System.out.println(alternateSort(arr, arr.length));
    }
}
