public class Knapsack01_UsingRecursion {
    public static int solution(int[][] items,int W,int n){
        if(n==0 || W==0) return 0;

        int val = items[n-1][0];
        int wt = items[n-1][1];

        if(wt <= W){
            int include = val + solution(items, W-wt,n-1);
            int exclude = solution(items, W, n-1);
            return Math.max(include,exclude);
        }else{
            return solution(items, W, n-1);
        }
    }
    public static void main(String[] args){

        int[][] items = {
                {20,2},
                {30,3},
                {50,4},
                {60,5},
                {100,9}
        };
        System.out.print(solution(items, 10,5));
    }
}
