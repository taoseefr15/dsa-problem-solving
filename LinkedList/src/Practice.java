import java.util.LinkedList;


public class Practice {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class linkedList{
        Node head = null;
        Node tail = null;
        int size = 0;

        void InsertAtBegin(int data){

        }
    }
    public static void main(String[] args) {
        linkedList l = new linkedList();

    }
}
/*
class Node {
   int val;
   Node next;
   Node random;


   public Node(int val) {
       this.val = val;
       this.next = null;
       this.random = null;
   }
}


public Node copyRandomList(Node head) {
   // make copy of list
   Node iter = head;
   Node front = head;
   while (iter != null) {
       front = iter.next;


       Node copy = new Node(iter.val);
       iter.next = copy;
       copy.next = front;


       iter = front;
   }


   // assign random pointers
   iter = head;
   while (iter != null) {
       if (iter.random != null) {
           iter.next.random = iter.random.next;
       }
       iter = iter.next.next;
   }


   // restore original list and extract the copy list
   iter = head;
   Node pseudoHead = new Node(0);
   Node copy = pseudoHead;


   while (iter != null) {
       front = iter.next.next;


       // extract the copy
       copy.next = iter.next;
       copy = copy.next;


       // restore the original list
       iter.next = front;


       iter = front;
   }


   return pseudoHead.next;
}

 */