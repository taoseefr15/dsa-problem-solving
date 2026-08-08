public class Main{
    public static String test(int x, int y){
        String s1 = "Alice";
        String s2 = "Bob";
        String ans = "";
        int sum = 75*x + 10*y;

        if(sum < 115) return s2;

        while(sum >= 115){
            ans = s1;
            s1 = s2;
            s2 = ans;
            sum -= 115;
        }
        return s1;
    }
    public static void main(String[] args){

        System.out.print(test(4,11));
    }
}