import java.util.Scanner;

public class NonZeroDiagonalElements {
    static boolean diagonal(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i==j || i+j == matrix.length-1){
                    if(matrix[i][j]==0){
                        return false;
                    }
                }
                else
                    if(matrix[i][j] != 0){
                    return false;
                }
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }

        boolean result = diagonal(a);
        System.out.println(result);
    }
}
