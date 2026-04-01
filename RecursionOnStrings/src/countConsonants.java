/*
Q3. Given a string, count total number of consonants in it. A consonant is an English alphabet
character that is not vowel (a, e, i, o and u). Examples of constants are b, c, d, f, and g.

pwskills
7

codIng
4
 */

import java.util.Scanner;

public class countConsonants {
    static int consonant(String s, int idx){

        if(s.length() == idx) return 0;

        char ch = Character.toLowerCase(s.charAt(idx));
        int count = 0;

        if (ch >= 'a' && ch <= 'z' && "aeiou".indexOf(ch) == -1) {
            count = 1;
        }


        return count + consonant(s, idx+1);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(consonant(s,0));
    }
}
