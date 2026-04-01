import java.util.Scanner;

public class Main {
    static int findTargetIdx(int[] a, int target) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == target) {
                return mid;
            }else if (a[mid] < target) {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
    static int findGreaterThanTargetIdx(int[] a, int target) {
        int low = 0;
        int high = a.length - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(a[mid] >= target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        //System.out.println(findTargetIdx(arr, target));
        System.out.println(findGreaterThanTargetIdx(arr, target));
    }
}