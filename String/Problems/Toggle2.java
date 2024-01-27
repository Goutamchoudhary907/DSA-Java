/*
 * code for toggle if numbers present in string , to skip numbers  
 */

import java.util.Scanner;

public class Toggle2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter String :");
        StringBuilder str = new StringBuilder(Sc.nextLine());
        System.out.println(str);
        Sc.close();

        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;
            int asci = (int) ch;
            if (asci >= 65 && asci <= 90 || asci >= 97 && asci <= 122) {
                if (asci >= 97) {
                    flag = false;
                }
                if (flag == true) {
                    asci += 32;
                    char dh = (char) asci;
                    str.setCharAt(i, dh);
                } else {
                    asci -= 32;
                    char dh = (char) asci;
                    str.setCharAt(i, dh);
                }
            }
        }
        System.out.println(str);
    }
}
