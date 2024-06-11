import java.util.Stack;

public class RemoveOutermostParantheses {
    public static  String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);

            if(ch=='(') {
                if(st.size()>0) {
                    sb.append(ch);
                }
                st.push(ch);
            } else {
                st.pop();
                if(st.size()>0) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="(()())(())";
       System.out.println(s);
        s=removeOuterParentheses(s);
        System.out.println(s);
    }
}
