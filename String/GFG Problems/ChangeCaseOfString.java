public class ChangeCaseOfString {
      static  String modify(String s){
            String ans="";
            int first=(int)s.charAt(0);
            if(first>=97 && first <=122) {
              ans = s.toLowerCase();
            }
            else {
                 ans =s.toUpperCase();
            }
            return ans;
        }
    public static void main(String[] args) {
        String s="AbCD";
        System.out.println(modify(s));
    }
    }

