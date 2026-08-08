import java.util.Arrays;

public class Knapsack01_memoDP {

    public static int solution(int[][] items, int W, int n, int[][] dp) {

        if (n == 0 || W == 0)
            return 0;

        // Return already computed result
        if (dp[n][W] != -1)
            return dp[n][W];

        int val = items[n - 1][0];
        int wt = items[n - 1][1];

        if (wt <= W) {
            int include = val + solution(items, W - wt, n - 1, dp);
            int exclude = solution(items, W, n - 1, dp);

            dp[n][W] = Math.max(include, exclude);
        } else {
            dp[n][W] = solution(items, W, n - 1, dp);
        }

        return dp[n][W];
    }

    public static void main(String[] args) {

        int[][] items = {
                {20, 2},
                {30, 3},
                {50, 4},
                {60, 5},
                {100, 9}
        };

        int W = 10;
        int n = items.length;

        int[][] dp = new int[n + 1][W + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans = solution(items, W, n, dp);

        System.out.println("Maximum value = " + ans);
    }
}