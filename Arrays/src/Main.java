import java.util.Scanner;

public class Main {
    static void printArray(int[] arr){  //Print array elements method
        for(int i=0;i<arr.length;i++){
            System.out.printf(arr[i] +" ");
        }
        System.out.println();
    }
    static void swap(int[] arr , int l,int r){   //Swap method
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
    }
    static void moveZeroes(int[] arr){  //Method--- move "0" in right side
        int n = arr.length;
        int l=0, r=n-1;
        while(l<r){
            if(arr[l]==0 && arr[r]>0){
                swap(arr,l,r);
                l++;
                r--;
            }
            if(arr[r]==0) r--;
            if(arr[l]>0) l++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter size of arr : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.printf("Enter number including zeroes : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        moveZeroes(arr);
        printArray(arr);
    }
}