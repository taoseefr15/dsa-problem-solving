import java.util.ArrayList;

public class printSubSequence {

    // Method -- 01
    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();

        if(s.isEmpty()) {
            ans.add("");
            return ans;
        }

        char curr = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));

        for (String ss : smallAns){
            ans.add(ss);          // exclude curr
            ans.add(curr + ss);   // include curr
        }
        return ans;
    }

    // Method -- 02
    static void printSSQ(String s, String currAns){ // s = "abc" , currAns = ""
        if(s.isEmpty()){
            System.out.println(currAns);
            return;
        }

        char curr = s.charAt(0); //a
        String remString = s.substring(1); //bc

        // curr char --> chooses to be a part of currAns
        printSSQ(remString, currAns + curr);

        // curr char --> does not choose to be a part of currAns
        printSSQ(remString, currAns);
    }

    public static void main(String[] args){
        //M-01
//        ArrayList<String> ans = getSSQ("abc");
//        for(String ss: ans){
//            System.out.println(ss);
//        }

        //M-02
        printSSQ("abc", "");
    }
}
