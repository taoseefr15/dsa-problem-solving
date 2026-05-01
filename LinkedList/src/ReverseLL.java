public class ReverseLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverse(Node head){
        if(head == null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void displayRev(Node head){
        if(head == null) return;
        displayRev(head.next);
        System.out.print(head.data+ " ");
    }
    public static void display(Node head){
        if(head == null){
            System.out.println();
            return;
        }
        System.out.print(head.data+ " ");
        display(head.next);
    }
    public static void main(String[] args){
        Node a = new Node(8);
        Node b = new Node(2);
        Node c = new Node(5);
        Node d = new Node(4);
        Node e = new Node(3);
        Node f = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        displayRev(a);
        System.out.println();
        display(a);
    }
}
