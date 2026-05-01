public class Main {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void displayR(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        displayR(head.next);
    }

    // Find Length
    public static int Length(Node head){
        if (head == null) {
            return 0;
        }
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

       // printList(a);
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        printList(head); // 1 2 3 4 5 6
        System.out.println();
        printList(head.next); // 2 3 4 5 6
        System.out.println();
        displayR(head);
        System.out.println();
        System.out.println(Length(head));
    }
}

