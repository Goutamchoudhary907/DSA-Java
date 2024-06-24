import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsBT {
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
       } 
       public void insertArray(int arr[]){
        for (int i = 0;i <arr.length;i++) {
             this.insert(arr[i]);
        }
       }
       public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
       }

     public static List<Double> averageOfLevels(Node node) {
      List<Double> result=new ArrayList<>();

      if(node==null){
        return result;
      }

      Queue<Node> queue=new LinkedList<>();
      queue.offer(node);

       while (!queue.isEmpty()) {
        int levelSize=queue.size();
        double averageLevel=0;
        for (int i = 0;i < levelSize;i++) {
        Node currNode= queue.poll();
        averageLevel +=currNode.value;
        if(currNode.left !=null){
            queue.offer(currNode.left);
        }
        if(currNode.right !=null){
            queue.offer(currNode.right);
        }
        }
        averageLevel=averageLevel / levelSize;
        result.add(averageLevel);
       }
      return result;
     }

     public void display(){
        display(root,0);
    }

    private void display(Node node, int level){
        if(node==null){
            return;
        }
        display(node.right,level+1);
      if(level!=0){
        for (int i = 0;i < level-1;i++) {
          System.out.print("|\t");   
        }
        System.out.println("|------>" +node.value);
      } else{
        System.out.println(node.value);
      }
      display(node.left, level+1);
    }

     public static void main(String[] args) {
        AverageOfLevelsBT tr=new AverageOfLevelsBT();
        int arr[]={3,9,20,15,7};
        tr.insertArray(arr);
            
         tr.display();
         List<Double> res= averageOfLevels(tr.root);
         System.out.println(res);
     }
}
