import java.util.*;

public class CountCharacterOccurrences {
    public static int solution(String s1, String s2){
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int count = 0;
        for(int i=0; i<s1.length(); i++){
            char ch = s2.charAt(i);
            for(Map.Entry<Character, Integer> entry : map.entrySet()){
                if(entry.getKey() == ch){
                    count += entry.getValue();
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(solution(s1,s2));
        }
    }
}
