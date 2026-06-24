public class Insertion {
    public static DoublyLL.Node insertAtBegin(DoublyLL.Node head,int x){
        DoublyLL.Node t = new DoublyLL.Node(65);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }

    public static void insertAtEnd(DoublyLL.Node head, int x){
        DoublyLL.Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        DoublyLL.Node t = new DoublyLL.Node(x);
        temp.next = t;
        t.prev = temp;
    }

    public static void insertAtAnyIdx(DoublyLL.Node head, int idx, int x){
        DoublyLL.Node t = new DoublyLL.Node(x);
        DoublyLL.Node s = head;
        for(int i=1; i<idx-1; i++){
            s = s.next;
        }
        DoublyLL.Node r = s.next;

        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }
    public static void main(String[] args){
        DoublyLL.Node a = new DoublyLL.Node(54);
        DoublyLL.Node b = new DoublyLL.Node(45);
        DoublyLL.Node c = new DoublyLL.Node(24);
        DoublyLL.Node d = new DoublyLL.Node(48);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = null;
        DoublyLL.Node newHead = insertAtBegin(a,3);
        DoublyLL.Display(newHead);

        System.out.println();

        insertAtEnd(a,36);
        DoublyLL.Display(a);

        System.out.println();

        insertAtAnyIdx(a,3,98);
        DoublyLL.Display(a);
    }
}
