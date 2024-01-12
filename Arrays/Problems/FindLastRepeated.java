
/*
 * Return the last value that is repeating in this array if no value is repeated return -1
 */
import java.util.Scanner;

public class FindLastRepeated {

  static int lastRepeatedValue(int[] arr) {
    int ans = -1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          ans = arr[i];
        }
      }
    }
    return ans;
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
    int value = lastRepeatedValue(arr);
    if (value > 0) {
      System.out.println("Repeated element is :" + value);
    } else {
      System.out.println("No element is repeated");
    }
  }
}
