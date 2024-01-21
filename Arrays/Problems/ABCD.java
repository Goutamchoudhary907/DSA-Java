import java.util.Scanner;

public class ABCD {
    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void rotate(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = 0;
                temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length / 2; j++) {
                int temp = 0;
                temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r = Sc.nextInt();
        System.out.println("Enter number of columns:");
        int c = Sc.nextInt();

        if (r != c) {
            System.out.println("Enter same rows and column - Rotation not possible in non square arr");
        } else {

            int arr[][] = new int[r][c];
            System.out.println("Enter " + r * c + " elements:");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[i][j] = Sc.nextInt();
                }
            }

            Sc.close();

            System.out.println("Original:");
            printArray(arr);

            rotate(arr);
            System.out.println("After rotating");
            printArray(arr);

        }
    }
}