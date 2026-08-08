public class HouseRobber_II {

    public static int robLinear(int[] numbs, int st, int end) {
        int len = end - st + 1;

        if (len == 1)
            return numbs[st];

        int[] dp = new int[len];

        dp[0] = numbs[st];
        dp[1] = Math.max(numbs[st], numbs[st + 1]);

        for (int i = st + 2, j = 2; i <= end; i++, j++) {
            dp[j] = Math.max(dp[j - 1], dp[j - 2] + numbs[i]);
        }

        return dp[len - 1];
    }

    public static int rob(int[] numbs) {
        int n = numbs.length;

        if (n == 1)
            return numbs[0];

        return Math.max(
                robLinear(numbs, 0, n - 2),
                robLinear(numbs, 1, n - 1));
    }

    public static void main(String[] args) {
        int[] numbs = {2, 7, 9, 3, 1};
        System.out.println(rob(numbs));
    }
}