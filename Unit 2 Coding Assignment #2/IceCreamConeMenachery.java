// Sangeeth Menachery
// Exercise 2.4
// Ice Cream cone surface and volume

public class IceCreamConeMenachery {

        public double height;
        public double radius;
        public double surfaceArea;  
        public double volume; 

        public IceCreamConeMenachery(double heights, double radiuss) {
            height = heights;
            radius = radiuss;
        }

        public Double getSurfaceArea() {
            surfaceArea = ((Math.PI)*(radius)*(radius + Math.sqrt((height*height) + (radius*radius)))) - (Math.PI * (radius*radius));
            return surfaceArea;
        }

        public Double getVolume() {
           
            volume = ((Math.PI)*(radius*radius)*(height/3));
            return volume;
        }

    public static void main(String[] args) {
        IceCreamConeMenachery order1 = new IceCreamConeMenachery(5, 10);
          System.out.println(order1.getSurfaceArea());
          System.out.println(order1.getVolume());
    }
}
