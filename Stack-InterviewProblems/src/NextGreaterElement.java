import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGE(int[] arr){ // without using Stack
        int n = arr.length;
        int[] res = new int[arr.length];
        for(int i=0; i<n; i++){
            int elm = arr[i];
            res[i] = -1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > elm){
                    res[i] = arr[j];
                    break;
                }
            }
        }
        return res;
    }

    public static int[] nextGE2(int[] a){
        int n = a.length;
        Stack<Integer> st = new Stack<>();

        int[] res = new int[n];
        return res;
    }
    public static void main(String[]  args){
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] res = nextGE(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(res[i] + " ");
        }


    }
}
