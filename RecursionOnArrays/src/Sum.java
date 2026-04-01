public class Sum {
    static int sum(int[] arr, int idx){
        if(idx == arr.length-1)
            return arr[idx];
        return sum(arr, idx+1) + arr[idx];
    }
    static void main() {
        int[] arr = {4,5,2,6,8,7};
        System.out.println(sum(arr, 0));
    }
}
