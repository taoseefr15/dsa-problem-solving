import java.util.Scanner;

public class prefixSum {
    static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void findPrefixSum(int[][] matrix, int l1, int l2, int r1, int r2){
        int sum = 0;
        for(int i=l1; i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum += matrix[l1][r1];
            }
        }
        System.out.println("Sum of matrix: " + sum);
    }

    static void findPrefixSumMatrix1(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        //traverse horizontally to calculate row-wise prefix sum
        for(int i = 0; i<r;i++){
            for(int j=1; j<c; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }

    static void findPrefixSumMatrix2(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        //traverse horizontally to calculate row-wise prefix sum
        for(int i = 0; i<r;i++){
            for(int j=1; j<c; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

        //traverse perpendicularly to calculate column-wise prefix sum
        for(int j=0; j<c;j++){
            for(int i=1; i<r;i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }

    static int findPrefixSumMatrix(int[][] matrix, int l1, int l2, int r1, int r2){
        int sum = 0;
        findPrefixSumMatrix2(matrix);
        for(int i=l1; i<=l2; i++){
            if(r1>=1)
                sum += matrix[i][r2] - matrix[i][r1-1];
            else
                sum += matrix[i][r2];
        }

        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Row and Column : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Enter Elements of Matrix : ");
        int[][] matrix = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter l1 and l2 : ");
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();

        System.out.println("Enter r1 and r2 : ");
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();

        findPrefixSum(matrix,l1,l2,r1,r2);
        System.out.println("Prefix sum is: " + findPrefixSumMatrix(matrix,l1,l2,r1,r2));
    }
}
