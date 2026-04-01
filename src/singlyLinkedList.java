class ListNode{
    int data;
    ListNode next;

    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList{
    ListNode head;

//    Insert at end
    public void add(int data){
        ListNode newNode = new ListNode(data);

        if(head == null){
            head = newNode;
            return;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addFirst(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }




    public void display(){
        ListNode temp = head;

        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class singlyLinkedList{
    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        list.display();
    }
}
