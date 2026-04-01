import java.util.ArrayList;

public class Practice {
    public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println("Original list: " +l);
        l.add(5,6);
        System.out.println("After inserting, list: " +l);
        // remove an element
        l.remove(2);
        System.out.println("After Remove an element at index 2 ---> list: " +l);
    }
}
