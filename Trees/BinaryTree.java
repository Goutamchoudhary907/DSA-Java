import java.util.Scanner;

public class BinaryTree {
    public static class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value=value;
        }
    }

    private Node root;

    // insertion 
    public void insertion(Scanner scanner){
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter the root node:");
       int value=sc.nextInt(); 
        root=new Node(value);
        populate(scanner, root); 
        sc.close();
    }

    private void populate(Scanner scanner,Node node) {
       System.out.println("Do you want to enter left of "+node.value);
       boolean left=scanner.nextBoolean();
       if(left){
        System.out.println("Enter the value of the left of "+node.value);
        int value=scanner.nextInt();
        node.left=new Node(value);
        populate(scanner, node.left);
       }

       System.out.println("Do you want to enter right of "+node.value);
       boolean right=scanner.nextBoolean();
       if(right){
        System.out.println("Enter the value of the right of "+node.value);
        int value=scanner.nextInt();
        node.right=new Node(value);
        populate(scanner, node.right);
       }
    }
    public void display(){
        display(root,"");
    }
    private void display(Node node,String indent){
       if(node==null){
        return;
       }
       System.out.println(indent+node.value);
       display(node.left, indent+"\t");
       display(node.right, indent+"\t");
    }
    public void preetyDisplay(){
        preetyDisplay(root,0);
    }

    private void preetyDisplay(Node node, int level){
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
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
        tree.insertion(scanner);
        // tree.display();
        tree.preetyDisplay();
    }
}