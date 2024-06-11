import java.util.Stack;

public class NextGreaterInTwoArrays {
    
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
     Stack<Integer> st=new Stack<>();
     int res[]=new int[nums1.length];
      int idx=nums2.length-1;
     res[nums1.length-1]=-1;
     st.push(nums2[idx--]);
     
     for(int i=0;i<nums1.length;i++) {
        while(st.size()>0 && nums1[i] > st.peek()) {
            st.pop();
        }
        // st.push(nums2[idx--]);
         if(st.size()>0){
            res[i]=st.peek();
        }else {
            res[i]=-1;
        }
         st.push(nums2[idx--]);
     }
     return res;
     }

     public static void main(String[] args) {
        int nums1[]={4,1,2};
        int nums2[]={1,3,4,2};

        int res[]=nextGreaterElement(nums1, nums2);
        for(int i=0;i<res.length;i++) {
            System.out.print(res[i]+" ");
        }
     }
}
