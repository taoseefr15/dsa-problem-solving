import java.util.Scanner;

public class Power {
    static int pow1(int p, int q){
        if(q==0) return 1;
        return pow1(p,q-1)*p;
    }

//    Alternate Method
    static int pow2(int p, int q){
        if(q==0) return 1;
        int SmallAns = pow2(p,q/2);
        if(q%2==0){
            return SmallAns*SmallAns;
        }else {
            return p*SmallAns * SmallAns;
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(pow1(p,q));
        System.out.println(pow2(p,q));
    }
}
