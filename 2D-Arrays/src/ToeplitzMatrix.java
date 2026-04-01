import java.util.Scanner;
public class ToeplitzMatrix {
    static boolean teoplitzMatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i = 0; i < r - 1; i++){
            for(int j = 0; j < c -1; j++){
                if(matrix[i][j] != matrix[i + 1][j + 1]) return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Rows: ");
        int r = sc.nextInt();
        System.out.println("Enter number of Columns: ");
        int c = sc.nextInt();
        System.out.println("Enter Elements of Matrix: ");
        int[][] matrix = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Toeplitz Matrix: " + teoplitzMatrix(matrix));
    }
}
