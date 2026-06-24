import java.util.*;

public class CopyStack {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        System.out.println("Enter size of Stack: ");
        int n = sc.nextInt();

        System.out.println("Enter Elements of Stack: ");
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

        Stack<Integer> cp1 = new Stack<>();
        while(!st.isEmpty()){
            cp1.push(st.pop());
        }
        //Stack<Integer> cp2 = new Stack<>();
        while(!cp1.isEmpty()){
            st.push(cp1.pop());
        }
        System.out.println(st);
    }
}
