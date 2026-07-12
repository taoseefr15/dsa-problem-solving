import java.util.Scanner;
import java.util.Stack;

public class removeConsecutiveSubsequence {
    public static int[] remove(int[] a){
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<a.length; i++){
            if(st.isEmpty()  ||  st.peek() != a[i])
                st.push(a[i]);
            else if(a[i] == st.peek()){
                if(i==a.length-1 || a[i] != a[i+1])
                    st.pop();
            }
        }
        int[] res = new int[st.size()];
        int m = res.length;
        for(int i=m-1; i>=0; i--){
            res[i] = st.pop();
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int[] ans = remove(a);
        for (int an : ans) {
            System.out.println(an + " ");
        }
    }
}
