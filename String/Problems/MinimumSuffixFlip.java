public class MinimumSuffixFlip {
    static int minFlips(String target) {
        int count=0;
        char curr = '0';
        for(int i=0;i<target.length();i++){
            if(target.charAt(i)!=curr){
                count++;
                curr=target.charAt(i);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String target="10111";
        System.out.println(minFlips(target));
    }
}