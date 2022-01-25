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

        //calculate the perimeter of the rectangle
      
      
        //calculate the length of the diagonal of the rectangle
      
      
        //scale the rectangle
      
      
        //scale the rectangle horizontally
      
      
        //scale the rectangle vertically
      }