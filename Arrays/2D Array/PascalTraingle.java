import java.util.Scanner;

public class PascalTraingle {
    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j<=i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int [][] pascal(int n) {
        int arr[][] =new int [n][];

        for(int i=0 ;i<n;i++){
            arr[i] =new int[i+1];               // Number of columns in ith row is i+1; 
            arr[i][0] =arr[i][i]=1;
            for(int j=1;j<i;j++) {
            arr[i][j] = arr[i-1][j-1] + arr[i-1] [j];
            }
        }
        return arr;
        }

    public static void main(String[] args) {
        
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter n:");
        int n=Sc.nextInt();
     Sc.close();

        System.out.println("Pascal Triangle:");
        int arr[][] = pascal(n);
        printArray(arr);
    }
}
