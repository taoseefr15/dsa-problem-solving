import java.util.Scanner;

public class GoodNumber {
    public static void solution(int num){
        int original = num;
        int sum = 0;
        while(num != 0){
            int dig = num%10;
            sum += dig;
            num /= 10;
        }
        if(original%sum != 0){
            System.out.println("Bad Number");
        }else{
            System.out.println("Good Number");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            int num = sc.nextInt();
            solution(num);
        }
    }
}
