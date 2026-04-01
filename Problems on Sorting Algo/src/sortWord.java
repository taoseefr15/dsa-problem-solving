import java.util.Scanner;

public class sortWord {
    static void sort(String s){
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        String sorted = new String(arr);
        System.out.println(sorted);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = sc.nextLine();
        sort(s);
    }
}
