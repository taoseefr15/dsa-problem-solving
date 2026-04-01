import java.util.Scanner;
public class Main{
//    static void num(int n){
//        if(n==1){
//            System.out.println(1);
//            return;
//        }
//        System.out.println(n+ " ");
//        num(n-1);
//
//    }

//    static int fact(int n){
//        if(n==0 || n==1) return 1;
//        return fact(n-1)*n;
//    }

    static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //num(n);
        //System.out.println(fact(n));
//        for (int i = 0; i < n; i++) {
//            System.out.print(fib(i) + " ");
//        }
    }
}
