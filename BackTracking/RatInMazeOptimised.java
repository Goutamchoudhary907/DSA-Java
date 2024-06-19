public class RatInMazeOptimised {
    public static void printPath(int stRow, int stCol, int endRow, int endCol, String s, int[][] maze) {
        if (stRow < 0 || stCol < 0) return;
        if (stRow > endRow || stCol > endCol) return;
        if (stRow == endRow && stCol == endCol) {
            System.out.println(s);
            return;
        }
        if (maze[stRow][stCol] == 0)
            return; // blocked
        if (maze[stRow][stCol] == -1)
            return; // this was already visited
        maze[stRow][stCol] = -1;
        // go right
        printPath(stRow, stCol + 1, endRow, endCol, s + "R", maze);
        // go down
        printPath(stRow + 1, stCol, endRow, endCol, s + "D", maze);
        // go left
        printPath(stRow, stCol - 1, endRow, endCol, s + "L", maze);
        // go up
        printPath(stRow-1, stCol, endRow, endCol,s+"U",maze);
        maze[stRow][stCol] = 1;
    }

    public static void main(String[] args) {
        int rows = 3, cols = 4;
        int[][] maze = { { 1, 0, 1, 1 },
                         { 1, 1, 1, 1 },
                         { 1, 1, 0, 1 }
        };
        printPath(0, 0, rows - 1, cols - 1, "", maze);
    }
}
