import java.util.Stack;

public class DisplayStack {
    public static void displayReverseRec(Stack<Integer> st) {
        if(st.size()==0) return;
      int top=st.pop();
      System.out.print(top+" ");
      displayReverseRec(st);
      st.push(top);
    }   

    public static void displayRec(Stack<Integer> st) {
        if(st.size()==0) return;
      int top=st.pop();
      displayRec(st);
      System.out.print(top+" ");
      st.push(top);
    }
    public static void main(String[] args) {
         Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        Stack<Integer> rt= new Stack<>();
        while(st.size() >0) {            // print using other stack
            rt.push(st.pop());
        }
        System.out.print("Using other stack:");
        while(rt.size()>0) {
            int x=rt.pop();
            System.out.print(x +" ");
            st.push(x);
        }  System.out.println();

        int n=st.size();                 // print using array 
        int arr[]=new int[n];

        for(int i=n-1;i>=0;i--) {
         arr[i]=st.pop();   
        }
        System.out.print("Using array:");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
           st.push(arr[i]); 
        } System.out.println();

        displayReverseRec(st);
        System.out.println();
        displayRec(st);
    }
}
