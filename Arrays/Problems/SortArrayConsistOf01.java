
/* 
*
 *  Sort given array which consist of only 1 and 0, without using Arrays.sort method 
 * 
 * In One traversal
 */
import java.util.Scanner;

public class SortArrayConsistOf01 {
  static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  static void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static void sortArray(int arr[]) {
    int n = arr.length;
    int left = 0, right = n - 1;

    while (left < right) {
      if (arr[left] == 1 && arr[right] == 0) {
        swap(arr, left, right);
        left++;
        right--;
      }
      if (arr[left] == 0) {
        left++;
      }
      if (arr[right] == 1) {
        right--;
      }
    }
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
    System.out.println("original Array:");
    printArray(arr);
    sortArray(arr);
    System.out.println("Sorted array");
    printArray(arr);

  }
}
