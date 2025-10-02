package tree;

public class implimentation {

    public static class Node {
        int val;
        Node left;
        Node right ;


        public Node(int val){
          this.val =val;
        }
    }
public static void display(Node root){
        if(root==null)return;
    System.out.print(root.val+ " -> ");
    if (root.left != null)System.out.print(root.left.val+" , ");
   if (root.right!= null) System.out.print(root.right.val+" , ");
    System.out.println( );
   display(root.left);


   display(root.right);
}




    public static void main(String[] args) {
       Node root = new Node(2);
      // root.val = 2;
        Node a = new Node(7);
        Node b = new  Node (6);
        root.left = a;
        root.right= b;
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(9);
  a.left= c;
  a.right= d;
       b.right =e;

       display(root);

    }
}
