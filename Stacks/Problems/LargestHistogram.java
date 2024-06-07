import java.util.Stack;
public class LargestHistogram {
    public static int[] nextSmaller(int arr[]) {
       Stack<Integer> st=new Stack<>();
       int nse[] =new int[arr.length];
       int n=arr.length;
    
       nse[n-1]=n; st.push(n-1);

       for(int i=n-2;i>=0;i--) {
        while(st.size() >0 && arr[i] <= arr[st.peek()]) {
            st.pop();
        }
        if(st.size()==0)  nse[i] =n;
        else nse[i] =st.peek();

        st.push(i);
       } 
       return nse;
    }

    public static int [] previousSmaller(int arr[]) {
        Stack<Integer> st=new Stack<>();
        int pse[] =new int[arr.length];
        int n=arr.length;

        pse[0] =-1; st.push(0);

        for(int i=1;i<n;i++) {
            while(st.size()>0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            if(st.size()==0) pse[i]=-1;
            else pse[i] =st.peek();

            st.push(i);
        }
        return pse;
    }

    public static int maxArea(int arr[]) {

        int nse[]=nextSmaller(arr);
        int pse[]=previousSmaller(arr);
        int max=-1;
        for(int i=0;i<arr.length;i++) {
         int area=arr[i] *(nse[i]- pse[i] -1);
            max=Math.max(max, area) ;
        }
        return max;
    }

    public static void print (int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        // int res[]=nextSmaller(arr);
        // print(res);

        // int ans[]=previousSmaller(arr);
        // print(ans);

        int max=maxArea(arr);
        System.out.println(max);
    }
}
