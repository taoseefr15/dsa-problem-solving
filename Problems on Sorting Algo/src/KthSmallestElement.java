import java.util.Scanner;

public class KthSmallestElement {
    static void mergeSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int mid = low + (high-low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    static void merge(int[] arr, int low, int mid, int high){
        int n1 = mid - low+1;
        int n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0; i<n1; i++) left[i] = arr[low+i];
        for(int i=0; i<n2; i++) right[i] = arr[mid+1+i];

        int i=0, j=0, k=low;
        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }
        while(i<n1){
            arr[k++] = left[i++];
        }
        while(j<n2){
            arr[k++] = right[j++];
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        mergeSort(arr, 0, arr.length-1);
        System.out.println("The smallest element is "+arr[k-1]);
    }
}
