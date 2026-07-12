
import java.util.*;

public class Main{

    public static int pSubString(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                String sa = s.substring(i,j);
                if(isPalindrome(sa)){
                    count++;
                }
            }
        }
        return count;
    }
    //Print Subsequence
    public static void ssq(String s, String currAns) {
        if (!s.isEmpty() && isPalindrome(s)) {
            System.out.println(currAns);
            return;
        }

        char currChar = s.charAt(0);
        String remString = s.substring(1);

        ssq(remString, currAns + currChar); // include
        ssq(remString, currAns);            // exclude
    }

    // Remove Occurrence of a character
    public static String removeA(String s, int idx){
        if(idx == s.length()) return "";

        String smallAns = removeA(s,idx+1);
        char currChar = s.charAt(idx);

        if(currChar != 'a'){
            return currChar + smallAns;
        }else{
            return smallAns;
        }
    }

    public static String removeA2(String s){
        if(s.isEmpty()) return "";

        String smallAns = removeA2(s.substring(1));
        char currChar = s.charAt(0);

        if(currChar != 'a'){
            return currChar + smallAns;
        }else{
            return smallAns;
        }
    }

    //Check Palindrome
    public static boolean isPalindrome(String s){
        int l=0, r=s.length()-1;
        if(l>=r) return true;
        return s.charAt(l) == s.charAt(r) && isPalindrome(s.substring(1, s.length() - 1));
    }

    //Reverse of String
    public static String reverse(String s){
        if(s.isEmpty()) return "";

        String smallAns = reverse(s.substring(1));
        char currChar = s.charAt(0);

        return smallAns + currChar;
    }

    // Sum Of Arr
    public static double Sum(int[] a, int idx){
        if(idx == a.length-1) return a[idx];
        return a[idx] + Sum(a, idx+1);
    }

    //Find Target
    public static boolean Target(int[] arr,int n, int target, int idx){
        if(idx >= n) return false;
        if(idx == target) return true;
        return Target(arr,n,target,idx+1);

    }

    //Find Indices
    public static ArrayList<Integer> allIndices(int[] a, int target, int idx){
        if(idx >= a.length) return new ArrayList<Integer>();

        ArrayList<Integer> ans = new ArrayList<>();

        if(a[idx] == target) ans.add(idx);

        ArrayList<Integer> smallAns = allIndices(a, target, idx+1);
        ans.addAll(smallAns);
        return ans;
    }


    public static void main(String[] args){
        int[] a = {8,98,745,868,54,55,4,48,898,44844,9,84,8898,98,46,844,84,84,8,88,631354,3,6,4611,64,46,8,465,168,45,
                116,456,188,45,14,48,44,48,44984,4,231651,5644,56116,544,44,65,44,465,1165,465,456134,651,66554,25,55,31,
                654,1,65,44,4465,65,44,55,4565,32,1656,133,55,165,455,15,42,1656,55,55,165,51,45};

        String s = "abc";

        System.out.println(Sum(a,0));
        System.out.println(Target(a,a.length,55,0));
        System.out.println(allIndices(a,45,0));
        System.out.println(removeA(s,0));
        System.out.println(removeA2(s));
        System.out.println(reverse(s));
        System.out.println(isPalindrome(s));

        ssq(s,"");
        System.out.println(pSubString(s));
    }
}
