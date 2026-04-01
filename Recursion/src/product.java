/*
Given two number x and y find product using recursion.
Input1 : x = 5, y = 2
Output1 : 10
Input2 : x = 100, y = 5
Output2 : 500
*/

import java.util.Scanner;

public class product {
    static int multi(int x, int y){
        if(y==1) return x;

        return x + multi(x,y-1);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(multi(x,y));
    }
}
