public class UnaryOp {
    public static void main(String[] args) {
        
        int p=5 , q=5;
       
        System.out.println(p++);       // p=5
        System.out.println(p);         // p=6
 
        System.out.println(++q);       // q=6
        System.out.println(q);         // q=6

        int x= p++;                    // x=6 first assignment to x then increament now p=7
        int y= ++q ;                   // y=7 first increament then assign and also q=7

        System.out.println(x);
        System.out.println(y);


        System.out.println(p);           // p=7       
        System.out.println(q);           // q=7
    }
}
