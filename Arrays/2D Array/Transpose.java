import java.util.Scanner;

public class Transpose {
    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] transpose(int arr[][] , int r ,int c) {
        int ans[][] =new int [c][r];                      // because now number of rows = number of columns

        for(int i=0;i<c;i++) {
            for(int j=0;j<r;j++) {
                ans[i][j] = arr[j][i];               // swap row with column
            }                                        // ans [2][1] = arr[1][2]
        }
        return ans;
    }

    static void transposeInPlace(int arr[][] , int r ,int c) {
        for(int i=0;i<c;i++) {
            for(int j=i;j<r;j++) {                                  // j=i because if j=0 we swap elements two time
               int temp =arr[i][j];                                 // only need to swap upper traingle with lower traingle
               arr[i][j] =arr[j][i];                                // this method only work in square matrix 
               arr[j][i] =temp;

            }
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

        System.out.println("Original array:");
        printArray(arr);

        int ans [][] =transpose(arr, r, c);
        System.out.println("Transpose of given matrix:");
        printArray(ans);
        // transposeInPlace(arr, r, c);
        // printArray(arr);
    }
}
