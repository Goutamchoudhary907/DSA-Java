public class MazePath {
    public static int maze(int stRow, int stCol, int endRow, int endCol) {
         
        if(stRow>endRow || stCol> endCol) return 0;
        if(stRow==endRow || stCol==endCol) return 1;
        int downWays=maze(stRow+1, stCol, endRow, endCol);
        int rightWays=maze(stRow, stCol+1, endRow, endCol);
        int totalWays=downWays+rightWays;
        return totalWays;
    }
    public static void main(String[] args) {
        int rows=3 , cols=3;

        int count=maze(1,1,rows,cols);
        System.out.println(count);
    }
}
    
