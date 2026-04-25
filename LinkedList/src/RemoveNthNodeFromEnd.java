public class RemoveNthNodeFromEnd {
    public static class Node{
        int data;
        nthNodeFromLast.Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void display(nthNodeFromLast.Node head){
        nthNodeFromLast.Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static nthNodeFromLast.Node removeNthNodeFromEnd(nthNodeFromLast.Node head, int n){
        nthNodeFromLast.Node slow = head;
        nthNodeFromLast.Node fast = head;

        for(int i=1; i<=n; i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args){
        Node a = new Node(53);
        Node b = new Node(24);
        Node c = new Node(13);
        Node d = new Node(55);
        Node e = new Node(32);
        Node f = new Node(535);

    }
}
