import java.util.Scanner;
/*
5. Given a sorted array of distinct integers that is rotated in nature, find the value of the maximum element in
the array.

Input:
N = 10
Array = 6 7 11 13 15 1 2 3 4 5

Output:
Maximum element found at index 4
Value of that element found 15
 */
public class MaxElementInRotatedArr {
    static int maxIdx(int[] a){
        int st = 0, end = a.length - 1, max = a[0];
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(max < a[mid] ){

            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
