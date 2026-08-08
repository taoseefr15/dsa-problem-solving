import java.util.*;

public class AnagramCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            String s1 = sc.next();
            String s2 = sc.next();

            char[] a1 = s1.toLowerCase().toCharArray();
            char[] a2 = s2.toLowerCase().toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);

            System.out.println(Arrays.equals(a1,a2));
        }
    }
}
