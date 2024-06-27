import java.util.ArrayList;

public class PrintInRange {
    public class Node{
        int data;
         Node left ,  right;
         Node(int data){
            this.data=data;
         }
        }
       public static Node root;
       public void insert(int data){
        root=insert(data,root);
       }

       private Node insert(int data , Node node){
         if(node==null){
            node =new Node(data);
            return node;
         }

        if(data < node.data){
            node .left= insert(data, node.left);
        }
        if(data >node.data){
            node .right= insert(data, node.right);
        }
        return node;
       }
       public void insertArray(int arr[]){
        for (int i = 0;i <arr.length;i++) {
             this.insert(arr[i]);
        }
       }
         public void display(Node node, int level){
            if(node==null){
                return;
            }
            display(node.right,level+1);
          if(level!=0){
            for (int i = 0;i < level-1;i++) {
              System.out.print("|\t");   
            }
            System.out.println("|------>" +node.data);
          } else{
            System.out.println(node.data);
          }
          display(node.left, level+1);
        }

        public static void printInRange(Node root, int x , int y){
            if(root==null){
                return;
            }
            if(root.data >=x && root.data <=y){
                printInRange(root.left, x, y);
                System.out.print(root.data+" ");
                printInRange(root.right, x, y);
            }
            else if(root.data >=y) {
                printInRange(root.left, x, y);
            } 
            else{   // root.data <y
                printInRange(root.right, x, y);
            }
        }

        public static void printRoot2Leaf(Node root , ArrayList<Integer> path){
            if(root==null) return;
            path.add(root.data);
            // leaf node
            if(root.left==null && root.right==null){
                System.out.println(path);
            }
            else { // non leaf
                printRoot2Leaf(root.left, path);
                printRoot2Leaf(root.right, path);
            }
            path.remove(path.size()-1);
        }
        public static void main(String[] args) {
            int arr[]={8,5,3,1,4,6,10,11,14};
            PrintInRange tree=new PrintInRange();
            tree.insertArray(arr);
            tree.display(root, 0);

            // printInRange(root, 6, 10);
            System.out.println();
            printRoot2Leaf(root,new ArrayList<>());
        }
}
