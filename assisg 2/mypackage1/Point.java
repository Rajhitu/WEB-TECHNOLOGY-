package mypackage1;
import java.lang.Math;

public class Point {
    double x, y, distance;

    public Point() {
        x = 0.0;
        y = 0.0;
        distance = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distance;
    }

    public double distance(double x, double y) {
        distance = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
        return distance;
    }

    public double distance(Point another) {
        distance = Math.sqrt(Math.pow((this.x - another.x), 2) + Math.pow((this.y - another.y), 2));
        return distance;
    }
}