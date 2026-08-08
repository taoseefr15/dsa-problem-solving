import java.util.Scanner;

public class VehicleManufacturing {

    public static void solution(int v, int w) {

        int f = 0;
        boolean found = false;

        while (v >= 0) {

            int sum = v * 2 + f * 4;

            if (sum == w) {
                System.out.println(v + " " + f);
                found = true;
                break;
            }

            v--;
            f++;
        }

        if (!found) {
            System.out.println("-1");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int v = sc.nextInt();
            int w = sc.nextInt();

            solution(v, w);
        }

        sc.close();
    }
}