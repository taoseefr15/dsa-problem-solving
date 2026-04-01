import java.util.Scanner;

//public class sortNumSqr {
//    static void printArray(int[] arr){
//        for (int j : arr) {
//            System.out.println(j);
//        }
//        System.out.println();
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
//    static void reverse(int[] arr){
//        int i=0,j=arr.length-1;
//        while(i<j){
//            swap(arr,i,j);
//            i++;
//            j--;
//        }
//    }
//
//    static int[] sqr(int[] arr){
//        int n = arr.length;
//        int left = 0,right=n-1;
//        int k = 0;
//        int[] ans = new int[n];
//        while(left<=right){
//            if(Math.abs(arr[left])>Math.abs(arr[right])){
//                ans[k++] = arr[left]*arr[left];
//                left++;
//            }else{
//                ans[k++] = arr[right]*arr[right];
//                right--;
//            }
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int[] ans = sqr(arr);
//        reverse(ans); // or k=n-1 and k--;
//        printArray(ans);
//    }
//}



public class sortNumSqr {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr){
        int n = arr.length;
        int i=0, j=n-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] numSqr(int[] arr){
        int n = arr.length;
        int start = 0, end = n-1, k=n-1;
        int[] ans = new int[n];
        while(start<=end){
            if(Math.abs(arr[start])>Math.abs(arr[end])){
                ans[k--] = arr[start]*arr[start];
                start++;
            } else {
                ans[k--] = arr[end]*arr[end];
                end--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = numSqr(arr);
        printArray(ans);
    }
}