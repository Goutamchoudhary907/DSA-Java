public class ContinueWithWhile {
    public static void main(String[] args) {
        
        int num=1;
        while (num <= 50) {
            
            if (num % 3 == 0) {
                num++;                         // Here we need to write num++ in if Block also because if num is a multiple
                                               // of 3 condition meet for continue and it does not increment num as 4 num reamins 
                                               //  3 and it continuously check for 3 
                continue;
            }
            System.out.println(num);
            num++;

        }
    }
}
