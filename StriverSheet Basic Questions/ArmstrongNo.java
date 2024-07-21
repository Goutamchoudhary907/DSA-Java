public class ArmstrongNo {
    static String armstrongNumber(int n) {
      String ans=Integer.toString(n);
       int res=0;
      for(int i=0;i<ans.length();i++){
        int num=ans.charAt(i);
        int power= (int)Math.pow(num, 3);
       System.out.println(power); 
      }
      if(res==n) return "true";
      else return "false";
    }
    public static void main(String[] args) {
         int n=153;
         System.out.println(armstrongNumber(n));
    }
}
