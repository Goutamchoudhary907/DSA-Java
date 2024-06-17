import java.util.LinkedList;

public class HashMapImplementation {
    
    static class MyHashMap<K,V> {
        public static final int DEFAULT_CAPACITY=4;
        public static final float DEFAULT_LOAD_FACTOR=0.75f;
        private class Node{
            K key;
            V value;

            Node(K key , V value) {
                this.key=key;
                this.value=value;
            }
        }
   
        private int n;  // number of entries in map 
        private LinkedList<Node> [] buckets;

        @SuppressWarnings("unchecked")
        private void initBuckets(int N) {
            buckets=new LinkedList[N];
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
        }

         private int hashFunc(K key){
            int hc=key.hashCode();
            return Math.abs(hc) % buckets.length;
         }

        // Traverses the ll and looks for a node with key , if found retrun its index otherwise null
         private int searchInBucket(LinkedList<Node> ll,K key ){
         for(int i=0;i<ll.size();i++) {
            if(ll.get(i).key==key) {
                return i;
            }
         }
         return -1; 
         }

          public int capacity(){
            return buckets.length;
          }

          public float loadFactor(){
            return (n*1.0f) / buckets.length;
          }

        public MyHashMap(){
          initBuckets(DEFAULT_CAPACITY);
        }
        public int size(){
          return n;
        }

         private void rehash(){
          LinkedList<Node>[]oldBuckets=buckets;
          n=0;
          initBuckets(oldBuckets.length*2);
          for(var buckets:oldBuckets){
            for(var node:buckets){
                put(node.key,node.value);
            }
          }
         }

        public void put (K key , V value) {
         int bi=hashFunc(key);
         LinkedList<Node> currbucket=buckets[bi];
         int ei=searchInBucket(currbucket, key);
         if(ei==-1) {       // key doesn't exists , we have to insert a new node
          Node node=new Node(key, value);
          currbucket.add(node);
          n++;
         } else {          // update 
         Node currNode=currbucket.get(ei);
         currNode.value=value;
         }

         if(n >=buckets.length*DEFAULT_LOAD_FACTOR) {
            rehash();
         }
        }

        public V get(K key) {
          int bi=hashFunc(key);
          LinkedList<Node> currBucket=buckets[bi];
          int ei=searchInBucket(currBucket, key);
          if(ei !=-1) {          // key exists
          Node currNode=currBucket.get(ei);
          return currNode.value;
          }
          return null;       // key doesn't exist
        }

        public V remove(K key){
            int bi=hashFunc(key);
            LinkedList<Node> currbucket=buckets[bi];
            int ei=searchInBucket(currbucket, key);
            if(ei!=-1) {
            Node currNode=currbucket.get(ei);
            V val=currNode.value;
            currbucket.remove(ei);
            n--;
            return val;
            }
            return null;
        }
    }
    public static void main(String[] args) {
        MyHashMap<String, Integer> mp=new MyHashMap<>();
        mp.put("a", 1);
        mp.put("b", 2);
        System.out.println("Capacity:"+mp.capacity());
        System.out.println("Load:"+mp.loadFactor());
        mp.put("c", 3);
        System.out.println("Size:"+mp.size());
        mp.put("c", 30);
        System.out.println("Size:"+mp.size());

        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("c"));
        System.out.println(mp.get("College"));   

        System.out.println(mp.remove("c"));
        System.out.println(mp.remove("f"));
        System.out.println(mp.size());

        mp.put("x", 60);
        mp.put("y", 70);
        
        System.out.println(mp.get("x"));
        System.out.println(mp.get("y"));

        System.out.println("Capacity:"+mp.capacity());
        System.out.println("Load:"+mp.loadFactor());

    }
}
