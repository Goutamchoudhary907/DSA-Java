import java.util.Scanner;

public class GenerateSpiralMatrix {
    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiral(int n) {
        int arr[][] = new int[n][n];
        int current = 1;
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        while (current <= n * n) {
            // print topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && current <= n * n; j++) {
                arr[topRow][j] = current++;
            }

            topRow++;

            // rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && current <= n * n; i++) {
                arr[i][rightCol] = current++;

            }

            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && current <= n * n; j--) {
                arr[bottomRow][j] = current++;

            }

            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && current <= n * n; i--) {
                arr[i][leftCol] = current++;

            }

            leftCol++;

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = Sc.nextInt();
        Sc.close();
        int arr[][] = generateSpiral(n);
        System.out.println("Spiral Matrix:");
        printArray(arr);
    }
}
