package tree;

public class Orders {

        //global veriable
         // static int size =0;
        public static class Node {
            int val;
            Node left;
            Node right ;


            public Node(int val){
                this.val =val;
            }
        }


    public static void preorder(Node root){
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
    public static void postorder(Node root) {
        //post order is left right root
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);
    }
        public static void nthLevel(Node root, int n) {
            if (root == null) return;
            if (n == 1) System.out.print(root.val + " ");
            nthLevel(root.left, n - 1);
            nthLevel(root.right, n - 1);
        }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.val = 2;
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

        System.out.println("preorder of tree");
        preorder(root);
        System.out.println("__________");
        inorder(root);
        System.out.println("__________");
        postorder(root);
        System.out.println("__________");
        nthLevel(root,1);
        nthLevel(root,2);
        nthLevel(root,3);
    }
}
