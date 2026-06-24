public class DoublyLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void Display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val+" ");
            temp = temp.next;
        }
    }
    // Display Using tail
    public static void display(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.println(temp.val+" ");
            temp = temp.prev;
        }
    }
    public static void addAt(Node head, int idx){
        Node t = new Node(34);
        Node temp = head;

    }
    public static void main(String[] args){
        Node a = new Node(54);
        Node b = new Node(45);
        Node c = new Node(54);
        Node d = new Node(48);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = null;
        Display(a);
    }
}
