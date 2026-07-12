import java.util.Arrays;

public class climbingStairs {
    static int[] dp;
    public static int climbStairs(int n){
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n);
    }

    public static int solve(int n){
        if(n <= 2) return n;

        if(dp[n] != -1){
            return dp[n];
        }

        return dp[n] = solve(n-1) + solve(n-2);
    }
    public static void main(String[] args){
        int n = 4;
        System.out.println(climbStairs(n));
    }
}
