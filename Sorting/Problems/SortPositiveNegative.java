/*
 * Give an array of positive and negative integers seperate them in linear time and constant space The output should print
 * all negative numbers followed by all positive  numbers 
 */

public class SortPositiveNegative {
    static void sortPosNeg(int arr[]) {
        int l=0, r=arr.length-1;
        while(l<r) {
            while(l<r &&arr[l] <0) {
                l++;
            }
            while(l<r && arr[r] >=0) {
                 r--;
            }
            if(l<r) {
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={-13,20,7,0,5,8,-4,-13,11,-5,-13};
        sortPosNeg(arr);
        for(int i:arr) {
            System.out.print(i+" ");
        }
    }
}
