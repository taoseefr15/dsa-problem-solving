import java.util.Scanner;

/*
3Q2. Given an integer array arr, return the number of consecutive sequences(subarrays) with
odd sum.
Input1:
N = 3
[1,3,5]
Output1:
4
Input2:
N = 3
[2,4,6]
Output2:
0
*/

public class ConsecutiveSeq {
//    static int seq(int[] arr) {
//        int n = arr.length;
//        int count = 0;
//
//        // Loop for starting index of subarray
//        for (int i = 0; i < n; i++) {
//            int sum = 0;  // reset sum for each new start
//            // Loop for ending index of subarray
//            for (int j = i; j < n; j++) {
//                sum += arr[j];  // add current element
//                if (sum % 2 == 1) { // check odd sum
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        // Example test cases
//        int[] arr1 = {1, 3, 6};
//        int[] arr2 = {2, 4, 6};
//
//        System.out.println("Output1: " + seq(arr1));  // expected 4
//        System.out.println("Output2: " + seq(arr2));  // expected 0
//    }

    public static void main(String[] args){
        int[] arr = {1, 3, 6};

        int even=0,odd=0,sum=0;
        for(int num:arr){
            if(num%2==1){
                int temp = odd;
                odd = even;
                even = temp;
                odd++;
            }else{
                even++;
            }
            sum += odd;
        }
        System.out.println(sum);
    }
}

