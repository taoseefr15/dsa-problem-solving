public class ReverseNumber {
    public static void reverse1(int n){
        if(n == 0) return;
        System.out.print(n % 10);
        reverse1(n / 10);
    }

    public static void reverse2(int n){
        while(n>0){
            System.out.print(n%10);
            n = n/10;
        }
    }
    public static int reverse3(int n){
        int rev = 0;

        while(n>0){
            rev = rev*10 + n%10;
            n = n/10;
        }
        return rev;
    }
    public static int avoidZero(int n){
        int rev = 0;
        while(n>0){
            int dig = n%10;
            if(dig != 0){
                rev = rev*10 + dig;
            }
            n /= 10;
        }
        return rev;
    }
    public static void main(String [] args){
        int n = 508760607;

        reverse1(n);
        System.out.println();

        reverse2(n);
        System.out.println();

        System.out.print(reverse3(n));
        System.out.println();

        System.out.print(avoidZero(n));
        System.out.println();
    }
}
