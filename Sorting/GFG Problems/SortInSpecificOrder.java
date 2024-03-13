import java.util.ArrayList;
import java.util.Collections;
public class SortInSpecificOrder {
    public static void sortIt(long arr[], long n) {
        ArrayList<Long> odd=new ArrayList<>();
        ArrayList<Long> even=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
              even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
      Collections.sort(even);
      Collections.sort(odd,Collections.reverseOrder());
      int index=0;
      for(int i=0;i<odd.size();i++) {
        arr[index++]=odd.get(i);
      }
      for(int i=0;i<even.size();i++) {
        arr[index++]=even.get(i);
      }
        }
        public static void main(String[] args) {
            long[] arr={1L,2L,3L,5L,4L,7L,10L};
            Long n=Long.valueOf(arr.length);
            sortIt(arr, n);
            for(long i:arr){
                System.out.print(i+" ");
            }
        }
    }
