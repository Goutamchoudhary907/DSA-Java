public class QuickSort {
    static void print(int arr[]) {
        for(int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void swap(int arr[] ,int x ,int y) {

        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    static void quickSort(int arr[] ,int st, int end) {
      if(st>=end) return;
      int pi=partition(arr,st,end);
      quickSort(arr, st, pi-1);
      quickSort(arr, pi+1, end);
    }

    static int partition(int arr[], int st , int end) {
        int pivot=arr[st];
        int count=0;
        for(int i=st+1 ;i<=end;i++) {
            if(arr[i] <= pivot) count++;
        }
        int pivotIdx=st+count;
        swap(arr,st,pivotIdx);

        int i=st , j=end;
        // elements lesser or equal are in left , greater are in right side of pivot
        while(i<pivotIdx && j>pivotIdx) {
            while(arr[i] <=pivot) i++;
            while(arr[j] > pivot) j--;

            if(i< pivotIdx && j>pivotIdx) {
             swap(arr, i, j);
             i++;
             j--;
            }
        }

        return pivotIdx;
    }
    public static void main(String[] args) {
        int arr[]={6,6,3,1,5,5,4};
        System.out.println("Array before sorting:");
        print(arr);
    quickSort(arr, 0, arr.length-1);
        System.out.println("Array after sorting:");
        print(arr);
    }
}
