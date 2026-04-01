/*
Given an arr where all its elements are sorted in increasing order
except two swapped elements , sort it in linear time , assume there
are no duplicates in the arr.

input: {3,8,6,7,5,9,10}
output: {3,5,6,7,8,9,10}

 */


import java.util.Scanner;

public class sortArrImpQ {
    static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
//        System.out.println();
    }

    static void sortArr(int[] arr){
        int n = arr.length;
        int x = -1, y = -1;
        if(n <= 1) return;
        for(int i = 1; i < n; i++){
            if(arr[i-1] > arr[i]){
                if(x == -1){
                    x = i-1;
                    y = i;
                }else{
                    y = i;
                }
            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        //int[] arr = {3, 8, 6, 7, 5, 9, 10};
        sortArr(arr);
        printArray(arr);
    }
}
