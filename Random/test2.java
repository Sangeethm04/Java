import java.util.*;
import java.awt.*;

public class test2
{
  public static void main(String[] args)
  {
      World world = new World(400,400);
      Turtle yertle = new Turtle(world);
      yertle.penUp();  // move a little to the left
      yertle.moveTo(100,200);
      yertle.penDown();
      yertle.setColor(Color.blue);

      // Add your loop here!
      
      for(int n = 5; n <= 4; n++) {
      yertle.forward(100);
      yertle.turn(72);
      }

      world.show(true);
  }
}