import java.util.Scanner;

public class prefixSum {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
//
//    static int[] PrefixSum(int[] arr){
//        int n = arr.length;
//        int[] pref = new int[n];
//        pref[0] = arr[0];
//        for(int i=1;i<n;i++){
//            pref[i] = pref[i-1] + arr[i];
//        }
//        return pref;
//    }

    static void prefSum(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
           arr[i] = arr[i-1]+arr[i];
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
//        int[] pref = PrefixSum(arr);
//        printArray(pref);
        prefSum(arr);
        printArray(arr);
    }
}
