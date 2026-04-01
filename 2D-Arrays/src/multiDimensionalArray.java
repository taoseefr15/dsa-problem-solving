import java.util.Scanner;

public class multiDimensionalArray {
    static int[][] printArray(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        return a;
    }
    static int[][] Addition(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Sum of Matrices are not possible");

        }else{

        }
        return a;
    }
    public static void main(String[] args){
//        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Rows r1: ");
        int r1 = sc.nextInt();
        System.out.println("Enter no. Columns c1: ");
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter no. of Rows: ");
        int r2 = sc.nextInt();
        System.out.println("Enter no. Columns: ");
        int c2 = sc.nextInt();

        int[][] b = new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j] = sc.nextInt();
            }
        }
        printArray(a);
    }
}
