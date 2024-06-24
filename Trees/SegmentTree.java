public class SegmentTree {
    
    public static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left , right;

        public Node(int startInterval, int endInterval){
            this.startInterval=startInterval;
            this.endInterval=endInterval;
        }
    }
    Node root;
     public SegmentTree(int arr[]){
    this.root=constructTree(arr,0,arr.length-1);
     }

     private Node constructTree(int arr[], int start , int end){
        if(start==end){
      // leaf node
      Node leaf=new Node(start, end);
      leaf.data=arr[start];  
      return leaf;    
        }
      // create new node with idx you are at 
      Node node=new Node(start, end) ;
      int mid=(start + end)/2;
      node.left=this.constructTree(arr, start, mid);
      node.right=this.constructTree(arr,mid+1, end);
       node.data=node.left.data +node.right.data;
       return node;
     }
     public void display(){
        display(root,0);
       }

    private void display(Node node, int level) {
        if (node == null) {
            return;
        }
        
        display(node.right, level + 1);
        
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|------>" + node.data);
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|\t[" + node.startInterval + "-" + node.endInterval + "]");
        } else {
            System.out.println(node.data);
            System.out.println("[" + node.startInterval + "-" + node.endInterval + "]");
        }
        
        display(node.left, level + 1);
    }

     // query 
     public int query(int qsi, int qei){
        return this.query(this.root,qsi, qei);
     }

     private int query(Node node, int qsi , int qei){
        if(node.startInterval >= qsi && node.endInterval <=qei){
            // node is completely lying inside query
            return node.data;
        } else if(node.startInterval > qei || node.endInterval < qsi){
       // completely outside
       return 0;     
        } else {
            return this.query((node.left),qsi, qei) + this.query(node.right, qsi, qei);
        }
     }

     // update
     public void update(int index, int value){
        this.root.data=update(this.root, index, value);
     }
     private int update(Node node,int index, int value){
      if(index >= node.startInterval && index <=node.endInterval) {
        if(index ==node.startInterval && index==node.endInterval){
            node.data=value;
            return node.data;
        } else {
            int leftAns=update(node.left, index, value);
            int rightAns=update(node.right, index, value);
            node.data=leftAns+rightAns;
            return node.data;
        }
      }
      return node.data;
     }
    public static void main(String[] args) {
        int arr[]={3,8,6,7,-2,-8,4,9};
        SegmentTree tree=new SegmentTree(arr);
        tree.display();
        System.out.println("Sum from 1 to 6 index"+tree.query(1, 6));
    }
}
