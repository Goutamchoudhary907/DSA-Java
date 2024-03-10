public class CountSort {
    static int findMax(int arr[]) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void BasicCountSort(int arr[]) {
        int max = findMax(arr);
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++) {
            count[arr[i]] ++;
        }
        int k=0;
        for(int i=0;i<count.length;i++) {
            for(int j=0;j<count[i];j++) {
                arr[k++]=i;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 2, 2, 5 };
        System.out.println("Array before sorting:");
        print(arr);
        BasicCountSort(arr);
        System.out.println("Array after sorting:");
        print(arr);
    }
}
