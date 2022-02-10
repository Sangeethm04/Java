// Create a Triangle class that will construct a Triangle object.  The Triangle objects should have three instance variables for the lengths of their three sides.  Create one constructor for all three instance variables.  Keep track of how many objects are constructed.  Create one accessor method to access how many objects have been created.  Create a toString method, a method that will return the object’s perimeter, a method that will return the object's area, and a method that will take in a scale parameter to scale all three sides of the triangle and print a statement showing the new triangles perimeter and area.

// Create a TriangleTester class to do the following in this order.
// Construct a triangle and use the toString method.
// Print the perimeter and area
// Scale the triangle and print the new perimeter and area
// Construct a few more objects
// Print the number of objects constructed


public class TriangleMenachery {
    private double length1;
    private double length2;
    private double length3;
    private static int objectnum;

    public TriangleMenachery(double length1, double length2, double length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
        objectnum++;
    }

    public String PrintPerimeter() {
        return "Perimeter: " + (length1 + length2 + length3);
    }

    public String PrintArea() {
        double s = (length1 + length2 + length3) / 2;
        return "Area: " + Math.sqrt(s * (s - length1) * (s - length2) * (s - length3));
    }

    public void PrintScale(double scale) {
        System.out.println("Scaled Triangle: ");
        System.out.println("Length 1: " + (length1 * scale));
        System.out.println("Length 2: " + (length2 * scale));
        System.out.println("Length 3: " + (length3 * scale));
    }

    public String numObjectsPrinted() {
        return "Number of objects created: " + TriangleMenachery.objectnum;
    }

    public String toString() {
        return "Triangle: " + length1 + ", " + length2 + ", " + length3;
    }
}