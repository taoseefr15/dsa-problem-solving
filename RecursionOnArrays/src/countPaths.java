/*
Q1 - Count all the possible paths on an m x n grid from top left (grid[0][0]) to bottom right (grid[m-1][n-1])
having constraints that from each cell you can either move only to right or down.
Input: m = 2, n = 3
Expected Output: 3
 */

import java.util.Scanner;

public class countPaths {
    static int paths(int i, int j, int n, int m){
        if(i >= n || j >= m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        return paths(i, j+1, n,m) + paths(i+1, j, m, n);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
       //int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(paths(0,0,n,m));

    }
}
