import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        String  s1 = sc.next(); // sc.next --> not read space
//        System.out.println(s1);

        String s2 = sc.nextLine(); // read with space
        System.out.println(s2);

//        for(int i=0; i<s2.length(); i++){
//            System.out.println(s2.charAt(i));
//        }

        System.out.println(s2.substring(1,5));
    }
}