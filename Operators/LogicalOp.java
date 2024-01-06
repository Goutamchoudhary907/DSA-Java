public class LogicalOp {
    public static void main(String[] args) {
        int p=15 , q=10 , r=5 ;

        // && Operator
        System.out.println((p>q) && (p>r) ); // true
        System.out.println((p>q) && (p<r) ); // False
       

        // || Operator
       System.out.println((r<q) || (p<q));   // true
       System.out.println((p>q) || (q<r));   //true
       System.out.println((p<q) || (q<r));   // false

       // ! Operator
       System.out.println(!(p==q));          // true
       System.out.println(!(p>q));           //false
    }
}
