import java.util.Scanner;

public class RotateMatrix {

    public static void printMatrix(int[][] mt) {
        int m = mt.length;
        int n = mt[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mt[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int m = sc.nextInt();
            int n = sc.nextInt();

            int[][] mt = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    mt[i][j] = sc.nextInt();
                }
            }

            // Transpose
            for (int i = 0; i < m; i++) {
                for (int j = i; j < n; j++) {
                    int temp = mt[i][j];
                    mt[i][j] = mt[j][i];
                    mt[j][i] = temp;
                }
            }

            // Reverse every row
            for (int i = 0; i < m; i++) {
                int left = 0;
                int right = mt[i].length - 1;

                while (left < right) {
                    int temp = mt[i][left];
                    mt[i][left] = mt[i][right];
                    mt[i][right] = temp;

                    left++;
                    right--;
                }
            }

            printMatrix(mt);
        }

        sc.close();
    }
}