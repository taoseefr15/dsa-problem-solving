import java.util.Arrays;
import java.util.Scanner;

public class Union {
    static void printArr(int[] arr,int length){
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first array size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();

        System.out.println("Enter the second array size: ");
        int m = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();

        int[] mrg = new int[n+m];
        for (int i = 0; i < n; i++) mrg[i] = arr1[i];
        for (int i = 0; i < m; i++) mrg[n+i] = arr2[i];
        Arrays.sort(mrg);

        int[] union = new int[m+n];
        int idx = 0;
        for (int i = 0; i < mrg.length-1; i++) {
            if(mrg[i]!=mrg[i+1]){
                union[idx++] = mrg[i];
            }
        }
        union[idx++] = mrg[mrg.length-1];
        printArr(union,idx);
        System.out.println();
        System.out.println(idx);
    }
}
