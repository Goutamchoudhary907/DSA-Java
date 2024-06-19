public class NQueens {

    private static void nqueen(char[][] board, int row) {
        int n=board.length;
        if(row==n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                System.out.print(board[i][j]);
                }
                System.out.println();
            } System.out.println();
            return;
        }
    for (int j = 0; j < board.length; j++) {
        if(isSafe(board,row,j)) {
            board[row][j]='Q';
            nqueen(board, row+1);
            board[row][j]='X';               // Backtracking
        }
    }
    }
    private static boolean isSafe(char[][] board, int row, int col) {
      // check row
      int n=board.length;
      for (int j=0;j<n;j++) {
           if(board[row][j]=='Q') return false;
      }
       // check col
       for (int i=0;i<n;i++) {
            if(board[i][col]=='Q') return false;
       }
       // check north east
       int i=row , j=col;
       while (i>=0 && j<n) {
        if(board[i][j]=='Q') return false;
        i--;
        j++;
       }
       i=row ;
       j=col;
       // check south east
       while (i<n && j<n) {
        if(board[i][j]=='Q') return false;
        i++;
        j++;
       }
       i=row ;
       j=col;
         // check south west
         while (i<n && j>=0) {
            if(board[i][j]=='Q') return false;
            i++;
            j--;
           }
           i=row ;
           j=col;
            // check north west
         while (i>=0 && j>=0) {
            if(board[i][j]=='Q') return false;
            i--;
            j--;
           }

           return true;
    }
    public static void main(String[] args) {
        int n=4;
        char [][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        nqueen(board,0);
    }
}
