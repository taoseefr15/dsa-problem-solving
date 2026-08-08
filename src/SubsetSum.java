import java.util.*;


public class SubsetSum {
    public static void solution(int n){

    }
    public static void main(String[] args){
        int[] num = {5,24,7,5,6,8,3};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<num.length; i++){
            if(max < num[i]){
                max = num[i];
            }else if(min > num[i]){
                min = num[i];
            }

        }
        System.out.println(min + " " + max);
        int x = max, y = min;
        while(y != 0){
            int temp = y;
            y = x%y;
            x = temp;

        }

        System.out.println(x);
    }
}
