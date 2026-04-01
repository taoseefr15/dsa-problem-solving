

/*
Given a number n, print the following pattern without using any loop.
n, n-5, n-10, ..., 0, 5, 10, ..., n-5, n

Input1: n = 16
Output1: 16, 11, 6, 1, -4, 1, 6, 11, 16
Input2: n = 10
Output2: 10, 5, 0, 5, 10
*/
import java.util.Scanner;

public class seriesPattern {
//    static void fun(int n) {
//         //Printed (before recursion)
//        System.out.print(n + " ");
//        // base condition: when n becomes <= 0
//        if (n <= 0) {
//            return;
//        }
//        fun(n - 5);
//        //Printed (after recursion)
//        System.out.print(n+ " ");
//
//    }
    static void fun(int n){
        System.out.println(n+" ");
        if(n<=0) return;

        fun(n-1);

        System.out.print(n+ " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n);
    }
}
