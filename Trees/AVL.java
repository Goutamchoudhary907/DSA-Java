public class AVL {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;
 
        public Node(int value){
          this.value=value;
          this.height=0;
        }
}

        private Node root;
        public int height() {
            return height(root);
          }
          
        private int height(Node node){
            if(node==null){
                return -1;
            }
            return node.height;
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
        node.height=1+ Math.max(height(node.left),height(node.right));
        return rotate(node);
       }

       private Node rotate(Node node){
        int balanceFactor=height(node.left)- height(node.right);
        if(balanceFactor >1) {   // left case 
        if(height(node.left.left) - height(node.left.right)  >0) {
        // left left case
            return rightRotate(node);
        }
        if(height(node.left.left) - height(node.left.right) <0) {
            // left right case
              node.left=leftRotate(node.left);         
                return rightRotate(node);
            }
        }

        if(balanceFactor <-1) {   // Right case 
            if(height(node.right.left) - height(node.right.right)  <0) {
            // right right case
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0) {
                //  right left case
                  node.right=rightRotate(node.right);         
                    return leftRotate(node);
                }
            }
            return node;
       }

       public Node rightRotate(Node p){
        Node c=p.left;
        Node t=c.right;

        c.right=p;
        p.left=t;

        p.height=Math.max(height(p.left), height(p.right)) +1;
        c.height=Math.max(height(c.left), height(c.right)) +1;
        return c;
       }

       public Node leftRotate(Node c){
        Node p=c.right;
        Node t=p.left;

        p.left=c;
        c.right=t;

        c.height=Math.max(height(c.left), height(c.right)) +1;
        p.height=Math.max(height(p.left), height(p.right)) +1;
        return p;
       }
       public static void main(String[] args) {
        AVL tree=new AVL();
        
        System.out.println(tree.height(tree.root));
        for(int i=0 ;i<1000;i++){
            tree.insert(i);
        }
        System.out.println(tree.height());
       }
}