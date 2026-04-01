import java.util.Scanner;

public class PresentQuery {
    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];
        for (int j : arr) {
            freq[j]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq = makeFrequencyArray(arr);
        System.out.println("Enter query: ");
        int q = sc.nextInt();
        while(q>0){
            System.out.println("Enter number to be searched:");
            int x =  sc.nextInt();
            if(freq[x]>0){
                System.out.println(x+" is present in the array");
            }else{
                System.out.println(x+" is not present in the array");
            }
            q--;
        }
    }
}
