public class Insertion {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;
        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if(head == null) {
                head = temp;
                tail = temp;
            }else {
                tail.next = temp;
                tail = temp;
            }
        }
        void insertAtBegin(int data) {
            Node temp = new Node(data);
            if(head == null){
                head = tail = temp;
                //or
                //insertAtEnd(data);

            }else{
                temp.next = head;
                head = temp;
            }
        }
        void insertAtAIdx(int idx, int data) {
            Node t = new Node(data);
            Node temp = head;
            if (idx < 0 || idx > size()) {
                System.out.println("Invalid Index!");
                return;
            }
            if(idx == size()){
                insertAtEnd(data);
                return;
            }else if(idx == 0){
                insertAtBegin(data);
                return;
            }
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        void deletion(int idx) {
            if(idx == 0){
                head = head.next;
                size--;
            }
            Node temp = head;
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }
        int getAt(int idx){
            Node temp = head;
            if(idx < 0 || idx > size()){
                System.out.println("Invalid Index!");
            }
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        int size() {  // O(n)
            int count = 0;
            Node temp = head;
            while(temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();
        System.out.println();
        list.insertAtBegin(5);
        list.insertAtBegin(60);
        list.insertAtBegin(70);
        list.display();
        System.out.println();
        list.insertAtAIdx(5, 10);
        list.insertAtAIdx(3, 20);
        list.display();
        System.out.println();
        System.out.println(list.size());
        System.out.println(list.getAt(2));
    }
}
