public class RadixSort {
    static int findMax(int arr[]) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static void countSort(int arr[], int place) {
        int n = arr.length;
        int output[] = new int[n];
        int count[] = new int[10];
        for (int i = 0; i < arr.length; i++) { // if arr[i]=105 and place is 1 , we need count[5]++ , if place is 10(tens) ->
                                               // count[0]++
            count[(arr[i] / place) % 10]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    static void radixSort(int arr[]) {
        int max = findMax(arr);

        // apply count sort based on place value
        for (int place = 1; max / place > 0; place *= 10) {
            countSort(arr, place);
        }
    }

    static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 43, 453, 626, 894, 0, 3 };
        System.out.println("Array before sorting:");
        print(arr);
        radixSort(arr);
        System.out.println("Array after sorting:");
        print(arr);
    }
}
