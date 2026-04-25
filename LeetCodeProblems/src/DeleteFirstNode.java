public class DeleteFirstNode {
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
        void deleteFirstNode(int idx){
            Node temp = head;
            if(idx == 0){
                head = head.next;
                size--;
            }
        }
    }
    public static void main(String[] args){
        Node a = new Node(53);
        Node b = new Node(59);
        Node c = new Node(90);
        Node d = new Node(25);
        a.next = b;
        b.next = c;
        c.next = d;
        linkedList ll = new linkedList();

    }
}
