import java.util.Scanner;

public class Main {
    static void triangle(int n){
//        int[][] ans = new int[n][];
        for(int i=0; i<=n; i++){
            for(int j=1; j<i+1; j++){
                System.out.print(i*i +" ");
            }
            System.out.println();
        }
    }

    static void num(int n){
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                System.out.print(i+ " ");
            }else{
                System.out.print(-i + " ");
            }

        }
    }
    static void bonus(int n){
        for(int i=0; i<=n; i++){
            if(i<=n/2){
                System.out.println(i);
            }
        }

    }

//    static void str(String s){
//        int l =0, r = s.length()-1;
//        while(l<r){
//            char temp = s.charAt(l);
//            s.charAt(l) = s.charAt(r);
//            s.charAt(r) = temp;
//            l++;
//            r--;
//        }
//    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        //triangle(n);
//        num(n);
//        //bonus(n);
//        String s = "abcde";
//        for(int i=s.length()-1; i>=0; i--){
//            System.out.print(s.charAt(i) +" ");
//        }

        String s2 = "hello world";
        for(int i=s2.length()-1; i>=0; i--){
            while(s2.charAt(i) != ' '){
                System.out.print(s2.charAt(i) + " ");
                break;
            }
        }
    }
}