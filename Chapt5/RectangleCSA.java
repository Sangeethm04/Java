package Chapt5;
public class RectangleCSA {

    private double height;
    private double width;

    public RectangleCSA(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void moveUp(double up) {
        height += up;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }


    public static void main(String[] args) {
        RectangleCSA rect1 = new RectangleCSA(1, 1);
        RectangleCSA rect2 = new RectangleCSA(1, 1);
        RectangleCSA rect3 = rect1;
        rect1.moveUp(5);

        System.out.println("rectangle 1:" + rect1);
        System.out.println("rectangle 2:" + rect2);
        System.out.println("rectangle 3:" + rect3);
        System.out.println(rect3.getWidth());

    }
}