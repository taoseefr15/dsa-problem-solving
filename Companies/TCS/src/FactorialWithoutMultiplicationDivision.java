import java.util.Scanner;

public class FactorialWithoutMultiplicationDivision {
    public static int solution(int n){
        if(n == 0) return 1;
        return n*solution(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc. nextInt();
        while(T --> 0){
            int n = sc.nextInt();
            System.out.println(solution(n));
        }
    }
}
