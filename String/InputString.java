import java.util.Scanner;
public class InputString {
public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in) ;
    // System.out.println("Enter String:"); 
    // String s=Sc.next();
    // System.out.println(s);
    System.out.println("Enter String:"); 
    String s2=Sc.nextLine();                   // This take all the inputs even after space 
    System.out.println(s2);
    Sc.close();
}
}
