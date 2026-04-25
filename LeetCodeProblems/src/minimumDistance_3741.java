import java.util.*;

public class minimumDistance_3741 {
    static int minimumDistance(int[] a) {

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i = 0; i < a.length; i++){
            if(!map.containsKey(a[i])){
                map.put(a[i], new ArrayList<>());
            }
            map.get(a[i]).add(i);
        }

        int min = Integer.MAX_VALUE;

        for(ArrayList<Integer> list : map.values()){

            if(list.size() < 3) continue;

            for(int i = 0; i <= list.size() - 3; i++){

                int first = list.get(i);
                int last  = list.get(i + 2);

                int distance = 2 * (last - first);

                min = Math.min(min, distance);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static void main(String[] args) {
        int[] a = {1,1,2,3,2,1,2};
        System.out.println(minimumDistance(a));
    }
}
