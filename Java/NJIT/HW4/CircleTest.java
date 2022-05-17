package NJIT.HW4;

import java.util.*;

public class CircleTest {
    public static void main(String[] args) {
        // rounding to two decimals
        // setting the scanner and random objects
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // creating the first two point objects
        Point point1 = new Point(random.nextInt(25) + 1, random.nextInt(25) + 1);
        Point point2 = new Point(0, 0);

        System.out.println("What is the first radius: ");
        int firstRadius = scan.nextInt();

        // creating the first two circle objects
        Circle circle1 = new Circle(point2, firstRadius);
        Circle circle2 = new Circle(point1, 10);

        System.out.println("Circle 1 summary: " + circle1.toString());
        System.out.println("Circle 2 summary: " + circle2.toString());

        if (Objects.equals(circle1.area(), circle2.area())) {
            double distance = circle1.getCenter().distance(circle2.getCenter());
            System.out.println("Total distance between the centers: " + distance);
        } else {
            System.out.println("The average area was: "
                    + ((circle1.area() + circle2.area()) / 2.0));
        }

        scan.close();
    }
}
