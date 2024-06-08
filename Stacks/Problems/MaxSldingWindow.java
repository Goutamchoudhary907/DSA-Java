import java.util.Stack;

public class MaxSldingWindow {
    
    public static int[] maxSldingWindow (int []arr ,int k) {      
        // TC= O(k*(n-k+1)) ->  O(k*n)
        int n=arr.length;
        int ans[] =new int[n-k+1];
        int z=0;
        for(int i=0;i<n-k+1;i++) {
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++) {
             max=Math.max(max, arr[j]);
            }
            ans[z++]=max;
        }
        return ans;
    }


    public static int[] maxSldingWindow2 (int []arr ,int k) {      
        int n=arr.length;
        int ans[] =new int[n-k+1];
        int z=0;
        Stack<Integer> st=new Stack<>();
        int [] nge=new int[n];
        nge[n-1]=n;  st.push(n-1);
        for(int i=n-2;i>=0;i--) {
            while(st.size() >0 && arr[st.peek()] <arr[i] ) {
                st.pop();
            }
            if(st.size() ==0) nge[i]=n;
            else nge[i] =st.peek();
            st.push(i);
        }
        int j=0;
        for(int i=0;i<n-k+1;i++) {
            if(j>=i+k) j=i;
            int max=arr[j];
            while(j<i+k) {                // j must inside window
              max=arr[j];          
                j=nge[j];
            }
            ans[z++] =max;
        }
      
        return ans;
    }
     public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int ans[]=maxSldingWindow2(arr, 3);
        for(int i=0;i<ans.length;i++) {
            System.out.print(ans[i]+" ");
        }
     }
    }