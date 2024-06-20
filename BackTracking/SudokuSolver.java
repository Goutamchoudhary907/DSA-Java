public class SudokuSolver {

    public void solveSudoku(char[][]board){
        char[][] grid=new char[9][9];
        solve(board, 0, 0,grid);
        for (int i = 0;i < 9;i++) {
            for (int j = 0;j < 9;j++) {
             board[i][j]=grid[i][j];
            }
       }  
      }

    public static void solve(char[][] board, int row, int col, char[][] grid) {
        int n=board.length;
        if(row==n){
            for (int i = 0;i < n;i++) {
                 for (int j = 0;j < n;j++) {
                  grid[i][j]=board[i][j];
                 }
            }
         return;   
        }
      else  if(board[row][col]!='.')  {   //call
         if(col!= n-1)  solve(board, row, col+1,grid);
         else solve(board, row+1,0,grid);
        } 
        else {        // cell ='.'
         for (char ch= '1';ch <='9';ch++) {
              if(isValid(board,row,col,ch)) {
                board[row][col] =ch;
                if(col!= n-1)  solve(board, row, col+1,grid);
                else solve(board, row+1,0,grid);
                board[row][col] ='.';              // backTracking
              }
         }
        }
     }
     private static boolean isValid(char[][] board, int row, int col,char num) {
        int n=board.length;
         // check row 
       for (int j = 0;j < n;j++) {
            if(board[row][j]==num) return false;
       }
       // check col
       for (int i = 0;i < n;i++) {
           if(board[i][col]==num) return false; 
       }
       // check 3x3 grid
       int stRow=row/3*3;
       int stCol=col/3*3;
       for (int i = stRow;i < stRow+3;i++){
         for (int j = stCol;j <stCol+3;j++) {
            if(board[i][j]==num) return false;  
         }    
       }
       return true;
     }
 
     public static void main(String[] args) {
      
     }
}
