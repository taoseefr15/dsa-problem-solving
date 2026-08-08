import java.util.Scanner;

public class RotateArr {
    public static void swap(int[] arr, int l, int r){
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    public static int[] solution(int[] arr, int k){
        int n = arr.length;
        swap(arr, 0, k-1);
        swap(arr, k,n-1);
        swap(arr, 0,n-1);

        return arr;
    }
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T --> 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();

            printArr(solution(arr,k));
        }
    }
}
