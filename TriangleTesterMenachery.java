// Create a Triangle class that will construct a Triangle object.  The Triangle objects should have three instance variables for the lengths of their three sides.  Create one constructor for all three instance variables.  Keep track of how many objects are constructed.  Create one accessor method to access how many objects have been created.  Create a toString method, a method that will return the object’s perimeter, a method that will return the object's area, and a method that will take in a scale parameter to scale all three sides of the triangle and print a statement showing the new triangles perimeter and area.

// Create a TriangleTester class to do the following in this order.
// Construct a triangle and use the toString method.
// Print the perimeter and area
// Scale the triangle and print the new perimeter and area
// Construct a few more objects
// Print the number of objects constructed

public class TriangleTesterMenachery {
    public static void main(String[] args) {
        TriangleMenachery unoTriangle = new TriangleMenachery(2, 3, 4);
        System.out.println(unoTriangle.toString());
        System.out.println(unoTriangle.PrintPerimeter());
        System.out.println(unoTriangle.PrintArea());
        unoTriangle.PrintScale(2);
        TriangleMenachery dosTriangle = new TriangleMenachery(4, 6, 8);
        TriangleMenachery tresTriangle = new TriangleMenachery(8, 12, 16);
        System.out.println(tresTriangle.numObjectsPrinted());
    }
}