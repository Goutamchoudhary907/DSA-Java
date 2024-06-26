import java.util.LinkedList;
import java.util.Queue;

public class ElementnextToX {
    public static class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value=value;
        }
    }

    public static Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }
    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value)
            root.left = insertRec(root.left, value);
        else if (value > root.value)
            root.right = insertRec(root.right, value);
        return root;
    }
    public void addArray(int[] arr) {
        for (int value : arr) {
            insert(value);
        }
    }

     public static Node findSuccessor(Node node , int key){
        if(root==null) return null;
        Queue<Node> queue=new LinkedList<>();
      queue.offer(node);

       while (!queue.isEmpty()) {
        Node currNode= queue.poll();
        if(currNode.left !=null){
            queue.offer(currNode.left);
        }
        if(currNode.right !=null){
            queue.offer(currNode.right);
        }
        if(currNode.value==key) {
            break;
        }
       }
      return queue.peek();
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
        int arr[]={35,58,30,7,29,37,20,15,45,50};
        ElementnextToX tr=new ElementnextToX();
        tr.addArray(arr);
        tr.display();
           int key=30;
        Node re=findSuccessor(root,key);
        System.out.printf("Next of %d is %d ", key, re.value);
     }
}
