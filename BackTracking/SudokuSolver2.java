public class SudokuSolver2 {
    static int check=0;
        public void solveSudoku(char[][]board){
            solve(board, 0, 0);
            check=0;
          }
    
        public static void solve(char[][] board, int row, int col) {
            int n=board.length;
            if(row==n){          // here board is full and perfect
             check=1;
             return;   
            }
          else  if(board[row][col]!='.')  {   //call
             if(col!= n-1)  solve(board, row, col+1);
             else solve(board, row+1,0);
            } 
            else {        // cell ='.'
             for (char ch= '1';ch <='9';ch++) {
                  if(isValid(board,row,col,ch)) {
                    board[row][col] =ch;
                    if(col!= n-1)  solve(board, row, col+1);
                    else solve(board, row+1,0);
                    if(check==1) return;
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
           // check 3x3
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