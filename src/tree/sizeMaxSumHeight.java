package tree;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class sizeMaxSumHeight {
    //global veriable
    static int size =0;
    public static class Node {
        int val;
        Node left;
        Node right ;


        public Node(int val){
            this.val =val;
        }
    }


    public static void preorder(Node root){
        if(root == null)return;
        size++;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public static int size(Node root){
        if(root == null) return 0 ;
  return 1 + size(root.left)+ size(root.right);
    };

    public static int sum(Node root){
        if (root == null) return 0;
        return root.val + sum (root.left) + sum (root.right);
    }
    public static int max(Node root){
        if(root == null)return  Integer.MIN_VALUE ;
       int a = root .val;
       int b = max(root.left);
       int c = max(root.left);
       return Math.max(a,Math.max(b,c));

    }
    public static int height(Node root){
        if(root == null) return 0;
        if(root.left == null&& root.right == null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void preorder2(Node root){
        // preorder is root left right
        if(root == null)return ;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }


    public static void inorder(Node root){
        // inorder is left root right
        if(root== null)return ;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);

    }
    public static void postorder(Node root){
        //post order is left right root
        if(root== null)return ;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);

    }
public static void bfs(Node root ){
    Queue<Node> q = new LinkedList<>();
    if (root!= null)q.add(root);
    
    while(q.size()>0){

        Node  temp =  q.peek();
        if(temp.left!= null) q.add(temp.left);
        if(temp.right !=  null) q.add(temp.right);
        System.out.print(temp.val + " ");
        q.remove();

    }
}




    public static void main(String[] args) {
         Node root = new Node(2);
        // root.val = 2;
         Node a = new  Node(7);
        Node b = new  Node(6);
        root.left = a;
        root.right= b;
         Node c = new  Node(4);
         Node d = new  Node(5);
        Node e = new  Node(9);
        a.left= c;
        a.right= d;
        b.right =e;
        preorder(root);
        System.out.println("__________ ");
        System.out.println(size);
        System.out.println("__________");
        System.out.println(size(root));
        System.out.println("__________");
        System.out.println(sum(root));
        System.out.println("__________");
        System.out.println("maximum value ");
        System.out.println(max(root));
        System.out.println("__________");
        System.out.println("height ");
        System.out.println(height(root));
        System.out.println("__________");
        System.out.println("preorder of tree");
        preorder2(root);
        System.out.println("__________");
        inorder(root);
        System.out.println("__________");
        postorder(root);
        System.out.println("__________");
        bfs(root);

    }
}
