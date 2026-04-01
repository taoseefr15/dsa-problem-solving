/*
Q4. Given a string, return the number of lowercase characters in it using recursion.

CollegeWallah
11

pwskiLLS
5

 */
import java.util.Scanner;

public class countLowercaseChar {
    static int lowercase(String s, int idx){
        if(idx == s.length()) return 0;
        int count=0;
        if(Character.isLowerCase(s.charAt(idx))) count++;

        return count + lowercase(s, idx+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lowercase(s,0));
    }
}
