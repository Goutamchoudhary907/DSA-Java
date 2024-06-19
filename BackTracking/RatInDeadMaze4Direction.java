public class RatInDeadMaze4Direction {
    public static void printPath(int stRow, int stCol, int endRow, int endCol ,String s,int[][]maze, boolean [][] isvisited) {
        if(stRow<0 || stCol<0) return;
        if(stRow>endRow || stCol>endCol) return;  
        if(isvisited[stRow][stCol]==true) return;      
        if(stRow==endRow &&  stCol==endCol) {
            System.out.println(s);
            return;
        }
        if(maze[stRow][stCol]==0) return;
        isvisited[stRow][stCol]=true;
          // go right
          printPath(stRow, stCol+1, endRow, endCol,s+"R",maze,isvisited);
        // go down 
        printPath(stRow+1, stCol, endRow, endCol, s+"D",maze, isvisited);
         // go left
         printPath(stRow, stCol-1, endRow, endCol, s+"L",maze,isvisited);
         // go up
          printPath(stRow-1, stCol, endRow, endCol,s+"U",maze,isvisited);
          isvisited[stRow][stCol]=false;
    }
    public static void main(String[] args) {
        int rows=3 , cols=4;
        int[][] maze={   {1,0,1,1} ,
                         {1,1,1,1} ,
                         {1,1,0,1}
};
        boolean[][] isvisited=new boolean[rows][cols];
        printPath(0,0,rows-1,cols-1,"",maze,isvisited);
    }

}
