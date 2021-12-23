# Java AP Computer Science Work
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

}
