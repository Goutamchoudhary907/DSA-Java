public class RemoveStar {
    static String removeStars(String s) {
        StringBuilder sb=new StringBuilder(s);
        if(sb.charAt(0)=='*') {
            sb.deleteCharAt(0);
        }
        for(int i=1;i<sb.length();) {
            if(sb.charAt(i) =='*') {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i-1);
                i=i-1;
            } else {
                i++;
            }
        }
        return sb.toString();
    }
    static String removeStars2(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<s.length();i++) {
            if(s.charAt(i) =='*') {
                sb.deleteCharAt(sb.length()-1);
            } else {
             sb.append(s.charAt(i));
            }    
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="*leet**cod*e";
       System.out.println(removeStars(s));
        System.out.println(removeStars2(s));
    }
}
