import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class FindMissingElements {
    public static List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=min+1; i<max; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T --> 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            System.out.println(findMissingElements(a));
        }
    }
}
