import java.util.Scanner;

/*
Q1 - Given a number n. Print if it is an armstrong number or not.
An armstrong number is a number if the sum of every digit in that number raised to the power
of total digits in that number is equal to the number.
Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number.
Input1 : 153
Output1 : Yes
Input 2 : 134
Output2 : No
 */
import java.util.Scanner;

public class Armstrong {

    static int countDigits(int n) {
        return (n == 0) ? 0 : 1 + countDigits(n / 10);
    }

    static int armSum(int n, int d) {
        if (n == 0) return 0;
        int r = n % 10;
        return (int) Math.pow(r, d) + armSum(n / 10, d);
    }

    static boolean isArmstrong(int n) {
        return n == armSum(n, countDigits(n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isArmstrong(n) ? "Yes" : "No");
    }
}

