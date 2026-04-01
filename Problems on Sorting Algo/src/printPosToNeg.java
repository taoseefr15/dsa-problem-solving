/*
given an arr of pos and neg int , segregate them in linear time and constant
space . the output should print all neg numbers, followed by all positive numbers

input: 4,5,-,8,6,-2
output: -8,-2,4,5,6
 */

public class printPosToNeg {
    static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void PosToNeg(int[] arr){
        int n = arr.length;
        int l = 0, r = n-1;
        while(l < r){
            if(arr[l] > 0 && arr[r] < 0){
                swap(arr, l, r);
                l++;
                r--;
            }else if(arr[l] < 0){
                l++;
            }else{
                r--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 11, -13, -5, 6, -7, 5, -3, -6};
        PosToNeg(arr);
        printArr(arr);
    }
}
