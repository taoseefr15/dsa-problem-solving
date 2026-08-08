import java.util.*;

public class MaxSumSubArr {
    public static int solution(int[] a, int k){
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += a[i];
        }
        int maxSum = sum;
        for(int i=k; i<a.length; i++){
            sum += a[i];
            sum -= a[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static int avgSum(int[] a, int k){
        int sum = 0;

        for(int i=0; i<k; i++){
            sum += a[i];
        }
        int maxAvg = sum/k;
        for(int i=k; i<a.length; i++){
            sum += a[i];
            sum -= a[i-k];
            maxAvg = Math.max(maxAvg, sum/k);
        }
        return maxAvg;
    }
    public static List<Integer> maxElement(int[] a, int k){
        ArrayList<Integer> ans = new ArrayList<>();

        int maxElm = 0;
        for(int i=0; i<k; i++){
            if(maxElm < a[i]){
                maxElm = a[i];
            }
        }
        ans.add(maxElm);
        return ans;
    }
    public static void main(String[] args){
        int[] a = {2,1,5,1,3,2};
        System.out.println(solution(a,3));
        System.out.println(avgSum(a,3));
    }
}
