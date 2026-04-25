public class nthNodeFromLast {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
    // In two traversal
    public static Node nthNode(Node head, int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        temp = head;
        for(int i=1; i<=m-1; i++){
            temp = temp.next;
        }
        return temp;
    }

    // In one traversal
    public static Node nthNode2(Node head, int n){
        Node fast = head;
        Node slow = head;

        for(int i=1; i<=n; i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static Node removeNthNodeFromEnd(Node head, int n){
        Node slow = head;
        Node fast = head;

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

    public static Node getIntersectionNode(Node headA, Node headB){
        Node tempA = headA;
        Node tempB = headB;
        int lengthA = 0;
        while(tempA != null){
            lengthA++;
            tempA = tempA.next;
        }
        int lengthB = 0;
        while(tempB != null){
            lengthA++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if(lengthA > lengthB){
            int steps = lengthA - lengthB;
            for(int i=1; i<steps; i++){
                tempA = tempA.next;
            }
        }else{
            int steps = lengthB - lengthA;
            for(int i=1; i<steps; i++){
                tempB = tempB.next;
            }
        }
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }

    public static void main(String[] args){
        Node a = new Node(53);
        Node b = new Node(59);
        Node c = new Node(90);
        Node d = new Node(25);
        Node e = new Node(45);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node p = nthNode(a,3);
        System.out.println(p.data);
        Node q = nthNode(a,2);
        System.out.println(q.data);
        display(a);
        a = removeNthNodeFromEnd(a,5);
        display(a);
    }
}
