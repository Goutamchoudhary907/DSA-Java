import java.util.Scanner;
public class ToggleInStringClass {
public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter String :");
         String str= Sc.nextLine();
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
                // str.setCharAt(i, dh);   because setCharAt mehtod is not defined in string class  
                str=str.substring(0, i) + dh + str.substring(i+1); 
            }
           else {                         // small 
            asci -=32;
            char dh=(char) asci;
            // str.setCharAt(i, dh);
            str=str.substring(0, i) + dh + str.substring(i+1); 
           }
        }
       System.out.println(str); 
    }
}


