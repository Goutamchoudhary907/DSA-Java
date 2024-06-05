// Find minimum no of brackets that we need to remove to make the given bracket sequence balanced

import java.util.Scanner;
import java.util.Stack;

public class MinimumBrackets {
     public static int minBrackets(String str) {
        Stack<Character> st=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++) {
         char ch=str.charAt(i);
         if(ch=='(') {
            st.push(ch);
         } 
         else {
            if(st.isEmpty() || st.peek()!='(') {
                st.push(ch);
            }
            if(st.peek()=='(') {
                st.pop();
            }
         }
        }   
        return st.size();
    }
public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
         System.out.println("Enter string:");
        String str =sc.nextLine();
        System.out.println(minBrackets(str));
        sc.close();
}
    
}
