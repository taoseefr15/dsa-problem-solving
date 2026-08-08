public class minCostClimbingStairs {
    public static int solution(int[] a){
        int n = a.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;

        for(int i=2;i<=n; i++){
            dp[i] = Math.min(dp[i-1] + a[i-1], dp[i-2]+a[i-2]);
        }
        return dp[n];
    }
    public static int solution1(int[] a){
        int n = a.length;
        int val2 = 0;
        int val1 = 0;

        for(int i=2; i<n; i++){
            int currCost = Math.min(val2 + a[i-1], val1 + a[i-2]);
            val1 = val2;
            val2 = currCost;
        }
        return val2;
    }
    public static void main(String[] args){
        int[] a = {1,100,1,1,1};
//        int[] a = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.print(solution(a));
    }
}
