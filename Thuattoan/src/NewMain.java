/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(NewMain.pointInTriangle(0,0,4,0,0,4,1,1));
        System.out.println(NewMain.pointInTriangle(0,0,2,0,0,2,11,11));
        System.out.println(NewMain.pointInTriangle(0,0,2,0,0,2,1,0));
    }
    private static boolean pointInTriangle(int x1,int y1,int x2,int y2,int x3,int y3,int x,int y)
    {
        int denominator = ((y2 - y3)*(x1 - x3) + (x3 - x2)*(y1 - y3));
        int a = ((y2 - y3)*(x - x3) + (x3 - x2)*(y - y3)) / denominator;
        int b = ((y3 - y1)*(x - x3) + (x1 - x3)*(y - y3)) / denominator;
        int c = 1 - a - b;

        return 0 <= a && a <= 1 && 0 <= b && b <= 1 && 0 <= c && c <= 1;
    }

    
}
