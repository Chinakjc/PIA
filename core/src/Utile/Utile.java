package Utile;

public class Utile {
    public static double norme2(double x,double y){
        return Math.sqrt(x*x + y*y);
    }

    public static double distance2(double x1, double y1, double x2, double y2){
        return Utile.norme2(x2-x1,y2-y1);
    }
}
