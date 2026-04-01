import java.util.Scanner;

public class Main {
    static int minCost(int[] h, int n, int idx){
        if(idx == n-1){
            return 0;
        }
        int op1 = Math.abs(h[idx]-h[idx+1]) + minCost(h, n, idx+1);
        if(idx == n-2) return op1;
        int op2 = Math.abs(h[idx] - h[idx+2]) + minCost(h,n,idx+2);
        return Math.min(op1,op2);
    }
    public static void printSSQ(String a, String b){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr Size: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] h = new int[n];
        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
        }
        System.out.println(minCost(h,n,0));
    }
}