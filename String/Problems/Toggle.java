import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter String :");
        StringBuilder str=new StringBuilder(Sc.nextLine());
        System.out.println(str); Sc.close();


        for(int i=0;i<str.length();i++) {
            boolean flag =true;             // true means assume capital letter 
            char ch =str.charAt(i);         // A
            if(ch == ' ') continue;
            int asci=(int) ch;              // 65

            if (asci >=97) {                // if small
                flag=false;
            }
            if (flag==true) {              // if capital
                asci +=32;
                char dh=(char)asci;       //a
                str.setCharAt(i, dh);
            }
           else {                         // small 
            asci -=32;
            char dh=(char) asci;
            str.setCharAt(i, dh);
           }
        }
       System.out.println(str); 
    }
}
