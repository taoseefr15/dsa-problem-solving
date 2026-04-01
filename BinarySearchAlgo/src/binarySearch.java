public class binarySearch {
    static boolean Target(int[] arr, int low, int high, int target){
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return true;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else if(arr[mid] > target){
                high = mid - 1;
            }
        }
        return false;
    }

    // RECURSIVE METHOD

    static boolean   recBS(int[] a, int l, int r, int target){
        if(l>r) return false;
        int mid = l + (r-l)/2;
        if(target == a[mid]){
            return true;
        }else if(target > a[mid]){
            return recBS(a, l, mid-1, target);
        }else{
            return recBS(a, mid+1, r, target);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,2,5,7,81,45,78,13,13,14,67,78,21,46,21,32};
        int target = 14;
        System.out.println(Target(arr,0,arr.length-1,target));
    }
}
