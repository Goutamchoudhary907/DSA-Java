import java.util.*;

public class HeapsIntro<T extends Comparable <T>> {

    public ArrayList<T> list;
    public HeapsIntro(){
        list=new ArrayList<>();
    }
    public void swap(int i , int j){
        T temp=list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
       public int parent(int idx){
        return (idx-1) /2;
       }
       public int left(int idx){
        return idx * 2+1;
       }
       public int rigth(int idx){
        return idx *2 +2 ;
       }

       public void insert(T value){
        list.add(value);
        upheap(list.size()-1);
       }

       private void upheap(int idx){
        if(idx==0) return;
        int p=parent(idx);
        if(list.get(idx) . compareTo(list.get(p)) < 0){
            swap(idx, p);
            upheap(p);
        }
       }

       public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from an empty heap");
        }
        T temp=list.get(0);

        T last=list.remove(list.size()-1);
        if( !list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }
        return temp;
       }

       private void downheap(int idx){
        int min=idx;
        int left=left(idx);
        int right=rigth(idx);

        if(left < list.size() && list.get(min). compareTo(list.get(left)) > 0){
            min=left;
        } 
        if(right < list.size() && list.get(min). compareTo(list.get(right)) > 0){
            min=right;
        } 
        if(min!=idx){
            swap(min, idx);
            downheap(min);
        }
       }

       public ArrayList <T> heapSort() throws Exception{
        ArrayList <T> data=new ArrayList<>();
        while( !list.isEmpty()){
            data.add(this.remove());
        }
        return data;
       }
       public static void main(String[] args) throws Exception{
         HeapsIntro<Integer> heap=new HeapsIntro<>();

         heap.insert(34);  
         heap.insert(45);  
         heap.insert(22);  
         heap.insert(89);  
         heap.insert(76);
       
        //  System.out.println(heap.remove());   
     
         ArrayList<Integer> list=heap.heapSort();

         System.out.println(list);
       }
}
