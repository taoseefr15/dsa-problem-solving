import java.util.*;

public class smallestPalindromicRearrangement_I {

    public static String solution(String s) {
        int n = s.length();

        char[] half = s.substring(0, n / 2).toCharArray();

        Arrays.sort(half);

        String left = new String(half);
        String middle = "";

        if (n % 2 == 1) {
            middle = String.valueOf(s.charAt(n / 2));
        }

        String right = new StringBuilder(left).reverse().toString();

        return left + middle + right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Palindromic String: ");
        String s = sc.next();

        System.out.println("Smallest Palindromic Rearrangement: " + solution(s));

        sc.close();
    }
}