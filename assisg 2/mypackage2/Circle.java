package mypackage2;

import mypackage1.Point;

public class Circle {
    private double radius;
    Point center;

    public Circle(double x, double y, double radius) {
        center = new Point(x, y);
        this.radius = radius;
    }

    public double distance(Circle c1) {
        double d = this.center.distance(c1.center);
        return d;
    }

    public String checkWithin(Point p) {
        double d = this.center.distance(p);
        if (d > this.radius) {
            return "outside";
        } else if (d == this.radius) {
            return "on";
        } else {
            return "within";
        }
    }
}