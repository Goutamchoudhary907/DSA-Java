public class SelectionSort {
    static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // i represent the current index

            // find the minimun element in unsorted part of array
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            // swap current element and min index -> current index i will have correct
            // element
            if(min_index !=i) {
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 4, 5, 1, 2, 100,90};
        selectionSort(arr);
       for(int i:arr) {
        System.out.print(i +" ");
       }
    }
}
