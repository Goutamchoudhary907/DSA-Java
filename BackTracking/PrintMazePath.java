public class PrintMazePath {
    public static void printPath(int stRow, int stCol, int endRow, int endCol ,String s) {
        if(stRow>endRow || stCol> endCol) return;
        if(stRow==endRow &&  stCol==endCol) {
            System.out.println(s);
            return;
        }
        // go down 
        printPath(stRow+1, stCol, endRow, endCol, s+"D");
       // go right
        printPath(stRow, stCol+1, endRow, endCol,s+"R");
    }
    public static void main(String[] args) {
        int rows=3 , cols=3;
        printPath(1,1,rows,cols,"");
    }

   
}
