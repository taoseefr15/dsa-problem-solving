import java.util.Scanner;

public class DistributeChocolates {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Boxes: ");
        int n = sc.nextInt();
        System.out.println("Enter Number of Chocolates: ");
        int[] a  = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Number of Students: ");
        int m = sc.nextInt();
    }
}
