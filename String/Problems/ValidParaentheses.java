// public class ValidParaentheses {
//     static boolean isValid(String s) {
//         for (int i = 0; i < s.length() - 1; i += 2) {
//             if (s.charAt(i) != s.charAt(i + 1)) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String s = "()[]{}";
//         System.out.println(isValid(s));
//     }
// }

// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<Character>();
//         for (char c : s.toCharArray()) {
//             if (c == '(')
//                 stack.push(')');
//             else if (c == '{')
//                 stack.push('}');
//             else if (c == '[')
//                 stack.push(']');
//             else if (stack.isEmpty() || stack.pop() != c)
//                 return false;
//         }

//         return stack.isEmpty();
//     }
// }