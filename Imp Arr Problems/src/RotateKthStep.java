public class RotateKthStep {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swapArray(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr,int st,int end){
        int i=0; int j = arr.length-1;
        while(i<j){
            swapArray(arr,i,j);
            i++;
            j--;
        }

    }
    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        int j = 0;
        k = k%n;
        int[] ans = new int[n];
        for(int i=n-k; i<n; i++){
            ans[j++] = arr[i];
        }
        for(int i =0; i<n-k;i++){
            ans[j++] = arr[i];
        }
        return ans;
    }
    static void rotate2(int[] arr, int k){
        int n = arr.length;
        k = k%n;
//        for(int i=n-k;i<n;i++){
//            reverse(arr);
//        }
//        for(int i=0;i<n-k;i++){
//            reverse(arr);
//        }
        reverse(arr,0,n-k);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

    }
    public static void main(String[] args){
        int[] arr = {6,8,3,4,7,5};
//        System.out.println("Enter k: ");
//        int[] ans = rotate(arr, 3);
//        printArray(ans);

//        reverse(arr);
        rotate2(arr,2);
        printArray(arr);
    }
}
