public class CreateBinaryTree {
    public class Node{
        int data;
         Node left ,  right;
         Node(int data){
            this.data=data;
         }
        }
       public Node root;
       static  int idx=-1;
         public Node buildTree(int arr[]){
          idx++;
          if(arr[idx]==-1){
            return null;
          } 
          Node newNode=new Node(arr[idx]);

          newNode.left=buildTree(arr);
          newNode.right=buildTree(arr);
          return newNode;
         }
         public  void preetyDisplay(){
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
            System.out.println("|------>" +node.data);
          } else{
            System.out.println(node.data);
          }
          preetyDisplay(node.left, level+1);
        }
    public static void main(String[] args) {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         CreateBinaryTree tree=new CreateBinaryTree();
        tree.root=tree.buildTree(arr);
          tree.preetyDisplay();
    }
}
