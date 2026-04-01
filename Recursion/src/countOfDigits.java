import java.util.Scanner;

public class countOfDigits {
    static int count(int n){
        int k = 0;
        if(n>=0 && n<=9){
            return 1;
        }
        return 1 + count(n/10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }
}
