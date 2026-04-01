import java.util.Scanner;

/*
4. You are given a sorted array containing N integers and a number target, you have to find the number of
occurrences of the target in the given array.

Input:
N=10, target= 5
Array = 1 3 3 4 5 5 5 11 15 15
Output:
3 [number of occurrences of element with value 5 will be 3.]
 */
public class CountTargetOccurrence {
    static int firstOccurrence(int[] a, int target){
        int st = 0, end = a.length - 1, ans = 0;
        while(st <= end){
            int mid = (st + end) / 2;
            if(a[mid] == target){
                ans = mid;
                end = mid-1;
            }else if(a[mid] < target){
                st = mid+1;
            }else {
                end = mid-1;
            }
        }
        return ans;
    }
    static int lastOccurrence(int[] a, int target){
        int st = 0, end = a.length - 1, ans = 0;
        while(st <= end){
            int mid = st + (end-st) / 2;
            if(a[mid] == target){
                ans = mid;
                st = mid+1;
            }else if(a[mid] < target){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    static int occurrence(int[] a, int target) {
        int first = firstOccurrence(a, target);

        if(first == -1) return 0;

        int last = lastOccurrence(a, target);

        return last - first + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(occurrence(arr, target));
    }
}
