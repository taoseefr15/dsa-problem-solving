public class canPartitionGrid {
    static long sum(int[][] matrix){
        long sum = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    static void main(String[] args) {
        int[][] mt = {{1,4},{2,3}};
        System.out.println(sum(mt));
    }
}
