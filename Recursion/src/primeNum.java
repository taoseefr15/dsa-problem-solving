/*
Given a number n, check whether it's a prime number or not using recursion.

Input1 : n = 11
Output1 : Yes
Input2 : n = 15
Output2 : No
*/

import java.util.Scanner;

public class primeNum {
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(gcd(p,q));
    }
}
