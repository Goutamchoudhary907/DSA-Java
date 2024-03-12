//Given an array where all elements are sorted ExceptTwo swapped Elements

public class SortedArrayExceptTwoElements {
  static void sortArr(int arr[]) {
    int n = arr.length;
    int x = -1, y = -1;

    if(n<=1) return;
    // process all adjecent elements
    for (int i = 1; i < n; i++) {
      if (arr[i - 1] > arr[i]) {
        if (x == -1) { // if first conflict
          x = i - 1;
          y = i;
        } else { // second conflict
          y = i;
        }
      }
    }

    // swap x,y in arr
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  public static void main(String[] args) {
    int arr[] = { 10, 5, 6, 7, 8, 9, 3 };
    sortArr(arr);
    for(int i:arr) {
      System.out.print(i+" ");
    }
  }
}