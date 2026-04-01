public class Main {
    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
//    static void InPlace(int[] arr){
//        int i =0;
//        int j = arr.length-1;
//        while(i<j){
//            swap(arr,i,j);
//            i++;
//            j--;
//        }
//    }
    static void rotate1(int[] arr,int k){
        int n = arr.length;
        int j = 0;
        k = k%n;
        int[] ans = new int[n];
        for(int i=0;i>=k-1;i++){
            ans[j++] = arr[i];
        }

    }
    public static void main(String[] args) {
        int[] arr = {4,8,6,9,3,1,2};
//        InPlace(arr);
        printArray(arr);
    }
}