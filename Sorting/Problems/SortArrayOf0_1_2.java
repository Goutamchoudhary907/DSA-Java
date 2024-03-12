public class SortArrayOf0_1_2 {

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void sort(int arr[]) {
        int low = 0, mid = 0, high = arr.length - 1;

        // explore the unknown region
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 0, 0, 1, 1, 2, 0, 1, 0 };
        sort(arr);
        print(arr);
    }
}

// TC=o(n)