import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicate {
    static int findDuplicate(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i+1]) {
                    return arr[i];
                }
            }
        return 0;
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
        System.out.println(findDuplicate(arr));
    }
}
