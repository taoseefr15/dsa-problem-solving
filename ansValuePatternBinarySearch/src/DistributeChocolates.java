/*
you have n boxes (n <= 10^5) of chocolates. each box contains a[i] (a[i] <= 10000) chocolates. You need to distribute these
boxes among 'm' students such that max no. of chocolates allocated to a student is min.
     1. One box will be allocated to exactly one student.
     2. All box should be allocated.
     3. Each student has to be allocated at least one box.
     4. Allotment should be in contiguous order for a instance , a student can not be allocated box1 and box3, skipping box2.
Calculate and return that min possible number.
Assume that it is always possible to distribute the chocolates.

Input:
      N = 4,
      arr = {12, 34, 67, 90}
      M = 3
Output:
      113

 */


import java.util.Scanner;

public class DistributeChocolates {

    static boolean isDivisionPossible(int[] a, int m, int maxChocAllocated) {
        int NumOfStudents = 1;
        int choc = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] > maxChocAllocated) return false;
            if(choc + a[i] == maxChocAllocated){
                choc  += a[i];
            }else{
                NumOfStudents++;
                choc = a[i];
            }
            }
        if(NumOfStudents > m){
            return false;
        }
        return true;
    }

    static int distributeChocolates(int[] a, int m, int maxChocAllocated) {
        if(a.length<m) return -1;

        int st = 1, end = (int)1e9, ans = 0;
        while(st<=end){
            int mid = st + (end - st)/2;
            if(isDivisionPossible(a,m,mid)){
                ans = mid;
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Boxes: ");
        int n = sc.nextInt();
        System.out.println("Enter Number of Chocolates: ");
        int[] a  = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Number of Students: ");
        int m = sc.nextInt();

        System.out.println(distributeChocolates(a, m,0));
    }

}
