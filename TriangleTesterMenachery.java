/**
 * @author Sangeeth Menachery
 * @since 2/08/22
 * Precondition: The user inputs a non-negative integer for the length of the sides
 * Postcondition: Outputs the perimeter and area of the triangle and checks for correct triangles and scales
 */
public class TriangleTesterMenachery {

    /**
     * @param args command line arguments
     */
    public static void main(String[] args) {
        TriangleMenachery unoTriangle = new TriangleMenachery(1, 2, 3);
        System.out.println(unoTriangle.toString());
        System.out.println(unoTriangle.PrintPerimeter());
        System.out.println(unoTriangle.PrintArea());
        unoTriangle.PrintScale(2);
        System.out.println(unoTriangle.PrintPerimeter());
        System.out.println(unoTriangle.PrintArea());
        TriangleMenachery dosTriangle = new TriangleMenachery(4, 6, 8);
        TriangleMenachery tresTriangle = new TriangleMenachery(8, 12, 16);
        System.out.println(TriangleMenachery.numObjectsPrinted());
    }
}