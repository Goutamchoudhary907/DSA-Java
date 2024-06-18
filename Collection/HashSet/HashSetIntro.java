import java.util.HashSet;

public class HashSetIntro {
    public static void main(String[] args) {
        
        HashSet<String> st=new HashSet<>();
        st.add("James");
        st.add("Scott");
        st.add("James");

        System.out.println(st);
        System.out.println(st.contains("James"));
        st.remove("James");
        System.out.println(st.contains("James"));

        st.add("Mark");
        for(String s:st){
            System.out.print(s+" ");
        }
    }
}
