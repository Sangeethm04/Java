/**
 * @author Sangeeth Menachery
 * @since 
 */

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
        if(!isTriangle()) {
            this.length1 = 0;
        this.length2 = 0;
        this.length3 = 0;
        }
    }

    public boolean isTriangle() {
        if(length1 + length2 > length3 && length1 + length3 > length2 && length2 + length3 > length1) {
            return true;
        }
        else {
            return false;
        }
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