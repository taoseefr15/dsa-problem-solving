import java.util.Scanner;

public class PlateCount {

    static int[] FreqArr(int[] AT){
        int[] fr = new int[100005];
        for (int i=0; i<AT.length; i++) {
            fr[AT[i]]++;
        }
        return fr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of arrived trains: ");
        int n = sc.nextInt();
        int[] AT = new int[n];
        System.out.println("Enter Arrival times: ");
        for(int i=0;i<n;i++){
            AT[i]=sc.nextInt();
        }
        int[] freq = FreqArr(AT);
        System.out.println("Number of frequent places: ");
        int p = sc.nextInt();
        while(p>0){
            int count=0;
            System.out.println("Enter DP: ");
            int dp = sc.nextInt();

           p--;
        }

    }
}
