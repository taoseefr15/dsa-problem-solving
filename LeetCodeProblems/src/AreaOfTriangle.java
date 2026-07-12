public class AreaOfTriangle {

    public static int computeArea(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        int A = x1 * (y2 - y3), B = x2 * (y3 - y1), C = x3 * (y1 - y2);
        int area1 = (A + B + C) / 2;
        int D = x4 * (y1 - y3), E = x3* (y4 - y1), F = x4 * (y1 - y3);
        int area2 = (D + E + F) / 2;

        return (area1 + area2);
    }
    public static void main(String[] args){
        int x1 = -3, x2 = 3, x3 = 1, x4 = 1;
        int y1 = 2, y2 = 4, y3 = 3, y4 = 1;


        System.out.println(computeArea(x1, y1,x2,y2,x3, y3,x4,y4));
    }
}
