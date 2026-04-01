import java.util.Scanner;

public class firstOccurrenceElement {
    static int occurrence(int[] a, int target){
        int l = 0, r = a.length - 1;
        int fo = -1;
        while(l <= r){
            int mid = l+(r-l)/2;
            if(a[mid] == target){
                fo = mid;
                r = mid-1;
            }else if(a[mid] < target){
                l  = mid+1;
            }else{
                r = mid-1;
            }
        }
        return fo;
    }

    static int lastOccurrence(int[] a, int target){
        int l = 0, r = a.length - 1;
        int fo = -1;
        while(l <= r){
            int mid = l+(r-l)/2;
            if(a[mid] == target){
                fo = mid;
                r = mid-1;
            }
            else if(a[mid] < target){
                l  = mid+1;
            }else{
                r = mid-1;
            }
        }
        return fo;
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
