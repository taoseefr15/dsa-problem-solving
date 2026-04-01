import java.util.ArrayList;

public class findAllIndices {
    static ArrayList<Integer> allIndices(int[] arr, int val, int idx){
        if(idx >= arr.length) return new ArrayList<>();

        ArrayList<Integer> res = new ArrayList<>();
        if (arr[idx] == val){
            res.add(idx);
        }
        ArrayList<Integer> smallAns = allIndices(arr, val, idx+1);
        res.addAll(smallAns);
        return res;
    }
    static void main() {
        int[] arr = {5,6,8,2,7,5,3,6,2,6,2};
        ArrayList<Integer> ans = allIndices(arr, 2,0);
        for(Integer i: ans){
            System.out.print(i + " ");
        }
    }
}
