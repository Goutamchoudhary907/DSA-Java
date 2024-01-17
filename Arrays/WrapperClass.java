import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        Integer n = Integer.valueOf(4);
        System.out.println("n:" + n);

        ArrayList<Integer> l1 = new ArrayList<>();

        // add new element at end of list
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // get an element at index i
        System.out.println("Value at index 1: " + l1.get(1)); // value at first index

        // print with for loop
        System.out.println("List elements: ");
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        // print the array list directly
        System.out.println(l1);

        // add new element at ith index
          l1.add(1, 100);
          System.out.println(l1);

        //   modifying the element at index i      
        l1.set(1, 10);                // replace 100 with 10
        System.out.println(l1);

        // removing an element at index i
        l1.remove(1);                        // remove value at index 1 which is 10
        System.out.println(l1);

        // remove an element e without knowing index
        l1.remove(Integer.valueOf(7));          // remove 7 , return type is boolean if element is not present 
                                                  // it not gives error return false if we print result, if not print nothing happens
        System.out.println(l1);


        //  checking if an element exist
        System.out.println(l1.contains(Integer.valueOf(16)));

    //    if you dont specify class , you can put anytthing inside L
         ArrayList<Object> l = new ArrayList<> ();                        // i pass object as parameter because compiler gives warning 
         l.add("PQRS");
         l.add(1);
         l.add(true);
         System.out.println(l);
    }
}
