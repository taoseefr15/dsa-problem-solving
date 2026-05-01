import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int e = sc.nextInt();
    ArrayList<Integer>[] adj = new ArrayList[n];
    for(int i=0; i<n; i++){
      adj[i] = new ArrayList<>();
    }
  }
}