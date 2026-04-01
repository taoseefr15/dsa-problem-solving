import java.util.Scanner;

public class findTargetWithDuplicateElement {
    static int FindTargetWithDuplicateElement(int[] a, int target) {
        int st = 0, end = a.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (a[mid] == target) {
                return mid;
            }else if(a[st] == a[mid ] && a[end] == a[mid]) {
                st++;
                end--;
            }else if(a[mid] <= a[end]) {
                if(target > a[mid] && target <= a[end]) {
                    st = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(target < a[mid] && target >= a[st]){
                    end = mid - 1;
                }else{
                    st = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();
        System.out.println(FindTargetWithDuplicateElement(arr, target));
    }
}
