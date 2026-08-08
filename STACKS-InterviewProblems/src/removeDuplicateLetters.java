import java.util.*;

public class removeDuplicateLetters {
    public static String solution(String s){
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        Stack<Character> st = new Stack<>();
        boolean[] visited = new boolean[26];

        for(char ch : s.toCharArray()){
            freq[ch-'a']--;

            if(visited[ch-'a']) continue;

            while(!st.isEmpty() && st.peek() > ch && freq[st.peek()-'a']>0){
                char removed = st.pop();
                visited[removed-'a'] = false;
            }

            st.push(ch);
            visited[ch - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();

        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
    public static void main(String[] args){
        String s = "banana";
        System.out.print(solution(s));
    }
}
