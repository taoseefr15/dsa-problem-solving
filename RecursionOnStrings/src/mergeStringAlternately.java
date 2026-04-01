import java.util.Scanner;

public class mergeStringAlternately {

    static String merge(String s1, String s2, int i, int j) {
        // base case: both strings finished
        if (i >= s1.length() && j >= s2.length()) {
            return "";
        }

        String result = "";

        if (i < s1.length()) {
            result += s1.charAt(i);
        }
        if (j < s2.length()) {
            result += s2.charAt(j);
        }

        return result + merge(s1, s2, i + 1, j + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(merge(s1, s2, 0, 0));
        sc.close();
    }
}



