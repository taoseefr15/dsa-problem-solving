import java.util.Scanner;

public class SpiralMatrixGen {

    // Function to print the matrix
    static void printMatrix(int[][] matrix){
        int n = matrix.length;

        // Row-wise printing
        for(int i = 0; i < n; i++){
            for(int j = 0; j < matrix[i].length; j++){
                // Print element in same line
                System.out.print(matrix[i][j] + " ");
            }
            // New line after each row
            System.out.println();
        }
    }

    // Function to generate spiral matrix of size n x n
    static int[][] matrixGen(int n){

        // Create n x n matrix
        int[][] matrix = new int[n][n];

        // Boundaries
        int tr = 0;        // top row
        int br = n - 1;    // bottom row
        int lc = 0;        // left column
        int rc = n - 1;    // right column

        int ce = 1;  // current element to be inserted

        // Jab tak sare elements fill na ho jaye
        while(ce <= n * n){

            // 1. Top Row: leftCol → rightCol
            for(int j = lc; j <= rc && ce <= n * n; j++){
                matrix[tr][j] = ce++;
            }
            tr++;  // top boundary move down

            // 2. Right Column: topRow → bottomRow
            for(int i = tr; i <= br && ce <= n * n; i++){
                matrix[i][rc] = ce++;
            }
            rc--;  // right boundary move left

            // 3. Bottom Row: rightCol → leftCol
            for(int j = rc; j >= lc && ce <= n * n; j--){
                matrix[br][j] = ce++;
            }
            br--;  // bottom boundary move up

            // 4. Left Column: bottomRow → topRow
            for(int i = br; i >= tr && ce <= n * n; i--){
                matrix[i][lc] = ce++;
            }
            lc++;  // left boundary move right
        }

        return matrix;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Input size of matrix
        System.out.println("Enter size of matrix row or column: ");
        int n = sc.nextInt();

        // Generate spiral matrix
        int[][] ans = matrixGen(n);

        // Print result
        System.out.println("Spiral Matrix:");
        printMatrix(ans);
    }
}

