import java.util.Arrays;
import java.util.Scanner;

public class placeNegElmAtEnd {
    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();
        System.out.println("Enter Array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp[] = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                temp[idx++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[idx++] = arr[i];
            }
        }
        printArr(temp);
    }
}
