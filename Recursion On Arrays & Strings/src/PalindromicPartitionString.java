import java.util.*;

public class PalindromicPartitionString {

    static void solve(String s, int start, List<String> partition) {

        // Base case
        if (start == s.length()) {
            System.out.println(partition);
            return;
        }

        // Try all possible substrings
        for (int i = start; i < s.length(); i++) {

            if (isPalindrome(s, start, i)) {

                // choose
                partition.add(s.substring(start, i + 1));

                // explore
                solve(s, i + 1, partition);

                // backtrack
                partition.remove(partition.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String s, int left, int right) {

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        solve(s, 0, new ArrayList<>());
    }
}