/*
Q4. Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
find two numbers such that they add up to a specific target number.
Return the indices of the two numbers added by one. Return -1 if pair does not exist.
Input1:
n = 4
numbers = [2,7,11,15]
target = 9
Output1:
1 2
Input2:
n = 2
numbers = [-1,0]
target = -1
Output2:
1 2
 */

public class pairSumIdx {
    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int n = arr.length;
        int l=0,r=n-1,target=9;
        while(l<r){
            if(arr[l]+arr[r]==target){
                System.out.println(++l+ " "+ ++r);
                break;
            }else if(arr[l]+arr[r]>target){
                r--;
            }else{
                l++;
            }
        }
    }
}
