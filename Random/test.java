public class test {

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

            int dx = x2 - x1;
            int dy = y2 - y1;
            int stepx = 1;
            int stepy = 1;
            if (dx < 0) {
                dx = -dx;
                stepx = -1;
            }
            if (dy < 0) {
                dy = -dy;
                stepy = -1;
            }
            if (dx > dy) {
                int fraction = 2 * dy - dx;
                for (int i = 0; i < dx; i++) {
                    System.out.println("(" + x1 + "," + y1 + ")");
                    if (fraction > 0) {
                        y1 += stepy;
                        fraction -= 2 * dx;
                    }
                    x1 += stepx;
                    fraction += 2 * dy;
                }
            } else {
                int fraction = 2 * dx - dy;
                for (int i = 0; i < dy; i++) {
                    System.out.println("(" + x1 + "," + y1 + ")");
                    if (fraction > 0) {
                        x1 += stepx;
                        fraction -= 2 * dy;
                    }
                    y1 += stepy;
                    fraction += 2 * dx;
                }
            }
        }
        public static void main(String[] args) {
            test t = new test();
            t.drawSquare(1, 1, 5);
        }
        
            
            
            
}
    
