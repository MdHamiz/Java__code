package linkedlist;

public  class linkedlist1 {
    public static class Node
    {
        int data;
        Node next;
        Node (int data){
            this.data= data;
        }
    }

    public static void main(String[] args) {
      Node a = new Node(5);
      Node b = new Node(3);
      Node c = new Node(7);
      Node d = new Node(6);
      Node e = new Node(7);


      a.next=b;
      b.next = c;
      c.next = d;
      d.next =e;

      Node temp = a ;
      while(temp != null) {
          System.out.print(temp.data + " ");
          temp = temp.next;

        }
      System.out.print("null");
    }
}
