import java.util.ArrayList;
import java.util.List;

public class CreateArrayList {
    public static void main(String[] args) {
        
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        list.add(1, 50);
        System.out.println(list);

        List<Integer> newlist=new ArrayList<>();
        newlist.add(150);
        newlist.add(160);

        list.addAll(newlist);
        System.out.println(list);
    }
}
