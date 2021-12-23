public class unit3frq {
    public void drawSquare(int x, int y, int len) {
        // first check whether it fits on the grid
        int xsum = x + len; int ydiff = y - len;
        if (xsum > 10) xsum = 10 - x; if (ydiff < 0) ydiff = 0 - y;
        if ((x - xsum) > (y - ydiff)) xsum = ydiff+x-y;
        else ydiff = xsum+y-x;
          
        drawLine(x, y, x, ydiff); // go down
        drawLine(x, y, xsum, y); // go right
        drawLine(x, ydiff, xsum, ydiff); // down then right
        drawLine(xsum, y, xsum, ydiff); // right then down
          
        int side = xsum - x;
        System.out.println("side length = " + side + ", area = " + Math.pow(side, 2));
        }

    public void drawLine(int x1, int y1, int x2, int y2) {
        int xdiff = x2 - x1; int ydiff = y2 - y1;
        if (xdiff < 0) xdiff = 0 - xdiff; if (ydiff < 0) ydiff = 0 - ydiff;
        if (xdiff > ydiff) {
            int x = x1; int y = y1;
            while (x <= x2) {
                System.out.println("(" + x + ", " + y + ")");
                x++;
                if (ydiff != 0) y += ydiff / xdiff;
            }
        } else {
            int x = x1; int y = y1;
            while (y <= y2) {
                System.out.println("(" + x + ", " + y + ")");
                y++;
                if (xdiff != 0) x += xdiff / ydiff;
            }
        }
    }
    public static void main(String[] args) {
        unit3frq u3 = new unit3frq();
        u3.drawSquare(0, 0, 10);

    }
     
}
