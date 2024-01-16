import java.util.Scanner;

public class PrintSpiral {
    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiral(int arr[][], int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElements = 0;
        while (totalElements < r * c) {
            // print topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && totalElements< r*c; j++) {
                System.out.print(arr[topRow][j] + " ");
                totalElements++;
            }

            topRow++;

            // rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElements< r*c; i++) {
                System.out.print(arr[i][rightCol] + " ");
                totalElements++;
            }

            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && totalElements< r*c; j--) {
                System.out.print(arr[bottomRow][j] + " ");
                totalElements++;
            }

            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElements< r*c; i--) {
                System.out.print(arr[i][leftCol] + " ");
                totalElements++;
            }

            leftCol++;

        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r = Sc.nextInt();
        System.out.println("Enter number of columns:");
        int c = Sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter " + r * c + " elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = Sc.nextInt();
            }
        }
        Sc.close();

        System.out.println("Input array:");
        printArray(arr);
        System.out.println("Spiral order:");
        printSpiral(arr, r, c);
    }
}