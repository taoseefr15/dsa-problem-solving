import java.util.Scanner;

public class targetSum {
    static int pairSum(int[] arr, int target){
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }
    static int Diff(int[] arr, int target){
        int n = arr.length;
        int ans1 = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] - arr[j] == target){
                    ans1++;
                }
            }
        }
        return ans1;
    }
    static int pairSum2(int[] arr, int target){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[]  arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Target sum: ");
        int target=sc.nextInt();
        System.out.println(pairSum(arr,target));
        System.out.println(pairSum2(arr,target));
        System.out.println(Diff(arr,target));
    }
}
