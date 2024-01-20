import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class ArrayIntersection {
    static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
  ArrayList<Integer> list=new ArrayList<>();

        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i]> nums2[j]){
                j++;
            }
            else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int [] ans=new int[list.size()];
        int k=0;
        while(k<list.size()){
            ans[k]=list.get(k);
            k++;
        }
        return ans;
    }


public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter Size of Array 1:");
    int size1 = Sc.nextInt();

    int nums1[] = new int[size1];

    System.out.println("Enter Elements of Array 1:");
    for (int i = 0; i < nums1.length; i++) {
        nums1[i] = Sc.nextInt();
    }
        System.out.println("Enter Size of Array 2:");
        int size2 = Sc.nextInt();

        int nums2[] = new int[size2];

        System.out.println("Enter Elements of Array 2 :");
        for (int i = 0; i < nums1.length; i++) {
            nums2[i] = Sc.nextInt();
        }
        Sc.close();
    
        int ans[] = intersect(nums1, nums2);
        System.out.println("Intersection:");
        for (int i=0;i<ans.length;i++) {
         System.out.println(ans[i]);
        }
}
}