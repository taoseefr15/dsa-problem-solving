public class Main {
    public static void buyAndSell(int[] a){
        int[] ans = new int[a.length];
        int val1 = a[0];
        int max = 0;
        for(int i=1; i<a.length; i++){
            int curr = a[i];

        }

    }
    public static void SumMulti(int n){
        int sum = 0, x = 0;
        int rev = 0, place = 1;

        while(n>0){
            int dig = n%10;
            if(dig != 0){
                x = dig*place + x;
                place *= 10;
                sum += dig;
            }
            n /= 10;
        }

        System.out.println(x);
        System.out.println(sum*x);

    }
    public static void main(String[] args) {
        String a = "100000";
        String b = "100000";
        int  n = 10203004;
        long num = Long.parseLong(a);
        long num1 = Long.parseLong(b);
        long multi = num * num1;

        String str = String.valueOf(multi);
        System.out.println(str);
        SumMulti(n);
    }
}
