import java.util.Scanner;

public class sortWordUsingBubbleSort {
    static void bubbleSort(String[] word){
        int n = word.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                if(word[j].compareTo(word[j+1]) >= 0){
                    String temp = word[j];
                    word[j] = word[j+1];
                    word[j+1] = temp;
                }
            }
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of String");
        int n = sc.nextInt();
        String[] word = new String[n];
        System.out.println("Enter String");
        for(int i = 0; i < n; i++){
            word[i] = sc.next();
        }
        bubbleSort(word);
        for(String str : word){
            System.out.print(str + " ");
        }
    }
}
