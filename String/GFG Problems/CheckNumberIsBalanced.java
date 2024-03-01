public class CheckNumberIsBalanced {
   static Boolean balancedNumber(String N)
    {
       int sumleft=0, sumright=0;
       for(int i=0;i<N.length()/2;i++) {
        sumleft +=N.charAt(i);
       }
       for(int i=N.length()-1;i>N.length()/2;i--) {
       sumright +=N.charAt(i);
       }
       if(sumleft==sumright) {
        return true;
       }
       return false;
       }
    
    public static void main(String[] args) {
        String s="1234007";
        System.out.println(balancedNumber(s));
    }
}
