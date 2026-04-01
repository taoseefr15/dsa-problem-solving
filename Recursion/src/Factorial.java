import java.util.Scanner;

public class Factorial {
    static int fact(int n){
        if(n==0) return 1;
        int ans = fact(n-1);
        return n*ans;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid number: ");
        int n = sc.nextInt();
    }
}
