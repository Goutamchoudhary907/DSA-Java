import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
     public static List<List<Integer>> combinationSum3(int K, int N) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    helper(result, curr, K, 1, N);
    return result;
}

public static void helper(List<List<Integer>> result, List<Integer> curr, int K, int start, int sum) {
    if (sum < 0) {
        return;
    }
    if (sum == 0 && curr.size() == K) {
        result.add(new ArrayList<>(curr));
        return;
    }
    for (int i = start; i <= 9; i++) {
        curr.add(i);
        helper(result, curr, K, i + 1, sum - i);
        curr.remove(curr.size() - 1);
    }
}

     public static void main(String[] args) {
        int N=9;
        int K=3;
        System.out.println(combinationSum3(K, N));
     }
}

