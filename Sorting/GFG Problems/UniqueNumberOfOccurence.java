import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurence {
    static int findMax(int arr[]) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }
    public static boolean isFrequencyUnique(int n, int[] arr) {
        int mx=findMax(arr);
      int freq[]=new int[mx+1];
      for(int i=0;i<n;i++) {
        freq[arr[-i]]++;
      }
for(int i:freq) {
    System.out.print(i+" ");
}
       for(int i=0;i<freq.length;i++) {
        for(int j=i+1;j<freq.length;j++) {
            if(freq[i] ==freq[j] && freq[i] !=0) {
                return false;
            }
        }
      }
      return true;
    } 
    
    public static boolean isFrequencyUnique1(int n, int[] arr) {
     
      Map<Integer, Integer> countMap = new HashMap<>();

        // Iterate over the array and populate the countMap
        for (int number : arr) {
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        // Create a set to track unique frequencies
        Set<Integer> uniqueFrequencies = new HashSet<>();

        // Check if all frequencies are unique
        for (int frequency : countMap.values()) {
            if (uniqueFrequencies.contains(frequency)) {
                return false; // Frequency is not unique
            }
            uniqueFrequencies.add(frequency);
        }

        return true;
    }
    public static void main(String[] args) {
        int arr[]={0 ,-4 ,-4, 0, -4 ,-4 ,-4 ,0 ,0};
        System.out.println(isFrequencyUnique(arr.length, arr));
    }
}
