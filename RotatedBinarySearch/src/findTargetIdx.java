import java.util.Scanner;

public class findTargetIdx {
    static int FindTargetIdx(int[] arr, int target) {
        int n = arr.length;
        int l = 0, r = n - 1, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < arr[r]) {
                if (target > arr[mid] && target <= arr[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                if (target < arr[mid] && target >= arr[l]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            System.out.println(FindTargetIdx(arr, target));

        }
    }

