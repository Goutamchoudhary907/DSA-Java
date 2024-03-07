public class BubbleSortInSortedArray {
    static void sortedBubblesort(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n-1;i++) {
            boolean flag=false;        // has any swapping happened
         for(int j=0;j<n-i-1;j++) {        // Last i elements are already at correct sorted position , so no need to check them 
        
             if(arr[j] > arr[j+1]) {
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                 flag=true; 
             }
         }

         if(flag ==false) {     // have any swap happened in j loop
            return;
         }
        }
         }
         public static void main(String[] args) {
             int arr[]={7,6,5,4,3};
             sortedBubblesort(arr);
             for(int i:arr) {
                 System.out.print(i +" ");
             }
         }
}
