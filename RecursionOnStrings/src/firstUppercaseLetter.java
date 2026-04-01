import java.util.Scanner;

public class firstUppercaseLetter {
    static String uppercaseLetter(String s, int idx){
        if(s.isEmpty()) return "";
        if(Character.isUpperCase(s.charAt(idx))) return s.substring(idx);

        return uppercaseLetter(s,idx+1);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(uppercaseLetter(s,0));
    }
}
