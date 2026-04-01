import java.util.Scanner;

/*
Q1. Given an array arr[] of size n, find the first repeating element. The element should occur more than
once and the index of its first occurrence should be the smallest. If no repeating element exists, print -1.
(Easy)
Input 1:
n = 7
arr[] = {1, 5, 3, 4, 3, 5, 6}
Output 1:
2
Input 2:
n = 4
arr[] = {2, 5, 3, 4}
Output 2:
-1
*/
public class firstElmOccurrence {
    static int count(int[] arr){
        int count=0;
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,2,7,6};
        System.out.println(count(arr));
    }
}
