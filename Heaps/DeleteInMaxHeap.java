public class DeleteInMaxHeap {
    private static int[] heap;
    private static int n; 

    public DeleteInMaxHeap(int capacity){
        heap =new int[capacity+1];
        n=0;
    }
    public void insert(int x){
        if(n==heap.length-1) {
            reSize(2 * heap.length);
        }
        n++;
        heap[n]=x;
        swap(n);
    }

    private void swap(int k){
        while (k>1 && heap[k/2] < heap[k]) {
            int temp=heap[k];
            heap[k]=heap[k/2];
            heap[k/2]=temp;
            k=k/2;                // as we need to place the new inserted value at correct position 
        }
    }
    private static void reSize(int capacity){
        int[] temp=new int[capacity];
        for (int i = 0;i < heap.length;i++) {
            temp[i]=heap[i]; 
        }
        heap=temp;
    }

    public static void print(){
        for (int i = 1;i <=n;i++) {
             System.out.print(heap[i] +" ");
        }
        System.out.println();
    }

    public static int deleteMax(){
        int max=heap[1];
        swap(1,n);
        n--;
        sink(1);
        if(n >0 && (n==(heap.length-1) /4 )) {
            reSize(heap.length/2);
        }
        return max;
    }
    private static void swap(int a , int b){
        int temp=heap[a];
        heap[a]=heap[b];
        heap[b]=temp;
    }
    
    private static void sink(int k){
        while(2*k <=n){
            int j=2*k;
            if(j<n && heap[j] < heap[j+1]){
                j++;
            }
            if(heap[k] >= heap[j]){
                break;
            }
            swap(k, j);
            k=j;
        }
    }

    public static void main(String[] args) {
        DeleteInMaxHeap hp=new DeleteInMaxHeap(4);
        hp.insert(4);
        hp.insert(5);
        hp.insert(2);
        hp.insert(6);
        hp.insert(1);
        hp.insert(3);
        hp.insert(12);
        hp.insert(9);
        print();
        System.out.println( deleteMax());
        System.out.println( deleteMax());
        print();
    }
}
