import java.util.ArrayList;
import java.util.List;
public class Josephus {
  public static int josephus(List<Integer> person, int k, int index) {
        if (person.size() == 1) {
            return person.get(0);
        }
        index = ((index + k) % person.size());
        person.remove(index);
        return josephus(person, k, index);
    }
    public static int josephus2(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            return (josephus2(n - 1, k) + k - 1) % n + 1;
        }
    }
     public static void main(String[] args) {
        int n=7;
        int k=2;
        ArrayList<Integer> s=new ArrayList<>();
        for(int i=1;i<=n;i++) {
            s.add(i);
        }
     System.out.println(josephus(s, k, n));
 
     int ans=josephus2(n, k);
     System.out.println(ans);
    } 
}
