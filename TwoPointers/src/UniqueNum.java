import java.util.Scanner;
//Q1. Given an integer m, n, and n integers, return true if the number of unique integers among the n
//integers is greater than or equal to m, else return false.(Integers appearing multiple times are all
//considered as 1 unique integer)

//Input1:
//5
//10
//1 2 1 4 5 2 1 1 2 2
//Output1:
//false

//Input2:
//9
//15
//1 4 5 0 9 8 3 7 3 2 6 8 11 15 23
//Output2:
//true

public class UniqueNum {
    static void count(int[] arr){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = arr.length;
        int a=0, b=1, count=0;
        for(int i=0;i<n;i++){
            if(arr[a] != arr[b]){
                count++;
                b++;
            }else{
                a++;
            }
        }
        if(count==m){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,6,9,8,2,4,5,3,6,7};
        count(arr);

    }
}
