/*
 * Sort arraylist of strings in descending order
 */

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("Java");
        l1.add("Programming");
        System.out.println("ORiginal List:" + l1);
        Collections.sort(l1);
        System.out.println("Ascending:"+l1);
        Collections.sort(l1 , Collections.reverseOrder());
        System.out.println("Descending:" + l1);
    }
}
 