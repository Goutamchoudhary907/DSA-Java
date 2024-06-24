import java.util.*;
public class LevelOrderTraversal {
    
    public class  Node {
     int value;
     private int height;
     Node left , right;
     Node(int value){
        this.value=value;
     }    
    }
     Node root;
     public void insertSortedArray(int arr[]){           // TC =O(n * log n)
        insertSortedArray(arr,0,arr.length);
       }

       private void insertSortedArray(int arr[], int start, int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        this.insert(arr[mid]);
        insertSortedArray(arr, start,mid);
        insertSortedArray(arr,mid+1,end);        
       }
       public void insert(int value){
        root=insert(value,root);
       }

       private Node insert(int value , Node node){
         if(node==null){
            node =new Node(value);
            return node;
         }

        if(value < node.value){
            node .left= insert(value, node.left);
        }
        if(value >node.value){
            node .right= insert(value, node.right);
        }
        node.height=Math.max(height(node.left),height(node.right)) +1;
        return node;
       } public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
       }

     public List<List<Integer>> levelOrder(Node node) {
      List<List<Integer>> result=new ArrayList<>();

      if(node==null){
        return result;
      }
      Queue<Node> queue=new LinkedList<>();
      queue.offer(node);

       while (!queue.isEmpty()) {
        int levelSize=queue.size();
        List<Integer> currLevel=new ArrayList<>(levelSize);
        for (int i = 0;i < levelSize;i++) {
        Node currNode= queue.poll();
        currLevel.add(currNode.value);   
        if(currNode.left !=null){
            queue.offer(currNode.left);
        }
        if(currNode.right !=null){
            queue.offer(currNode.right);
        }
        }
        result.add(currLevel);
       }
      return result;
     }

     
     public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11};
        LevelOrderTraversal tree=new LevelOrderTraversal();
         tree.insertSortedArray(arr);
         List<List<Integer>> res= tree.levelOrder(tree.root);
         System.out.println(res);
     }
}
