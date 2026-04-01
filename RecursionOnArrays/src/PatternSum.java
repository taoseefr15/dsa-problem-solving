/*
Q2 - Given an array of integers, print a sum triangle from it such that the first level(the bottom
level in triangular fashion) has all array elements. From then, at each level, the number of
elements is one less than the previous level and elements at the level is the sum of
consecutive two elements in the previous level.

(Medium)

Input1 : n = 5
arr = {1, 2, 3, 4, 5}
Output1 : [48]
[20, 28]
[8, 12, 16]
[3, 5, 7, 9]
[1, 2, 3, 4, 5]
 */

import java.util.Arrays;
import java.util.Scanner;

public class PatternSum {
    static void adjacentElementSum(int[] arr){
        if(arr.length < 1) return;

        int[] temp = new int[arr.length-1];
        for(int i=0; i<arr.length-1; i++){
            int x = arr[i] + arr[i+1];
            temp[i] = x;
        }
        adjacentElementSum(temp);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of the Array: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        adjacentElementSum(arr);
    }
}
