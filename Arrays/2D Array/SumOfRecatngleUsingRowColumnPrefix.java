import java.util.Scanner;

public class SumOfRecatngleUsingRowColumnPrefix {

    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void findPrefixarr(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
        // traverse vertically to calculate column-wise sum
        for (int j = 0; j < c; j++) {              // fix column 
            for (int i = 1; i < r; i++) {          // traverse row and add 
                arr[i][j] += arr[i - 1][j];         // this time column is same row is i-1

            }
        }
    }

    static int sum(int arr[][], int l1, int l2, int r1, int r2) {
        int ans = 0, sum = 0, up = 0, left = 0, leftUp = 0;
        findPrefixarr(arr);
        sum = arr[l2][r2];           // prefix sum of matrix till given boundaries
        if (r1 >= 1) {
            left = arr[l2][r1 - 1];                // minus till previous row
        }
        if (l1 >= 1) {
            up = arr[l1 - 1][r2];                 // minus till previous col
        }
        if (l1 >= 1 && r1 <= 1) {
            leftUp = arr[l1 - 1][r1 - 1];          // add the part which is subtracted two times
        }
        ans = sum - up - left + leftUp;
        return ans;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns :");
        int r = Sc.nextInt();
        int c = Sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter " + r * c + " elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = Sc.nextInt();
            }
        }
        System.out.println("Enter start row l1:");
        int l1 = Sc.nextInt();
        System.out.println("Enter end row l2:");
        int l2 = Sc.nextInt();
        System.out.println("Enter start column r1:");
        int r1 = Sc.nextInt();
        System.out.println("Enter end column r2:");
        int r2 = Sc.nextInt();
        Sc.close();
        System.out.println("Input array:");
        printArray(arr);
        int sum = sum(arr, l1, l2, r1, r2);
        System.out.println("Sum:" + sum);
    }
}