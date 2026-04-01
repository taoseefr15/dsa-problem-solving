/*
Q5. Given a string, recursively implement atoi() or Integer.parseInt() method on it without actually
using the method.

 */

import java.util.Scanner;

public class RecursiveAtoi {

    static int atoi(String s, int idx) {
        // base case
        if (idx == s.length()) {
            return 0;
        }

        int digit = s.charAt(idx) - '0';
        int power = (int) Math.pow(10, s.length() - idx - 1);

        return digit * power + atoi(s, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(atoi(s, 0));
        sc.close();
    }
}

