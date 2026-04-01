import java.util.Scanner;

public class UniqueElm {

    static int non(int[] arr){
        int n = arr.length;
        int ans = -1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for (int j=0;j<n;j++){
            if (arr[j]>-1){
                ans=arr[j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(non(arr));
    }
}
