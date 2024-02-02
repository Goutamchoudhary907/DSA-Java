import java.util.ArrayList;
import java.util.List;

public class SetAndContains {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);

        list.set(5, 100);               // update the value at index 5 as 100
        System.out.println(list);
  
        System.out.println(list.contains(40));       // check that is list contains 40 or not 
    } 
}
