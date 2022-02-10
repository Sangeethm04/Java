/**
 * @author Sangeeth Menachery
 * @since 2/08/22
 * Precondition: The user inputs a non-negative integer for the length of the sides
 * Postcondition: Outputs the perimeter and area of the triangle and checks for correct triangles and scales
 */

public class TriangleMenachery {
    private double length1; // length of side 1
    private double length2; // length of side 2
    private double length3; // length of side 3
    private static int objectnum; // number of objects created

    /**
     * Constructor for the TriangleMenachery class
     * @param length1 the first side of the triangle
     * @param length2 the second side of the triangle
     * @param length3 the third side of the triangle
     */
    public TriangleMenachery(double length1, double length2, double length3) {
        this.length1 = length1; // set length1 to the value of length1
        this.length2 = length2; // set length2 to the value of length2
        this.length3 = length3; // set length3 to the value of length3
        objectnum++; // increment the number of objects created
        if (!isTriangle()) {
            this.length1 = 0; // set length1 to 0 if it is not a triangle
            this.length2 = 0; // set length2 to 0 if it is not a triangle
            this.length3 = 0; // set length3 to 0 if it is not a triangle
        }
    }

    /**
     * Calculates if the lengths of the sides of the triangle are valid
     * @return true if the triangle is valid or false otherwise
     */
    public boolean isTriangle() {
        if (length1 + length2 > length3 && length1 + length3 > length2 && length2 + length3 > length1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Calculates the perimeter of the triangle
     * @return the perimeter of the triangle
     */
    public String PrintPerimeter() {
        return "Perimeter: " + (length1 + length2 + length3);
    }

    /**
     * Calculates the area of the triangle
     * @return the area of the triangle
     */
    public String PrintArea() {
        double s = (length1 + length2 + length3) / 2;
        return "Area: " + Math.sqrt(s * (s - length1) * (s - length2) * (s - length3));
    }

    /**
     * Multiplies the scale of the triangle by the object lengths
     * @param scale the scale to be multiplied by the object lengths
     */
    public void PrintScale(double scale) {
        System.out.println("Scaled Triangle: ");
        System.out.println("Length 1: " + (length1 * scale));
        System.out.println("Length 2: " + (length2 * scale));
        System.out.println("Length 3: " + (length3 * scale));
    }

    /**
     * Returns the number of objects created
     * @return the number of objects created
     */
    public String numObjectsPrinted() {
        return "Number of objects created: " + TriangleMenachery.objectnum;
    }

    /**
     * Returns the string representation of the triangle lengths
     * @return the string representation of the triangle lengths
     */
    public String toString() {
        return "Triangle: " + length1 + ", " + length2 + ", " + length3;
    }


}