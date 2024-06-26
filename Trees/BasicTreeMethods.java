public class BasicTreeMethods {
    public class Node{
        int data;
         Node left ,  right;
         Node(int data){
            this.data=data;
         }
        }
       public static Node root;
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
         public static void display(Node node, int level){
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
    public static int countNodes(Node root){
     if(root==null){
        return 0;
     } 
      int leftNodes=countNodes(root.left);
      int rightNodes=countNodes(root.right);

      return leftNodes+rightNodes +1;
    }

    public static int sumOfNodes(Node root){
       if(root==null){
        return 0;
       }
       int leftSum=sumOfNodes(root.left);
       int rightSum=sumOfNodes(root.right);

       return leftSum+rightSum + root.data;
    }

    public static int height(Node root){
        if(root==null){
            return 0;
           }
           int lefHeight=height(root.left);
           int rightHeight=height(root.right);
    
           return Math.max(lefHeight, rightHeight) +1;
    }

    public static int diameter(Node root){
        if(root==null) {
            return 0;
        }
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3=height(root.left) + height(root.right) +1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }
        static class TreeInfo{
            int ht;
            int diam ;
             TreeInfo(int ht, int diam){
            this.ht=ht;
            this.diam=diam;
        }
        }
        public static TreeInfo diameter2(Node root){
            if(root==null) {
                return new TreeInfo(0, 0);
            }
        TreeInfo left=diameter2(root.left);
        TreeInfo right =diameter2(root.right);
        int myHeight=Math.max(left.ht,right.ht) +1;

        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.ht+right.ht+1;

        int myDiam=Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo=new TreeInfo(myHeight, myDiam);
        return myInfo;
        }

        
    public static int KthSum(int K, Node node) {
		if(node==null) return 0;
		if(K==1) return node.data;
		return KthSum(K-1, node.left) + KthSum(K-1, node.right); 
	}
    public static void main(String[] args) {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BasicTreeMethods tr=new BasicTreeMethods();
        Node root=tr.buildTree(arr);
        display(root, 0);
        System.out.println("No of nodes: "+countNodes(root));
        System.out.println("Sum of nodes: "+sumOfNodes(root));
        System.out.println("Height: "+height(root));

        System.out.println(diameter(root));

        System.out.println(diameter2(root).diam);
        int k=3;
        int sum=KthSum(k, root);
        System.out.printf("Sum of %d level is : %d",k,sum);
    }
}
