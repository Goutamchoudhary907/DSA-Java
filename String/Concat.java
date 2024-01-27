public class Concat {
    public static void main(String[] args) {
        String str="abc";
        str+="xyz";
        str+=10;

        System.out.println(str);

        System.out.println("abc"+10 +20);
        System.out.println(10+20+"abc");
}
}