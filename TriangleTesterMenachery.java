

public class TriangleTesterMenachery {
    public static void main(String[] args) {
        TriangleMenachery unoTriangle = new TriangleMenachery(2, 2, 4);
        System.out.println(unoTriangle.toString());
        System.out.println(unoTriangle.PrintPerimeter());
        System.out.println(unoTriangle.PrintArea());
        unoTriangle.PrintScale(2);
        TriangleMenachery dosTriangle = new TriangleMenachery(4, 6, 8);
        TriangleMenachery tresTriangle = new TriangleMenachery(8, 12, 16);
        System.out.println(tresTriangle.numObjectsPrinted());
    }
}