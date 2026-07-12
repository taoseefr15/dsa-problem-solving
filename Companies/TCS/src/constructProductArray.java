import java.util.Arrays;

public class constructProductArray {
    public static int[] solution(int[] a){
        int[] ans = new int[a.length];
        ans[0] = 1;
        for(int i=1; i<a.length; i++){
            ans[i] = ans[i-1]*a[i-1];
        }
        int right = 1;
        for(int i=a.length-1; i>=1; i++){

        }
        return ans;
    }
    public static void main(String[] args){
        int[] a = {1,2,3,4};
        System.out.println(Arrays.toString(solution(a)));;
    }
}
