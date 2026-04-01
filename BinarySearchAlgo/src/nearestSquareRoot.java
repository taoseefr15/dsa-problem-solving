

import java.util.Scanner;

public class nearestSquareRoot {
    static int squareRoot(int x) {
        int st = 0, end = x;
        int ans = 0;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            int val = mid * mid;
            if (val == x) {
                ans = mid;
            }else if (val < x) {
                st = mid + 1;
                ans = mid;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(squareRoot(num));
    }
}
