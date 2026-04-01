import java.util.Scanner;

public class KthElement {
    static void sort(int[] a, int low, int high) {
        if(low < high) {
            int mid = low + (high - low)/2;
            sort(a, low, mid);
            sort(a, mid + 1, high);
            merge(a, low, mid, high);
        }

    }
    static void merge(int[] a, int low, int mid, int high){
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0; i<n1; i++){
            left[i] = a[low+i];
        }
        for(int j=0; j<n2; j++){
            right[j] = a[mid + j + 1];
        }
        int i=0, j=0, k=low;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                a[k++] = left[i++];
            }else{
                a[k++] = right[j++];
            }
        }
        while(i<n1){
            a[k++] = left[i++];
        }
        while(j<n2){
            a[k++] = right[j++];
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sort(a, 0, n-1);
        System.out.println(a[k]);
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
