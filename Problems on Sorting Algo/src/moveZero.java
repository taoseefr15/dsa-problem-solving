import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class moveZero {
 /*   static int[] move(int[] arr){
        int l=0, r=arr.length-1;
        while(l<r){
            if(arr[l] == 0){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }else if(arr[l] != 0){
                l++;
            }else{
                r--;
            }
        }
        return arr;
    }


  */
    static int[] solve(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] == 0 && arr[j+1] != 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
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
        System.out.println(Arrays.toString(solve(arr)));
    }
}
