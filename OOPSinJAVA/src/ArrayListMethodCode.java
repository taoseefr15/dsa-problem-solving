import java.util.Arrays;

public class ArrayListMethodCode {
    public static class ArrayList{
        int[] arr =  new int[2];
        int idx = 0;
        int  size = 0;
        public void add(int x){
            if(size == arr.length){
                int[] temp = Arrays.copyOf(arr,arr.length*2);
                arr = new int[temp.length];
                arr = Arrays.copyOf(temp,temp.length);

// Or
                // arr = temp;
            }
            arr[idx] = x;
            idx++;
            size++;
        }
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
    }
}
