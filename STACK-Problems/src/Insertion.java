import java.util.Stack;

public class Insertion {
    public static void display(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        //System.out.print(top+" ");  // for reverse
        display(st);
        System.out.print(top+" ");
        st.push(top);
    }
//    public static void insertAtBottom(Stack<Integer> st){
//        if(st.isEmpty()) return;
//        int top = st.pop();
//        insertAtBottom(st);
//        System.out.println(top+" ");
//        st.push(1000);
//        st.push(top);
//    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(56);
        st.push(55);
        st.push(95);
        st.push(52);
        st.push(85);
        System.out.println(st);

        int idx = 2;
        int x = 10;

        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while( !temp.isEmpty() ){
            st.push(temp.pop());
        }
        System.out.println(st);
        display(st);
        System.out.println();

    }
}
