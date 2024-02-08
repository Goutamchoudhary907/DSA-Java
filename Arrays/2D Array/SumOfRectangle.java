import java.util.Scanner;

public class SumOfRectangle {

    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int sum(int arr[][], int l1, int l2, int r1, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    static void findPrefixarr(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
    }

    static int sum2(int arr[][], int l1, int l2, int r1, int r2) {            // this method is by using prefix sum 
        int sum = 0;
        findPrefixarr(arr);
        for (int i = l1; i <= l2; i++) {
            if(r1>=1) {                            // check if r1 is 0 
        sum += arr[i][r2] -arr [i][r1-1];          // then we dont need to subactract anything 
        } else{
            sum += arr[i][r2];                     // directly return without subtract r1-1
        }
    }
        return sum;
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
        System.out.println("Sum 2:" + sum2(arr, l1, l2, r1, r2));
    }
}