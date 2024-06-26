import java.util.*;

public class ZigZagLevelOrder {
    public static class TreeNode {
        int value;
        TreeNode left, right;

        TreeNode(int value) {
            this.value = value;
        }
    } 
    public static TreeNode root;
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

    public List<List<Integer>> zigZagLevelOrder(TreeNode root){
        boolean reverse=false;
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Deque<TreeNode> dq=new ArrayDeque<>();
        dq.add(root);

        while (!dq.isEmpty()) {
        int levelSize=dq.size();
        List<Integer> currLevel=new ArrayList<>();
        for (int i = 0;i < levelSize;i++) {
        if(!reverse){
            TreeNode currNode= dq.poll();
            currLevel.add(currNode.value);
            if(currNode.left !=null){
                dq.addLast(currNode.left);
            }
            if(currNode.right !=null){
                dq.addLast(currNode.right);
            }
        } else {
            TreeNode currNode= dq.pollLast();
            currLevel.add(currNode.value);
            if(currNode.right !=null){
                dq.addFirst(currNode.right);
            }
            if(currNode.left !=null){
                dq.addFirst(currNode.left);
            }
        }
       }
       reverse=!reverse;
       res.add(currLevel);
        }
        return res;
    }
    public static void main(String[] args) {
        ZigZagLevelOrder tr=new ZigZagLevelOrder();
        int arr[]={1,3,9,8,7,5,98,74,52,63};
        tr.addArray(arr);
        tr.display();

        List<List<Integer>> res=tr.zigZagLevelOrder(root);
        System.out.println(res);
    }
}