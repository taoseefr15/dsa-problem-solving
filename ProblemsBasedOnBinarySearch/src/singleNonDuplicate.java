/*
You are given a sorted array consisting of only integers where every element
appears exactly twice,except for one element which appears exactly once.
Return the single element that appears only once.
Your solution must run in O(log n) time and O(1) space.

Example 1:
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2

Example 2:
Input: nums = [3,3,7,7,10,11,11]
Output: 10

Constraints:

1 <= nums.length <= 105
0 <= nums[i] <= 105
 */

import java.util.Scanner;

public class singleNonDuplicate {
    static int nonDuplicate(int[] a){
        int i = 0, j = a.length - 1;

        while(i < j){
            int mid = i + (j - i) / 2;

            if(mid % 2 == 1) mid--;

            if(a[mid] == a[mid+1]){
                i = mid + 2;
            }else{
                j = mid;
            }
        }

        return a[i];
    }
    public static void main(String[] args) {
        int[] a = {3,3,7,7,10,11,11};
        System.out.println(nonDuplicate(a));
    }
}
