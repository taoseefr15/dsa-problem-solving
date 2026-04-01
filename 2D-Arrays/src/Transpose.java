import java.util.Scanner;

public class Transpose {
    static void printArray(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] findTranspose(int[][] arr,int r,int c){
        int[][] ans = new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }

    static void TransposeInPlace(int[][] arr,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows: ");
        int r = sc.nextInt();
        System.out.println("Enter number of Columns: ");
        int c = sc.nextInt();
        System.out.println("Enter Elements of Matrix: ");
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
//        int[][] ans = findTranspose(arr,r,c);
        TransposeInPlace(arr,r,c);
        printArray(arr);
    }
}
