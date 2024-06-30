public class MaxHeap {
    private static int[] heap;
    private static int n;

    public MaxHeap(int capacity){
        heap =new int[capacity+1];
        n=0;
    }
    public boolean isEmpty() {
        return n==0;
    }
    public int size(){
        return n;
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
    private void reSize(int capacity){
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

    public static void main(String[] args) {
        MaxHeap hp=new MaxHeap(3);
        hp.insert(4);
        hp.insert(5);
        hp.insert(2);
        hp.insert(6);
        hp.insert(1);
        hp.insert(3);
        System.out.println(hp.size());
        print();
    }
}
