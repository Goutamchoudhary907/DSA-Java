import java.util.Arrays;
import java.util.Scanner;

public class ContainsDuplicate {

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static boolean containsDuplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean containsDuplicate2(int arr[]) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size = Sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Elements of Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Sc.nextInt();
        }
        Sc.close();
        boolean result = containsDuplicate(arr);
        System.out.println("Result from 1st method:" + result);

        boolean result2 = containsDuplicate2(arr);
        System.out.println("Result from 2nd method:" + result2);

    }
}
