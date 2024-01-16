import java.util.Scanner;

public class ReverseEachRow {
    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] reverse(int arr[][], int r, int c) {
        int ans[][] = new int[r][c];
        for (int i =0; i <r; i++) {
            for (int j= 0; j<c; j++) {
            ans[i][j] = arr[i][c-j-1];
            }
        }
        return ans;
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

        System.out.println("Original array:");
        printArray(arr);

        int ans[][] = reverse(arr, r, c);

        System.out.println("Reverse array:");
        printArray(ans);
    }
}