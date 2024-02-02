import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraverseList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {                // For loop for traverse the list
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        for (Integer element : list) {                          // For each loop
            System.out.print(element + " ");
        }

        System.out.println();
        Iterator<Integer> it = list.iterator();                 // All collection frameworks has iterator for iterate  
        while (it.hasNext()) {
            System.out.print( it.next() +" ");
        }
    }
}
