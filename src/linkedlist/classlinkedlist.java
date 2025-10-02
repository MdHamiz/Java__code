package linkedlist;

public class classlinkedlist {


   public static class Node{
       int data;
       Node next;

       Node(int data){
           this.data = data;
        }
    }
    public static class linkedlist{
       Node head = null ;
       Node tail= null ;
       int size = 0;
       void insertAtEnd(int val) {
           Node temp = new Node(val);
           if (head == null) {
               head = temp;
               tail = temp;
           } else {
               tail.next = temp;

           }
           tail = temp;
           size++;
       }

        void insertAt( int idx,int val){
         Node t = new Node(val);
         Node temp= head;
        // for update the tail at last
         if(idx==size()){
             insertAtEnd(val);
             return ;
         }
         // for update the head at start
            else if(idx==0){
                insertAtStart(val);
                return ;
         }
            else if(idx<0 || idx>size()){
             System.out.println("wrong index");
           return;
            }

         for(int i=1;i<=idx-1 ;i++){
            temp= temp.next;
         }
         t.next = temp.next;
         temp.next = t;
         size++;
        }

        int getAt(int idx){
           Node temp = head;
           for(int i=1;i<=idx;i++){
               temp = temp.next;
           }
           return temp.data;
        }

        void deleteAt(int idx){
           Node temp = head;
           for(int i=1;i<= idx-1;i++){
               temp = temp.next;
           }
           temp.next = temp.next.next;
           size--;
        }

             void display(){
                Node temp = head;
                while(temp != null){
                    System.out.print(temp.data+" ");
                    temp = temp.next;
                }
                 System.out.println();
           }

           int size(){
             Node temp = head;
             int count =0;
             while(temp != null){
                 count++;
                 temp= temp.next;
             }
             return count;
           }
   void insertAtStart(int val){
           Node temp = new Node(val);
           if (head == null){
               head = tail =temp;
           }
           else{
               temp.next= head;
               head = temp;
           }
           size++;
   }

    }

    public static void main(String[] args) {
    linkedlist ll = new linkedlist();
     ll.insertAtEnd(4);
    ll.display();
        System.out.println(ll.size());
    ll.insertAtStart(5);
    ll.display();
        ll.insertAtStart(23);
        ll.insertAtStart(99);
        ll.insertAt(2,1);

        System.out.println(ll.getAt(3));
       // ll.deleteAt(4);
       // ll.deleteAt(4);
        ll.display();
       ll.deleteAt(4);
         ll.display();
   }

}
