import java.util.LinkedList;
import java.util.Queue;

public class Traversals {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;
 
        public Node(int value){
          this.value=value;
        }
    }
    private static Node root;

    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
       }
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
    public void preOrder(){
        preOrder(root);
        System.out.println();
    }
    private void preOrder(Node node){
        if(node==null) return;

        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
        System.out.println();
    }
    private void inOrder(Node node){
        if(node==null) return;

        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
        System.out.println();
    }
    private void postOrder(Node node){
        if(node==null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }
  public void display(){
        display(root, "Root node:");
       }
       private void display(Node node, String details){
        if(node==null) return ;
        System.out.println(details+ node.value);
        display(node.left, "Left child of "+ node.value+":");
        display(node.right, "Right child of "+ node.value+":"); 
       }
     
       public void printLevelOrder(){
        printLevelOrder(root);
       }
     private static void printLevelOrder(Node root){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode =q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()) break;
                else q.add(null);
            }else {
                System.out.print(currNode.value+" ");
                if(currNode.left !=null){
                  q.add(currNode.left);
                }
                if(currNode.right !=null){
                    q.add(currNode.right); 
                }
            } 
        }
     }
 public static void main(String[] args) {
    Traversals tr=new Traversals();
    int arr[]={4,8,9,6,7,5,2,0,1,4};
    tr.insertArray(arr);
    tr.display();
    tr.preOrder();
    tr.inOrder();
    tr.postOrder();
    System.out.println("Level order:");
    tr.printLevelOrder();
 }   
}