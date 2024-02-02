import java.util.ArrayList;
import java.util.List;

public class AddRemoveElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
         
        System.out.println(list.get(1));              // get element at index 1 

        list.remove(0);                               // remove value at index 0
        System.out.println(list);

        list.remove(Integer.valueOf(5));                  // remove 5 from the list 
        System.out.println(list);

        list.clear();                                        // clear list ,delete all elemets
        System.out.println(list);

        
    }
}
