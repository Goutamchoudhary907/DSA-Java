import java.util.ArrayList;
import java.util.List;
public class JugglerSequence {
    public static List<Integer> jugglerSequence(int N) {
        ArrayList <Integer> ans=new ArrayList<>();
        ans.add(N);
        if(N>1) {
            int nextTerm;
            if(N%2==0) {
                nextTerm=(int) Math.sqrt(N);
            }
         else {
            nextTerm=(int)Math.pow(N, 3.0/2.0);
         }
         ans.addAll(jugglerSequence(nextTerm));
        }
      return ans;
    }
    public static void main(String[] args) {
        int N=9;
        System.out.println(jugglerSequence(N));
    }
}
