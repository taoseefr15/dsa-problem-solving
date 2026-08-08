import java.util.*;

public class countPairs{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0) {
            int N = sc.nextInt();
            long even = 0;
            long odd = 0;
            for (int i = 0; i < N; i++) {
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            long ans = (even * (even - 1)) / 2 + (odd * (odd - 1)) / 2;
            System.out.println(ans);
        }
        sc.close();
    }
}








