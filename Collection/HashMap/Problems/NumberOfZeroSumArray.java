// return the number of zero sum subarrays in the given array 

import java.util.HashMap;

public class NumberOfZeroSumArray {
    public static int totalSubArrays(int arr[]){
   
        HashMap<Integer, Integer> mp=new HashMap<>();
        int subarrays=0 , prefSum=0;
         mp.put(0, -1);
         for(int i=0;i<arr.length;i++){
            prefSum+=arr[i];
            if(mp.containsKey(prefSum)){
                subarrays++;
            } else {
                mp.put(prefSum,i);
            }
         }
         return subarrays;
    }
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,-25};
        int subarrays=totalSubArrays(arr);
        System.out.println(subarrays);
    }
}
