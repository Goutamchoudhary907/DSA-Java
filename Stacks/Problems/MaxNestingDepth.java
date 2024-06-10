public class MaxNestingDepth {
    
    public static int maxDepth(String s) {
        int max=0 , count=0; 
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch=='(') {
                count++;
                if(max<count) {
                    max=count;
                } 
            } else if(ch==')') {
                count--;
            }
            }
            return max;
        }

        public static void main(String[] args) {
            String s="(1)+((2))+(((3)))";
            int max=maxDepth(s);
            System.out.println(max);
        }
    }

