import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public static List<Integer> gen(int low, int high){
        List<Integer> ans = new ArrayList<>();

        int lowLen = String.valueOf(low).length();
        int highLen = String.valueOf(high).length();

        for(int len = lowLen; len <= highLen; len++){
            for(int st = 1; st <= 10 -len; st++){
                int num = 0;

                for(int i=0; i<len; i++){
                    num = num*10 + (st+i);
                }
                if(num >= low && num <= high){
                    ans.add(num);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int l = 1;
        int h = 900000000;

        System.out.println(gen(l,h));

    }
}
