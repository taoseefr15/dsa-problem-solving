public class MaxValue {
    static int maxValue(int[] arr, int idx){

        if(idx == arr.length-1) return arr[idx];

        int smallAns = maxValue(arr,idx+1);

        return  Math.max(arr[idx],smallAns);
    }
    public static void main(String[] args){
        int[] arr = {44,5,32,9,97,85,6,59};
        System.out.println(maxValue(arr,0));;
    }
}
