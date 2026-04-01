/*
Find m-th summation of first n natural numbers where m-th summation of first n natural
numbers is defined as following:
If m > 1: SUM(n, m) = SUM(SUM(n, m - 1), 1)
Else :SUM(n, 1) = Sum of first n natural numbers.

Input1: n = 3, m = 2
Output1: SUM(3, 2) = 21

Explanation : SUM(3, 2)
= SUM(SUM(3, 1), 1)
= SUM(6, 1)
= 21

Input2 : n = 4, m = 1
Output2 : SUM(4, 1) = 10


*/

import java.util.Scanner;

public class summation {

    static int sum(int n, int m) {

        // Base case: sum of first n natural numbers
        if (m == 1) {
            return n * (n + 1) / 2;
        }

        // Recursive case
        return sum(sum(n, m - 1), 1);

//        OR
        // return sum(n*m, 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(sum(n, m));
    }
}

