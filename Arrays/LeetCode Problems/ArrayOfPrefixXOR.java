import java.util.Scanner;

public class ArrayOfPrefixXOR {
    static int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        arr[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            arr[i] = pref[i] ^ pref[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size = Sc.nextInt();
        int pref[] = new int[size];
        System.out.println("Enter Elements of Array:");
        for (int i = 0; i < pref.length; i++) {
            pref[i] = Sc.nextInt();
        }
        Sc.close();
        int arr[] =  findArray(pref);
         
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}