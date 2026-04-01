public class findTargetVal {
    static boolean target(int[] arr, int idx, int val){
        if(idx >= arr.length) return false;

        if(arr[idx] == val) return true;

        return target(arr, idx+1, val);
    }

    static int findIndex(int[] arr, int idx, int val){
        if(idx >= arr.length) {
            return -1;
        }

        if(arr[idx] == val) return idx;

        return findIndex(arr, idx+1, val);
    }

    static void findAllIndices(int[] arr, int val, int idx){
        if(idx >= arr.length) return;

        if(arr[idx] == val) {
            System.out.print(idx + " ");
        }
        findAllIndices(arr, val, idx+1);
    }

    static void main() {
        int[] arr = {4,6,3,5,7,2,9,3};
        //System.out.println(target(arr,0,99));
        //System.out.println(findIndex(arr, 0, 7));
        findAllIndices(arr, 3, 0);
    }
}
