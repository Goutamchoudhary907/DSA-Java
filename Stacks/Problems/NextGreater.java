import java.util.Stack;

public class NextGreater {
    
    public static int[] nextGreater(int arr[]) {
        Stack<Integer> st=new Stack<>();
        int res[]=new int[arr.length];
        int n=arr.length;

        res[n-1]=-1;
        st.push(arr[n-1]);

        for(int i=n-2;i>=0;i--) {
            while(st.size() >0  && st.peek()<arr[i] ) {
                st.pop();
            }
            if(st.size()==0) res[i]=-1;
            else res[i]=st.peek();
            st.push(arr[i]);
        }
        return res;
    }

    public static int[] nextGreater2(int arr[]) {
        Stack<Integer> st=new Stack<>();
        int res[]=new int[arr.length];
        int n=arr.length;

        st.push(0);
        for(int i=1;i<n;i++) {
            while(st.size() >0 && arr[i] >arr[st.peek()]) {
                res[st.peek()] =arr[i];
                st.pop();
            }
            st.push(i);
        }
        for(int i=0;i<n;i++) {
          if(res[i] ==0) {
            res[i] =-1;
          }  
        }
        return res;
    }

    public static void print(int res[]) {
        for(int i=0;i<res.length;i++) {
            System.out.print(res[i] +" ");
        }
        System.out.println();
    }
       
    public static void main(String[] args) {
        int arr[]={1,5,3,2,1,6,3,4};
        int res[]=nextGreater(arr);
        print(res);

        int ans[]=nextGreater2(arr);
        print(ans);
}
}