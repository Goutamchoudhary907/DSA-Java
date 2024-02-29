public class GoalParser {
    static String interpret(String command) {
     StringBuilder s=new StringBuilder();
     for(int i=0;i<command.length()-1;i++) {
        if(command.charAt(i)=='G') {
        s.append('G');
        }
     else if(command.charAt(i)=='a') {
            s.append('a');
            s.append('l');
        }
      else if(command.charAt(i)=='(' && command.charAt(i+1)==')') {
      s.append('o');   
    }
     }   
     return s.toString();
    }
    public static void main(String[] args) {
        String command="G()(al)";
        System.out.println(interpret(command));
    }
}
