import java.util.*;

public class Pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= i; j++) row.append("*");
            System.out.println(row.toString());
        }
        System.out.println();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        System.out.println();

        for(int i=1; i<=n; i++){
            for(int s=1; s<=n-i; s++)
                System.out.print(" ");

            for(int j=1; j<= 2*i-1; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
