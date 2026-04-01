import static java.lang.Math.min;
/*
Q3. You are given an integer array height of length n. There are n vertical lines drawn such that the
two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the
most water.
Return the maximum amount of water a container can store.
Input1:
n = 9
height = [1,8,6,2,5,4,8,3,7]
Output1:
49
 */

public class MaxContain {

    // Function to calculate maximum water that can be contained
    static void cont(int[] ht){

        // Total number of bars (length of array)
        int n = ht.length;

        // l = left pointer, r = right pointer
        int l = 0, r = n - 1;

        // ans will store the maximum area found so far
        int ans = 0;

        while(l < r){// Loop jab tak left pointer right se chhota hai

            // Width = distance between left and right pointer
            int w = r - l;

            // Height = minimum of left and right bar
            // Kyunki paani chhoti wall tak hi bharta hai
            int h = Math.min(ht[l], ht[r]);
            int area = w * h;// Area = width * height
            ans = Math.max(ans, area);// Update maximum area

            // Pointer movement logic:
            // Jis side height chhoti hoti hai, us pointer ko move karte hain
            if(ht[l] < ht[r]){
                l++;   // left height chhoti hai, left pointer aage badhao
            } else {
                r--;   // right height chhoti ya barabar hai, right pointer peeche lao
            }
        }
        // Print the maximum container area
        System.out.print(ans);
    }
    public static void main(String[] args){
        int[] ht = {1, 8, 6, 2, 5, 4, 8, 3, 7}; // Given heights of vertical lines

        // Function call
        cont(ht);
    }
}

