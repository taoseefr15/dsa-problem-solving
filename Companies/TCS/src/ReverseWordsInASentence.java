
import java.util.Scanner;

public class ReverseWordsInASentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        while (T-- > 0) {
            String line = sc.nextLine();

            String[] words = line.trim().split("\\s+");

            StringBuilder sb = new StringBuilder();

            for (int i = words.length - 1; i >= 0; i--) {
                sb.append(words[i]);

                if (i != 0) {
                    sb.append(" ");
                }
            }

            System.out.println(sb);
        }

        sc.close();
    }
}

