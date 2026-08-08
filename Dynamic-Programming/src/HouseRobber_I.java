public class HouseRobber_I {

    public static int rob(int[] a){
        int n = a.length;
        if(n==1) return a[0];
        int[] dp = new int[n];
        dp[0] = a[0];
        dp[1] = Math.max(a[0],a[1]);

        for(int i=2; i<n; i++){
            dp[i] = Math.max(dp[i-1],dp[i-2] + a[i]);
        }
        return dp[n-1];
    }
    public static void main(String[] args){
        int[] a = {4,6,8,2,6,5,8,9};
        System.out.println(rob(a));
    }
}
