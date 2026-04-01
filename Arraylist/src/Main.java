import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static void reverse(ArrayList<Integer> l){
        int i = 0, j = l.size()-1;
        while(i<j){
            Integer temp = Integer.valueOf(l.get(i));
            l.set(i, l.get(j));
            l.set(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();

        l.add(1);
        l.add(2);
        l.add(13);
        l.add(3);
        l.add(4);
        l.add(12);
        l.add(5);
        l.add(55);
        l.add(6);
        l.add(17);
        l.add(7);
        l.add(19);
        l.add(8);
        l.add(9);
        l.add(34);
        l.add(10);
//        System.out.println("Unsorted List: " + l);
//        Collections.sort(l);
//        System.out.println("Sorted List: " + l);
//        Collections.reverse(l);
//        System.out.println("Reverse List: " + l);
//        Collections.sort(l,Collections.reverseOrder());
//        System.out.println("Descending order List: " + l);
        System.out.println("Original list: " + l);
        reverse(l);
        Collections.sort(l);
        System.out.println("Sorted list: " + l);
        System.out.println() ;
        System.out.println("Reversed list: " + l);


    }

}
