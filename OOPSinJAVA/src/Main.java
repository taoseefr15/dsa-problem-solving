import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static class ArrayList{
        int[] arr =  new int[10];
        int size = 0;
        public void add(int x){
            arr[size] = x;
            size++;
        }
    }
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        System.out.println(list);
        System.out.println(list);
    }
}