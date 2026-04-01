//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int subArr(int[] a,int k){
        int n = a.length;
        int count = 0, pref = 0,sum=0;
        for(int i=0;i<n;i++){
            sum += a[i];
        }
        for(int i=0;i<n;i++){
            pref += a[i];
            int suf = sum-pref;
            if(a[i]==k){
                count++;
            }
            if(pref==k){
                count++;
            }
            if(suf==k){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] a = {1,2,3};
        int k = 3;
        System.out.println(subArr(a,k));
    }
}
