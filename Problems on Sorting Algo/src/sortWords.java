import java.util.Scanner;

public class sortWords {
    static void sort(String[] word){
        int n = word.length;
        for(int i = 0; i < n-1; i++){
            int minIdx = i;
            for(int j = i+1; j < n; j++){
                if(word[j].compareTo(word[minIdx]) < 0){
                    minIdx = j;
                }
            }
            if(i != minIdx){
                String temp = word[i];
                word[i] = word[minIdx];
                word[minIdx] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] word = s.split(" ");
        sort(word);
        for(String w : word){
            System.out.print(w + " ");
        }
    }
}
