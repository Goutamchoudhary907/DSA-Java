
public class BinarySearchTree {
    public class Node {
       private int value;
       private int height;
       private Node left;
       private Node right;

       public Node(int value){
         this.value=value;
       }

       public int getValue(){
        return value;
       }
}
       private static Node root;
       public Node getRoot(){
        return root;
       }
       public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
       }

       public boolean isEmpty(){
        return root==null;
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
 
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null) return true;
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
    public static void preetyDisplay(){
        preetyDisplay(root,0);
    }

    private static void preetyDisplay(Node node, int level){
        if(node==null){
            return;
        }
        preetyDisplay(node.right,level+1);
      if(level!=0){
        for (int i = 0;i < level-1;i++) {
          System.out.print("|\t");   
        }
        System.out.println("|------>" +node.value);
      } else{
        System.out.println(node.value);
      }
      preetyDisplay(node.left, level+1);
    }

    public static boolean search(Node root, int key){       // O(height)
        if(root==null){
            return false;
        }
        if(root.value >key) {
            return search(root.left, key);
        }
        else if(root.value < key){
            return search(root.right, key);
        }
        return true;
    }

    public static Node delete(Node root , int key){
        if(root ==null) return null;
       if(root.value > key) {
        root.left=delete(root.left, key);
       } else if(root.value < key){
        root.right=delete(root.right, key);
       } 
       else {  // root.data==key
         // case 1 no child
         if(root.left==null && root.right==null) {
            return null;
         } 

         // case 2  if one child is exist
         if(root.left ==null){
            return root.right;
         }
         else if(root.right ==null){
            return root.left;
         }

         // case 3
         Node IS=inOrderSuccessor(root.right);
         root.value=IS.value;
         root.right=delete(root.right, IS.value);
       }
       return root;
    }

    public static Node inOrderSuccessor(Node node){
        Node curr=node;
     while (curr !=null &&curr.left !=null) {
        curr=curr.left;
     }
     return curr;
    }
    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();
    //    int arr[]={5,2,7,1,4,6,9,8,3,10};
       int arr[]={1,2,3,4,5,6,7,8,9,10};
    //    tree.insertArray(arr);
        tree.insertSortedArray(arr);
          preetyDisplay();
          
    //  System.out.println(search(root, 1));
       delete(root, 9);
       
       System.out.println("After delete :");
       preetyDisplay();
    }
}
 