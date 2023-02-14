package intersection.rectangles;

import java.awt.Point;
import java.util.Map;

public class MainRectangleIntersection {
  public static void main(String[] args) {
    //Java variant;
//    java.awt.Rectangle rectangle = new java.awt.Rectangle(3, 3, 3, 3);
//    java.awt.Rectangle rectangle1 = new java.awt.Rectangle(2, 2, 2, 2);
//    System.out.println(rectangle.intersection(rectangle1));
    Rectangle r1 = new Rectangle(3, 3, 3, 3);
    Rectangle r2 = new Rectangle(2, 2, 2, 2);
    System.out.println(findIntersection(r1, r2));
  }
  private static Rectangle findIntersection(Rectangle rectangle1, Rectangle rectangle2) {
    int x1 = rectangle1.getX() + rectangle1.getW();
    int x2 = rectangle2.getX() + rectangle2.getW();
    int y1 = rectangle1.getY() - rectangle1.getH();
    int y2 = rectangle2.getY() - rectangle2.getH();

    int xL = Math.max(rectangle1.getX(), rectangle2.getX());
    int xR = Math.min(x1, x2);
    if(xR <= xL) {
      return null;
    } else {
      int yT = Math.max(y1, y2);
      int yB = Math.min(rectangle1.getY(), rectangle2.getY());
      if(yB <= yT) {
        return null;
      } else {
        return new Rectangle(xL, yB, xR-xL, yB -yT);
      }
    }
  }
}
