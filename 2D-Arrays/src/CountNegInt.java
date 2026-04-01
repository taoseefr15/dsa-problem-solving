public class CountNegInt {
    static int countNegNum(int[][] grid){
        int count = 0, r = grid.length, c = grid[0].length;
        for(int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.print("Number of Negative Numbers: " + countNegNum(grid));
    }
}
