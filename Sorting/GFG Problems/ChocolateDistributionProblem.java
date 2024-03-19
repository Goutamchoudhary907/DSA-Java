import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistributionProblem {
    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {   if (m == 0 || n == 0) return 0;
        Collections.sort(a);
        if (n < m) return -1;

        long min_diff = Long.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            long diff = a.get(i + m - 1) - a.get(i);
            if (diff < min_diff) min_diff = diff;
        }

        return min_diff;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        A.add(3);
        A.add(3);
        A.add(4);
        A.add(1);
        A.add(9);
        A.add(7);
        A.add(9);
        A.add(12);
        System.out.println(findMinDiff(A, 8, 5));
    }
}
