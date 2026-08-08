public class Frog_Jump {
    public static int jump(int[] a){

        int n = a.length;
        if(n == 1) return 0;
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(a[0] - a[1]);

        for(int i=2; i<n; i++){
            dp[i] = Math.min(
                    dp[i-1] + Math.abs(a[i] - a[i-1]),
                    dp[i-2] + Math.abs(a[i] - a[i-2])
            );
        }
        return dp[n-1];
    }

    public static int jump2(int[] a){
        int n = a.length;

        if(n == 1) return 0;

        int prev1 = 0;
        int prev2 = Math.abs(a[0] - a[1]);
        int result = prev2;

        for(int i=2; i<n; i++){
            int jump1 = prev2 + Math.abs(a[i] - a[i-1]);
            int jump2 = prev1 + Math.abs(a[i] - a[i-2]);

            result = Math.min(jump1, jump2);

            prev1 = prev2;
            prev2 =  result;
        }
        return result;
    }
    public static void main(String[] args){
        int[] a = {30,20,50,10,40};
        System.out.println(jump(a));
        System.out.print(jump2(a));
    }
}
