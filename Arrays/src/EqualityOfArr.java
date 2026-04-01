import java.util.Scanner;

public class EqualityOfArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        boolean flag=true;
        int m =sc.nextInt();
        int[] arr2=new int[m];
        for(int j=0;j<m;j++){
            arr2[j]=sc.nextInt();
            if(arr1[j]!=arr2[j]){
                flag=false;
            }else {
                flag=true;
            }
        }
        System.out.println(flag);
    }
}
