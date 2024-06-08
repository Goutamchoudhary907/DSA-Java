import java.util.Stack;

public class Celebrity {

    public static int celebrity(int arr[][], int n) {
      Stack<Integer> st=new Stack<>();
      for(int i=0;i<n;i++) {
         st.push(i);
      }
        while(st.size() >1) {
            int v1=st.pop();
            int v2=st.pop();
            if(arr[v1][v2] ==0) {            // v1 doesn't konw v2 , means v2 is not celeb ,v1 may celeb
             st.push(v1);
            } 
            else if(arr[v2][v1]==0) {            // v2 may celeb
              st.push(v2);
            }
        }
            if(st.size()==0) return -1;               // no celeb
            
            int potential =st.pop();
            for(int j=0;j<n;j++) {
             if(arr[potential][j] ==1)  return -1;
            }
            for(int i=0;i<n;i++) {
                if(i==potential) continue;
                if(arr[i][potential] ==0)  return -1;
        }
        return potential;
    }

    public static void main(String[] args) {
        int arr[][] ={{0,1,0} ,
                      {0,0,0} ,
                      {0,1,0}};
        int celeb=celebrity(arr, arr.length);
        System.out.println(celeb);
    }
}
