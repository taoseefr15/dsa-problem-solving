public class ArrayImplementation {
    public static class Stack{
        private int[] arr = new int[10];
        private int idx = 0;

        void push(int x){
            if(isFull()){
                System.out.println("Stack is full!");
                return;
            }
            arr[idx++] = x;
        }
        int peek(){
            if(idx == 0) {
                System.out.println("Stack Empty!");
                return -1;
            }
            return arr[idx];
        }
        int pop(){
            if(idx == 0) {
                System.out.println("Stack Empty!");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }


        void display(){
            for(int i=0; i<=idx-1; i++){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(idx == 0){
                return true;
            }else{
                return false;
            }
        }
        boolean isFull(){
            if(idx == arr.length) return true;
            else return false;
        }

        int capacity(){
            return arr.length;
        }
    }


    public static void main(String[] args){
        Stack st = new Stack();
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
