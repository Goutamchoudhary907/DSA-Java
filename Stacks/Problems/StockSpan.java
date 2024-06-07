import java.util.Stack;

public class StockSpan {

    public static int[] stockSpan(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int res[] = new int[arr.length];

        res[0] = 1;
        st.push(0);

        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            res[i] = i - (st.peek());
            st.push(i);

        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = { 100, 80, 60, 70, 60, 75, 85 };
        int res[] = stockSpan(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        } System.out.println();
    }
}