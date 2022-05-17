package NJIT.HW4;

public class Point {
   private int x, y;

   public Point(int x2, int y2) {
      x = x2;
      y = y2;
   }

   public String toString() {
      return "x:" + x + "," + "y:" + y;
   }

   public double distance(Point other) {
      return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
   }
}
