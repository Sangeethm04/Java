// Sangeeth Menachery
// Exercise 2.4
// Ice Cream cone surface and volume

public class IceCreamConeMenachery {

        public double height;
        public double radius;
        public double surfaceArea;  
        public double volume; 

        public Double getSurfaceArea(double heights, double radiuss) {
            height = heights;
            radius = radiuss;
            return ((Math.PI)*(radius)*(radius + Math.sqrt((height*height) + (radius*radius))));
        }

        public Double getVolume(double heights, double radiuss) {
            height = heights;
            radius = radiuss;
            surfaceArea = ((Math.PI)*(radius)*(radius + Math.sqrt((height*height) + (radius*radius))));
            return surfaceArea;
        }

    public static void main(String[] args) {
          IceCreamConeMenachery order1 = new IceCreamConeMenachery();
          System.out.println(order1.getSurfaceArea(5, 10));
    }
}
