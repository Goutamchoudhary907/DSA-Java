public class FourDirectionMazePath {
    public static void printPath(int stRow, int stCol, int endRow, int endCol ,String s, boolean [][] isvisited) {
        if(stRow<0 || stCol<0) return;
        if(stRow>endRow || stCol>endCol) return;  
        if(isvisited[stRow][stCol]==true) return;      
        if(stRow==endRow &&  stCol==endCol) {
            System.out.println(s);
            return;
        }
        isvisited[stRow][stCol]=true;
          // go right
          printPath(stRow, stCol+1, endRow, endCol,s+"R",isvisited);
        // go down 
        printPath(stRow+1, stCol, endRow, endCol, s+"D", isvisited);
         // go left
         printPath(stRow, stCol-1, endRow, endCol, s+"L",isvisited);
         // go up
          printPath(stRow-1, stCol, endRow, endCol,s+"U",isvisited);
          isvisited[stRow][stCol]=false;
    }
    public static void main(String[] args) {
        int rows=3 , cols=3;
        boolean [][] isvisited=new boolean[rows][cols];
        printPath(0,0,rows-1,cols-1,"",isvisited);
    }

   
}
