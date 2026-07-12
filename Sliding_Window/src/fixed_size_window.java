public class fixed_size_window {
    public static void fixeSize(String s, int k){
        int left = 0;
        for(int right = 0; right<s.length(); right++){
            if(right-left+1 == k){
                String sub = s.substring(left, right+1);
                System.out.println(sub);

                left++;
            }
        }
    }
    public static void main(String[] args){
        String s = "abcabc";

        fixeSize(s,1);
    }
}
