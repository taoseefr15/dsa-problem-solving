import java.util.Scanner;

/*
2. You are given a sorted array containing N integers and a number target.
Implement the upper bound function that returns the index of an element just greater than the target element.
If there exists no such element then return -1.
Note: The target may not be present in the array.
Input:
N=10, target= 3 Array = 1 3 3 4 5 8 9 11 15 15
Output: 3
 */

public class UpperBoundIdx {
    static int findGreaterThanTargetIdx(int[] a, int target) {
        int low = 0;
        int high = a.length - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(a[mid] > target){
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
        System.out.println(findGreaterThanTargetIdx(arr, n));
    }
}
