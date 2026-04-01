import java.util.Scanner;

public class ReverseArray {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int[] reverse(int[] arr) {
        int n = arr.length;
        int j = 0;
        int[]  temp = new int[n];
        for (int i = n-1; i >= 0; i--) {
            temp[j++] = arr[i];

        }
        return temp;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseInPlace(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] temp = reverse(arr);
        printArray(temp);
        reverseInPlace(arr);
        printArray(arr);
    }
}
