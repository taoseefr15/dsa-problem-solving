import java.util.Arrays;

public class sumAndDigits_3756 {

    public static int[] solution(String s, int[][] q) {
        int m = q.length;
        int[] ans = new int[m];
        long MOD = 1_000_000_007L;

        for (int i = 0; i < m; i++) {
            int st = q[i][0];
            int end = q[i][1];

            long sum = 0;
            long x = 0;

            for (int j = st; j <= end; j++) {
                int digit = s.charAt(j) - '0';

                if (digit == 0) continue;

                sum += digit;
                x = (x * 10 + digit) % MOD;
            }

            ans[i] = (int) ((x * (sum % MOD)) % MOD);
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "10203004";
        int[][] q = {{0,7}, {1,3}, {4,6}};
        System.out.println(Arrays.toString(solution(s, q)));

        String s1 = "1000";
        int[][] q1 = {{0,3}, {1,1}};
        System.out.println(Arrays.toString(solution(s1, q1)));

        String s2 = "9876543210";
        int[][] q2 = {{0,9}};
        System.out.println(Arrays.toString(solution(s2, q2)));
    }
}