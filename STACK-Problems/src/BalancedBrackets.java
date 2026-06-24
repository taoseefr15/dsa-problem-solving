import java.util.*;

public class BalancedBrackets {
    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i=0; i<n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;
                if(st.peek() == '(' ) st.pop();
            }
        }
        if(st.size()>0) return false;
        else return true;
    }

    public static int NumberOfBracketForBalance(String str){
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '('){
                st.push(ch);
            }else{
                if(!st.isEmpty()) {
                    st.pop();
                }else{
                    count++;
                }
            }
        }
        if(!st.isEmpty()){
            count += st.size();
        }
        return count;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(isBalanced(str));
        System.out.println(NumberOfBracketForBalance(str));
    }
}
