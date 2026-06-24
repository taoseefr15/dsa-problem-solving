import java.util.Stack;

public class Deletion {
    public static void display(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        display(st);
        st.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(56);
        st.push(55);
        st.push(95);
        st.push(52);
        st.push(85);
        System.out.println(st);

        Stack<Integer> cp = new Stack<>();

        while(st.size() > 1){
            cp.push(st.pop());
        }
        st.pop();
        while(!cp.isEmpty()){
            st.push(cp.pop());
        }
        display(st);
    }
}
