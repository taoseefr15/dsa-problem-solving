import java.util.Arrays;

public class fibonacci {

//    Memoization
    static int[] dp;
    public static int fib(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n);
    }

    public static int solve(int n) {
        if (n <= 1)
            return n;

        if (dp[n] != -1)
            return dp[n];

        return dp[n] = solve(n - 1) + solve(n - 2);
    }

//    Tabulation
    public static int fibBytTabulation(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
        System.out.println(fibBytTabulation(n));
    }
}
