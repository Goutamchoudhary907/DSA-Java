import java.util.Scanner;

public class AdditionOfMatrix {

    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void addition(int a[][], int r1, int c1, int b[][], int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong input -Addition not possible ");
            return;
        } else {
            int sum[][] = new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    sum[i][j] = a[i][j] + b[i][j];
                }
            }
            System.out.println("Sum of matrix 1 and 2:");
            printArray(sum);
        }

    }

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of martix 1:");
        int r1 = Sc.nextInt();
        int c1 = Sc.nextInt();

        int a[][] = new int[r1][c1];
        System.out.println("Enter matrix values:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = Sc.nextInt();
            }
        }

        System.out.println("Enter number of rows and columns of martix 2:");
        int r2 = Sc.nextInt();
        int c2 = Sc.nextInt();

        int b[][] = new int[r2][c2];
        System.out.println("Enter matrix values:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = Sc.nextInt();
            }
        }
            Sc.close();
            System.out.println("Matrix 1:");
            printArray(a);
            System.out.println("Matrix 2:");
            printArray(b);

            addition(a, r1, c1, b, r2, c2);

       
    }
}