import java.util.Scanner;

public class Rotate90Degree {

    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void reverseArray(int arr[]) {
        int i = 0, j = arr.length-1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotate(int arr[][], int n) {
        transposeInPlace(arr, n, n);
        for (int i = 0; i < n; i++) {
            reverseArray(arr[i]);
        } 
    }

    static void transposeInPlace(int arr[][], int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r = Sc.nextInt();
        System.out.println("Enter number of columns:");
        int c = Sc.nextInt();

        if(r != c) {
            System.out.println("Enter same rows and column - Rotation not possible in non square matrix");
        }
        else{
            
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

        rotate(arr, r);
        System.out.println("Rotated array:");
        printArray(arr);
    }
}
}