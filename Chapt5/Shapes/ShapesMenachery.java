package Chapt5.Shapes;

public class ShapesMenachery {
        public static void main(String[] args) {
          Rectangle r1 = new Rectangle(10, 6);
        }
      }
      
      class Rectangle {
        double length;
        double width;
      
        public Rectangle(int initLength, double initWidth) {
          length = initLength;
          width = initWidth;
        }
        public double getLength() { return length; }
      
        public double getWidth() { return width; }
      
        public void setLength(double newLength) { length = newLength; }
    
        public void setWidth(double newWidth) { width = newWidth; }
      
        public String toString() {
              return "Rectangle with length " + length + " and width " + width;
          }
      
      
        //calculates the area of the rectangle
          public void area() {
            double area = length * width;
            System.out.println("The area of the rectangle is " + area);
          }
        //calculate the perimeter of the rectangle
          public void perimeter() {
            double perimeter = 2 * (length + width);
            System.out.println("The perimeter of the rectangle is " + perimeter);
          }
      
        //calculate the length of the diagonal of the rectangle
          public void diagonal() {
            double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
            System.out.println("The length of the diagonal of the rectangle is " + diagonal);
          }
      
        //scale the rectangle
          public void scale(double scaleFactor) {
            length = length * scaleFactor;
            width = width * scaleFactor;
            System.out.println("The new length of the rectangle is " + length);
            System.out.println("The new width of the rectangle is " + width);
          }
      
        //scale the rectangle horizontally
          public void scaleHorizontally(double scaleFactor) {
            width = width * scaleFactor;
            System.out.println("The new width of the rectangle is " + width);
          }
      
        //scale the rectangle vertically
          public void scaleVertically(double scaleFactor) {
            length = length * scaleFactor;
            System.out.println("The new length of the rectangle is " + length);
          }
      }