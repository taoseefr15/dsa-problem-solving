public class targetElement {
    static boolean Target(int[][] mt, int target){
        int n = mt.length;
        int m = mt[0].length;
        int st = 0, end = m*n-1;
        while(st <= end){
            int mid = st+(end-st)/2;
            int midElm = mt[mid/m][mid%m];
            if(target == midElm){
                return true;

            }
            if(target > midElm){
                st = mid+1;
            }else {
                end = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] mt = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 7;
        System.out.println(Target(mt, target));
    }
}
