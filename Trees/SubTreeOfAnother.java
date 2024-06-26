public class SubTreeOfAnother {
    public class TreeNode{
        int val;
         TreeNode left ,  right;
         TreeNode(int val){
            this.val=val;
         }
        }
       public static TreeNode root;

       static  int idx=-1;
       public TreeNode buildTree(int arr[]){
        idx++;
        if(arr[idx]==-1){
          return null;
        } 
        TreeNode newNode=new TreeNode(arr[idx]);
        newNode.left=buildTree(arr);
        newNode.right=buildTree(arr);
        return newNode;
       }

       public static void display(TreeNode node, int level){
        if(node==null){
            return;
        }
        display(node.right,level+1);
      if(level!=0){
        for (int i = 0;i < level-1;i++) {
          System.out.print("|\t");   
        }
        System.out.println("|------>" +node.val);
      } else{
        System.out.println(node.val);
      }
      display(node.left, level+1);
    }
   
    public static boolean isIdentical(TreeNode root, TreeNode subRoot){
        if(root ==null && subRoot==null) return true;
        if(root==null || subRoot==null) return false;

        if(root.val ==subRoot.val) {
           return isIdentical(root.left, subRoot.left) && 
           isIdentical(root.right, subRoot.right);
        }
        return false;
       }

       public static boolean isSubtree(TreeNode root, TreeNode subRoot){
        if(subRoot==null)  return true;
        if(root==null)   return false;
    
        if(root.val== subRoot.val){
        if(isIdentical(root, subRoot)) return true;
        }
      return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }    
       public static void main(String[] args) {
         SubTreeOfAnother tree=new SubTreeOfAnother();
         int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         TreeNode root=tree.buildTree(arr);
         display(root, 0);

         SubTreeOfAnother subTree=new SubTreeOfAnother();
         idx=-1;
         int arr2[]={2, 4, -1, -1, 5, -1, -1};
         TreeNode subRoot= subTree.buildTree(arr2);
         System.out.println("Tree 2:");
         display(subRoot, 0);

         System.out.println(isSubtree(root, subRoot));
       }
}
