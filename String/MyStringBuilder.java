import java.util.Scanner;

public class MyStringBuilder {
    public static void main(String[] args) {

         Scanner Sc =new Scanner(System.in); 
         System.out.println("Enter string:");
         StringBuilder s=new StringBuilder(Sc.nextLine());
         System.out.println(s);  Sc.close();

        StringBuilder str = new StringBuilder("Hello");

        str.append("World");
        System.out.println(str);

        str.setCharAt(0, 'm');
        System.out.println(str);

        StringBuilder gtr = new StringBuilder("Hello");

        System.out.println(gtr);
        gtr.insert(1, 'y');
        System.out.println(gtr);

        gtr.deleteCharAt(0);
        System.out.println(gtr);

        StringBuilder sb = new StringBuilder("Physics");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        sb.reverse();

        sb.delete(2, 4);
        System.out.println(sb);
    }
}
