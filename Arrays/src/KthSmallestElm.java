import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        Arrays.sort(arr);
        if(k >= 1 && k <= n){ // check k is valid
            System.out.println("The " + k + "-th smallest element is: " + arr[k-1]);
        } else {
            System.out.println("Invalid value of k");
        }

    }
}
