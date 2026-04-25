import java.util.ArrayList;
import java.util.Scanner;

public class palindromicSubstrings {
    static boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while(l<=r){
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    static void generate(String s, ArrayList<String> ans, int start){
        if(start == s.length()){
            System.out.println(ans);
            return;
        }
        String curr = "";
        for(int end = start; end < s.length(); end++){
            curr += s.charAt(end);
            if(isPalindrome(curr)){
                ans.add(curr);
                generate(s,ans,end+1);
                ans.remove(ans.size()-1);
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> ans = new ArrayList<>();
        generate(s, ans, 0);
    }

}
