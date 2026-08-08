import java.util.List;
import java.util.*;

public class IdentifyRowWithMost1 {
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
        int max = 0;
        int ans = -1;
        while(T --> 0){
            int r = sc.nextInt();
            int c = sc.nextInt();
            for(int i=0; i<r; i++){
                int count = 0;
                for(int j=0; j<c; j++){
                    int num = sc.nextInt();
                    if(num == 1){
                        count++;
                    }

                }
                if(max < count){
                    max = count;
                    ans = i;
                }
            }
            System.out.println(ans);
        }
    }
}
