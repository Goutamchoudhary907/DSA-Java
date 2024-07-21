public class DataTypesSize {

    static int dataTypeSize(String str) {

        switch (str) {
            case "Character":
               return Character.SIZE/8;
                
            case "Integer":
            return Integer.SIZE/8;
        
            case "Long":
            return Long.SIZE/8;
             
            case "Double":
            return Double.SIZE/8;
              
            case "Float":
            return Float.SIZE/8;
             

            default:
            return -1;
             
        }
    }

    public static String compareNM(int n, int m) {
        if(n <m) {
           return "lesser";
        }
        else if(n==m){
          return "equal";
        }
        else{
            return "greater";
        }
    }
public static void main(String[] args) {
    String str="Integer";
    System.out.println(dataTypeSize(str));

    System.out.println(compareNM(5, 6));
}
}
