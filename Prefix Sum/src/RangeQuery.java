import java.util.Scanner;

public class RangeQuery {
    static void printArray(int[] arr1){
        for(int i=1;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }
    static int[] pref(int[] arr1){
        int n = arr1.length;
        for(int i=1;i<n;i++){
            arr1[i] = arr1[i-1] + arr1[i];
        }
        return arr1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {2,1,3,4,5};
        int[] prefix = pref(arr1);
        System.out.println("Enter number of Queries: ");
        int q = sc.nextInt();

        while(q-- > 0){
            System.out.println("Enter Range: ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefix[r] - prefix[l-1];
            System.out.println(ans);
        }

//        pref(arr1);
//        printArray(arr1);
    }
}
