import java.util.Scanner;

public class UpperTriangularMatrix {
    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] Upper(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(i>j){
                    System.out.println(" ");
                }else{
                    matrix[i][j]= matrix[i][j];
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter the elements of Matrix: ");
        int[][] matrix = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] upperTriangularMatrix = Upper(matrix);
        printMatrix(upperTriangularMatrix);
    }
}
