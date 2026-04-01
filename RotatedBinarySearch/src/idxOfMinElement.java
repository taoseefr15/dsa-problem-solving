import java.util.Scanner;

public class idxOfMinElement {
    static int minIdx(int[] a){
        int n=a.length, ans = 0;
        int l=0,r=n-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(a[mid] > a[n-1]){
                l = mid+1;
            }else if(a[mid] <= a[n-1]){
                ans = mid;
                r = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(minIdx(arr));
    }
}
