/**
 * ShapesMenachery.java
 * @author Sangeeth
 * @Since 1/26/2022
 * Draws and Calculates Rectangle
 * Preconditions: length and width must be positive
 * Postconditions: Rectangle is drawn and calculated 
 */

public class ShapesMenachery {

  public static void main(String[] args) {
    Rectangle r1 = new Rectangle(10, 6);
    r1.draw();
  }
}

class Rectangle {
  double length;
  double width;
  /**
   * Constructor
   * @param length the length of the rectangle
   * @param width the width of the rectangle
   */
  public Rectangle(int initLength, double initWidth) {
    length = initLength; //length is set to the parameter
    width = initWidth; //width is set to the parameter
  }

  /**
   * returns the length of the rectangle
   * @return the length of the rectangle
   */
  public double getLength() {
    return length;
  }
  /**
   * returns the width of the rectangle
   * @return the width of the rectangle
   */
  public double getWidth() {
    return width;
  }
  /**
   * sets the length of the rectangle to the parameter
   * @param newLength the new length of the rectangle
   */
  public void setLength(double newLength) {
    length = newLength;
  }
  /**
   * sets the width of the rectangle to the parameter
   * @param newWidth the new width of the rectangle
   */
  public void setWidth(double newWidth) {
    width = newWidth;
  }
  /**
   * returns the string version of length and width
   * @return the string version of length and width
   */
  public String toString() {
    return "Rectangle with length " + length + " and width " + width;
  }


  /**
   * calculates the area of the rectangle
   * @return the area of the rectangle
   */
  public String area() {
    double area = length * width;
    return "The area of the rectangle is " + area;
  }

  /**
   * calculates the perimeter of the rectangle
   * @return the perimeter of the rectangle
   */
  public String perimeter() {
    double perimeter = 2 * (length + width);
    return "The perimeter of the rectangle is " + perimeter;
  }

  /**
   * draws the rectangle
   * @return the rectangle
   */
  public String diagonal() {
    double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    return "The length of the diagonal of the rectangle is " + diagonal;
  }

  /**
   * Calculate the new length and width of the rectangle
   * @param newLength the new length of the rectangle
   */
  public String scale(double scaleFactor) {
    length = length * scaleFactor;
    width = width * scaleFactor;
    return "The new length of the rectangle is " + length + " and the new width is " + width;
  }

  /**
   * calculates the new width of the rectangle
   * @param newWidth the new width of the rectangle
   * @return the new width of the rectangle
   */
  public String scaleHorizontally(double scaleFactor) {
    width = width * scaleFactor;
    return "The new width of the rectangle is " + width;
  }

  /**
   * calculates the new length of the rectangle
   * @param scaleFactor the new width of the rectangle
   * @return the new width of the rectangle
   */
  public String scaleVertically(double scaleFactor) {
    length = length * scaleFactor;
    return "The new length of the rectangle is " + length;
  }

  /**
   * draws the rectangle with astrics
   */
  public void draw() {
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < width; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}