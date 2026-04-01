import java.util.Scanner;

public class Occurrences {
    static int occur(int[] arr,int x) {
        int n = arr.length;
        int count = 1;
        for (int i = 0; i < n; i++) {
                if (arr[i] == x) {
                    count++;
                }

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.println(occur(arr, x));
    }
}
