import java.util.*;

public class arrayRankTransform {
    public static void main(String[] args){
        int[] a = {40,10,20,30};

        int[] temp = a.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> map = new HashMap<>();

        int r = 1;
        for(int num : temp){
            if(!map.containsKey(num)){
                map.put(num,r++);
            }
        }
        System.out.println(map);
        for(int num : a){
            System.out.print(map.get(num)+" ");
        }
        System.out.println();
        for(int num : a){
            System.out.print(num+" ");
        }
    }
}
