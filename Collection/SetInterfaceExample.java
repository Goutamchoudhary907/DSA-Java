import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterfaceExample {
    public static void LinkedHashSetEx(){
        LinkedHashSet<Integer> st=new LinkedHashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st);
        st.add(1);
        st.add(1);
        st.add(2);
        System.out.println(st);         // no change 

        st.remove(2);
        
        st.add(48);
        st.add(15);
        st.add(25);
        System.out.println(st);        // insertion order maintained
        
    }

    public static void TreeSetEx(){
        TreeSet<Integer> st=new TreeSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st);
        st.add(1);
        st.add(1);
        st.add(2);
        System.out.println(st);         // no change 

        st.remove(2);
        
        st.add(48);
        st.add(15);
        st.add(25);
        System.out.println(st);        // Sorted in asceding order
        
    }
    
    public static void main(String[] args) {
        HashSet<Integer> st=new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st);
        st.add(1);
        st.add(1);
        st.add(2);
        System.out.println(st);         // no change 

        st.remove(2);
        System.out.println(st.contains(1));
        System.out.println(st.size());
        
        st.add(48);
        st.add(15);
        st.add(25);
        System.out.println(st);        // random order 
        

        System.out.println("LinkedHashSet:");
        LinkedHashSetEx();

        System.out.println("TreeSet:");
        TreeSetEx();
    }
}
