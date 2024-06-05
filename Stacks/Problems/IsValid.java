// Leetcode 20 , ([]){} valid   ,   ([)] invalid because between () there is only one [ not both []

import java.util.Scanner;
import java.util.Stack;

public class IsValid {
    
    public static boolean isValid(String str) {
        Stack<Character> st=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++) {
         char ch=str.charAt(i);
         if(ch=='(' || ch=='['  || ch=='{') {
            st.push(ch);
         } 
         else {
            if(st.size()==0) return false;
            else if(st.peek()=='(' && ch==')') {
                st.pop();
            }
            else if(ch==']' && st.peek()=='[') {
                st.pop();
            }
           else if(ch=='}' && st.peek()=='{') {
                st.pop();
            }
           else st.push(ch);
         }
        }
        if(st.size() >0) return false;   
        return true;
    }

    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
         System.out.println("Enter string:");
        String str =sc.nextLine();
        System.out.println(isValid(str));

        System.out.println(isValid2(str));
        sc.close();
    }
}
