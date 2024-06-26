// print in reverse order

import java.util.*;

public class LevelOrderTraversal2 {
    public static class TreeNode {
        int value;
        TreeNode left, right;

        TreeNode(int value) {
            this.value = value;
        }
    } 
    public  TreeNode root;
    public  void display(){
        display(root,0);
    }

    public void display(TreeNode root, int level){
        if(root==null){
            return;
        }
        display(root.right,level+1);
      if(level!=0){
        for (int i = 0;i < level-1;i++) {
          System.out.print("|\t");   
        }
        System.out.println("|------>" +root.value);
      } else{
        System.out.println(root.value);
      }
      display(root.left, level+1);
    }

    public  void insert(int value) {
        root = insertRec(root, value);
    }
    public  TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.value)
            root.left = insertRec(root.left, value);
        else if (value > root.value)
            root.right = insertRec(root.right, value);
        return root;
    }
    public  void addArray(int[] arr) {
        for (int value : arr) {
            insert(value);
        }
    }
     
    
    public List<List<Integer>> levelOrderBottom(TreeNode node) {
      List<List<Integer>> result=new ArrayList<>();

      if(node==null){
        return result;
      }
      Queue<TreeNode> queue=new LinkedList<>();
      queue.offer(node);

       while (!queue.isEmpty()) {
        int levelSize=queue.size();
        List<Integer> currLevel=new ArrayList<>(levelSize);
        for (int i = 0;i < levelSize;i++) {
        TreeNode currNode= queue.poll();
        currLevel.add(currNode.value);   
        if(currNode.left !=null){
            queue.offer(currNode.left);
        }
        if(currNode.right !=null){
            queue.offer(currNode.right);
        }
        }
        result.add(0,currLevel);
       }
      return result;
     }
     public static void main(String[] args) {
     int arr[]={8,6,41,35,78,22,14,3,4,9};
     LevelOrderTraversal2 tree=new LevelOrderTraversal2();
      tree.addArray(arr);
      tree.display();
      List<List<Integer>> res= tree.levelOrderBottom(tree.root);
      System.out.println(res);
    }
}
