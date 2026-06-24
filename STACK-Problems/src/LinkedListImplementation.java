public class LinkedListImplementation {
    public static class Node{ // user define data
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{  // user define structure
        Node head = null;
        int size = 0;


        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }
        int peek(){
            if(head == null){
                System.out.println("Stack iis empty");
                return -1;
            }
            return head.val;
        }
        boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }

        void displayRec(Node head){
            if(head == null) return;
            displayRec(head.next);
            System.out.print(head.val+" ");
        }
        void display(){
            displayRec(head);
        }
        void displayRev(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        LLStack st = new LLStack();
        st.push(68);
        st.push(38);
        st.push(28);
        st.push(35);
        st.display();
        st.pop();
        st.push(73);
        st.push(18);
        st.push(33);
        st.display();
    }
}
