import java.util.Scanner;

public class K_Multiples {
    static void multiples(int num, int k){
//        BASE CASE
        if(k==0){
            return;
        }

//        RECURSIVE WORK
        multiples(num,k-1);

//        SELF WORK
        System.out.println(num*k+ " ");

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        multiples(num,k);
    }
}
