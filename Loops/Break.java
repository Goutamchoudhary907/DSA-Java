public class Break {
    public static void main(String[] args) {
        
        int num=1;

        while(true)
        {
            if(num % 5 == 0 && num %7 == 0)                         // Only print first number which is multiple of 5 and also multiple of 7
            {                                                       // Then break (Stop)
                System.out.println("Found ans " + num);
                break;
            }
            num++;
        }
    }
}
