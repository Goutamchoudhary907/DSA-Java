import java.util.ArrayList;
public class SubsetSum {
    static  ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> sums = new ArrayList<>();
        findSubsetSums(arr, 0, 0, sums);
        return sums;
    }
     private static void findSubsetSums(ArrayList<Integer> arr, int index, int currentSum, ArrayList<Integer> sums) {
        if (index == arr.size()) {
            sums.add(currentSum);
            return;
        }

        // Include the current element and move to the next
        findSubsetSums(arr, index + 1, currentSum + arr.get(index), sums);

        // Exclude the current element and move to the next
        findSubsetSums(arr, index + 1, currentSum, sums);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(1);
    System.out.println(subsetSums(arr, 3));
    }
}
