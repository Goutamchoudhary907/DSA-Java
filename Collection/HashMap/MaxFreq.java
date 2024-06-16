import java.util.*;
public class MaxFreq {
    public static void main(String[] args) {
        int arr[]={1,4,2,5,1,4,4,6,1,4,4,4};

        Map<Integer, Integer> freq=new HashMap<>();

        for(int e:arr) {
            if(!freq.containsKey(e)){
            freq.put(e, 1);
            } else{
                freq.put(e,freq.get(e)+1);
            }
        }

        System.out.println(freq);

        int mxFreq=0 , ansKey=0;
        for(var e:freq.entrySet()) {
            if(e.getValue() > mxFreq) {
                mxFreq=e.getValue();
                ansKey=e.getKey();
            }
        }
        System.out.printf("%d has max freq and it occurs %d times", ansKey,mxFreq); 
    }
}
