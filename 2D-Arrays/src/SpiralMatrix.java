import java.util.Scanner;

public class SpiralMatrix {

    // Function to print 2D array (Normal order)
    static void PrintArray(int[][] ans){
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to print matrix in spiral order
    static void spiralMatrix(int[][] matrix, int r, int c){

        // Boundaries initialize kar rahe hain
        int topRow = 0;          // top boundary
        int bottomRow = r - 1;   // bottom boundary
        int leftCol = 0;         // left boundary
        int rightCol = c - 1;    // right boundary

        // Total printed elements ka count
        int totalElements = 0;

        // Jab tak saare elements print na ho jaye
        while(totalElements < r * c){

            // 🔹 1. Top Row: leftCol → rightCol
            for(int j = leftCol; j <= rightCol && totalElements < r * c; j++){
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++; // top boundary niche shift

            // 🔹 2. Right Column: topRow → bottomRow
            for(int i = topRow; i <= bottomRow && totalElements < r * c; i++){
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--; // right boundary left shift

            // 🔹 3. Bottom Row: rightCol → leftCol
            for(int j = rightCol; j >= leftCol && totalElements < r * c; j--){
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--; // bottom boundary upar shift

            // 🔹 4. Left Column: bottomRow → topRow
            for(int i = bottomRow; i >= topRow && totalElements < r * c; i--){
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++; // left boundary right shift
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Matrix size input
        System.out.println("Enter size of Row: ");
        int r = sc.nextInt();

        System.out.println("Enter size of Column: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        // Matrix elements input
        System.out.println("Enter elements of matrix: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Spiral order print
        System.out.println("Spiral Order:");
        spiralMatrix(matrix, r, c);

        System.out.println("\n\nOriginal Matrix:");
        PrintArray(matrix);
    }
}
