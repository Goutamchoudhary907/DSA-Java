// some blocks are blocked we cannot go on that , allowed to go in right or in left 

public class RatInADeadMaze {
    public static void printPath(int stRow, int stCol, int endRow, int endCol ,String s, int[][]maze) {
        if(stRow>endRow || stCol> endCol) return;
        if(stRow==endRow &&  stCol==endCol) {
            System.out.println(s);
            return;
        }
        if(maze[stRow][stCol]==0) return ;
        // go down 
        printPath(stRow+1, stCol, endRow, endCol, s+"D",maze);
       // go right
        printPath(stRow, stCol+1, endRow, endCol,s+"R",maze);
    } 
     public static void main(String[] args) {
        int rows=4 , cols=6;
        int[][] maze={   {1,0,1,1,1,1} ,
                         {1,1,1,1,0,1} ,
                         {0,1,1,1,1,1} ,
                         {0,0,1,0,1,1}
};
        printPath(0,0,rows-1,cols-1,"",maze);
    }
}
