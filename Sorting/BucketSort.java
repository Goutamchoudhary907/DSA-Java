import java.util.ArrayList;
import java.util.Collections;
public class BucketSort {
static void print(float arr[]) {
    for(float i:arr) {
        System.out.print(i +" ");
    }
    System.out.println();
}
static void buketsort(float[]arr) {
    int n= arr.length;
    // buckets
      @SuppressWarnings("unchecked")
    ArrayList<Float> [] buckets  =new ArrayList[n];
    // create empty bucket
    for(int i=0;i<n;i++) {
        buckets[i]=new ArrayList<Float>();
    }
    // add elements
    for(int i=0;i<n;i++) {
        int bucketIdx=(int) arr[i] *n;
        buckets[bucketIdx].add(arr[i]);
    }
    // sort each bucket individually
    for(int i=0;i<buckets.length;i++) {
        Collections.sort(buckets[i]);
    }
    // merge all buckets to get final sorted array
    int idx=0;
    for(int i=0;i<buckets.length;i++) {
        ArrayList<Float> currBucket=buckets[i];
        for(int j=0;j<currBucket.size();j++) {
            arr[idx++]=currBucket.get(j);
        }
    }
}
    public static void main(String[] args) {
        float [] arr={0.5f,0.4f,0.3f,0.2f,0.1f};
        buketsort(arr);
        print(arr);
    }
}