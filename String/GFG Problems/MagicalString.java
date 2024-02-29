public class MagicalString {
    static String magicalString(String S){
        String str=new String();
    for(int i=0;i<S.length();i++) {
     int ch=(int) S.charAt(i);
     int a='z'-ch;
     char cc=(char) a;
     int ccc='a' +cc;
     char cccc=(char)ccc;
     str +=cccc;
    }
    return str;
    }
public static void main(String[] args) {
    String s="varun";
    System.out.println(magicalString(s));
}    
}
