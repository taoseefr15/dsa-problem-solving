/*
Q4 - Given an array of n elements, the task is to find the elements that are greater than half of elements in an array.
 In case of odd elements, we need to print elements larger than floor(n/2) elements where n is the total number of
elements in the array.

Input1:
n = 4
arr[] = [1, 6, 3, 4]
Output1:
4 6

Input2:
n = 5
arr[] = [10, 4, 2, 8, 9]
Output2:
10 9 8

 */
public class returnHalfGreatestElements {
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=n-1;i>=n/2;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 8, 9,12,5};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
