import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public static List<Integer> solution(String s){
        int[] lastIdx = new int[26];
        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';
            lastIdx[idx] = i;
        }
        int start = 0;
        int end = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';
            end = Math.max(lastIdx[idx], end);
            if(i == end){
                ans.add(end+1);
                start = end+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        String s = "ababcbacadefegdehijhklij";
        System.out.print(solution(s));
    }
}
