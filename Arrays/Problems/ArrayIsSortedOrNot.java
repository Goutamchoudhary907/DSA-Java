import java.util.Scanner;

public class ArrayIsSortedOrNot {
    
    static boolean isSorted(int [] arr) 
    {
        boolean check=true;
        for(int i=1;i<arr.length;i++) {
            if ( arr[i] < arr[i-1]) {
                check =false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size = Sc.nextInt();

        int arr [] =new int [size];

        System.out.println("Enter Elements of Array:");
        for(int i=0;i<arr.length;i++) {
           arr[i]= Sc.nextInt();
        }
        Sc.close();
        boolean temp =isSorted(arr);

        if (temp==true) {
            System.out.println("Array is sorted");
        }
        else{
    System.out.println("Array is not sorted");
        }
    }
}
