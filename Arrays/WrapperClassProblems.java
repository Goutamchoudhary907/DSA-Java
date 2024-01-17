import java.util.ArrayList;
// import java.util.Collections;
import java.util.Collections;

public class WrapperClassProblems {

    static void reverseList(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;

        while (i < j) {
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(5);
        list.add(74);
        list.add(58);
        list.add(22);
        list.add(10);

        System.out.println("Original list" + list);

        reverseList(list);
        // Collections.reverse(list);
        System.out.println("Reversed list: " + list);

        // sort list
        Collections.sort(list);
        System.out.println("Ascending order:"+list);
     
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order:"+list);
    }
}
