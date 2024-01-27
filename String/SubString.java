public class SubString {
    public static void main(String[] args) {
        String str="abcde";

        // first index included , end index is not included  
        System.out.println(str.substring(0,3));

        // print from 2 index , it print rest of the string from the given index
        System.out.println(str.substring(2));

        String s="Physics";
        for(int j=2;j<4;j++) {
            System.out.print(s.substring(j));
        }
    }
}
