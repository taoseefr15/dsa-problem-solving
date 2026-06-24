public class Deletion {

    public static void main(String[] args){
        DoublyLL.Node a = new DoublyLL.Node(54);
        DoublyLL.Node b = new DoublyLL.Node(45);
        DoublyLL.Node c = new DoublyLL.Node(54);
        DoublyLL.Node d = new DoublyLL.Node(48);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = null;
    }
}
