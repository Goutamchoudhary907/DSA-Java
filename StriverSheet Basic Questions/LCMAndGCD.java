public class LCMAndGCD {
    static Long[] lcmAndGcd(Long A , Long B) {
        Long[] arr=new Long[2];
       Long gcd=GCD(A, B);
       Long lcm= (A*B) /gcd;
       arr[0]=lcm;
       arr[1]=gcd;
       return arr;
    }

    public static Long GCD(Long A, Long B){
      if(B==0) return A;
      return GCD(B, A%B);
    }
    public static void main(String[] args) {
        Long A=14L;
        Long B=8L;
         Long[] arr=lcmAndGcd(A, B);
      for(int i=0;i<2;i++){
        System.out.print(arr[i] +" ");
      }
    }
}
