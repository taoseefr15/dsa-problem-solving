/*
Q2. Given an array of positive and negative numbers, arrange them in an alternate fashion such that
every positive number is followed by a negative and vice versa maintaining the order of appearance.
The number of positive and negative numbers need not be equal. Begin with a negative number.
If there are more positive numbers, they appear at the end of the array. If there are more negative
numbers, they too appear at the end of the array.
(Assume 1 based indexing)
Input 1:
N = 6
arr[] = {1, 2, 3, -4, -1, 4}
Output 1:
arr[] = {-4, 1, -1, 2, 3, 4}
Input 2:
N = 4
arr[] = {1, 2, 3, -4}
Output 2:
arr[] = {-4, 1, 2, 3}
 */



public class AltPosNeg {
    static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    static int[] alternate(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int[] pos = new int[n];
        int[] neg = new int[n];
        int p=0; int q=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos[p++] = arr[i];
            }else{
                neg[q++]=arr[i];
            }
        }
        return pos;
    }
    public static void main(String[] args) {
        int[] arr = {2,-5,6,-8,-6,5};
//        Arrays.sort(arr);
        int[] pos = alternate(arr);
        alternate(pos);
        printArray(pos);
    }
}
