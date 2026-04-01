import java.util.Scanner;

public class RotateMatrix {
    static void transposeInPlace(int[][] matrix, int r, int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void reverseArray(int[] arr){
        int i=0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
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

        transposeInPlace(matrix,r,c);

    }
}
