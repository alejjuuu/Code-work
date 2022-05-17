package NJIT.HW4;

//import java.text.DecimalFormat;

public class Circle {
    private int radius;
    private Point center;

    // constructor
    public Circle(Point newCenter, int newRadius) {
        center = newCenter;
        radius = newRadius;
    }

    // setter for radius
    public void setRadius(int newRadius) {
        radius = newRadius;
    }

    // setter for center
    public void setCenter(Point absCenter) {
        center = absCenter;
    }

    // getter for radius
    public int getRadius() {
        return radius;
    }

    // getter for center
    public Point getCenter() {
        return center;
    }

    // returns wheter is true or false with a boolean
    public boolean equals(Circle object1, Circle object2) {
        return (object1.getRadius() == object2.getRadius());
    }

    // Area method from the radius
    public double area() {
        // DecimalFormat df = new DecimalFormat("0.##"); comment
        return Math.PI * radius * radius;
    }

    // toString method
    public String toString() {
        return ("Radius was " + radius + ", area was " + area() + " the center was " + center);
    }
}