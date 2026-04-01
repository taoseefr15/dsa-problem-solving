import java.util.Scanner;

public class ReverseString {
    static String reverse1(String s){
        if(s.length() == 0) return "";
        String smallAns = reverse1(s.substring(1));
        return smallAns + s.charAt(0);

    }
    static String reverse(String s, int idx){
        if(idx == s.length()) return "";
//        String smallAns = remove(s, idx+1);
//        char currChar = s.charAt(idx);
//        return smallAns + currChar;
        return reverse(s, idx+1) + s.charAt(idx);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s,0));
        System.out.println(reverse1(s));
    }
}
