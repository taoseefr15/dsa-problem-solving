public class IntersectionOfTwoLL {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node getIntersectionNode(Node headA, Node headB){
        Node tempA = headA;
        Node tempB  = headB;
        int lengthA = 0;
        while(tempA != null){
            lengthA++;
            tempA = tempA.next;
        }
        int lengthB = 0;
        while(tempB != null){
            lengthB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if(lengthA > lengthB){
            int steps = lengthA-lengthB;
            for(int i=0; i<steps; i++){
                tempA = tempA.next;
            }
        }else{
            int steps = lengthB - lengthA;
            for(int i=0; i<steps; i++){
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

    }
}
