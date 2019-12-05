import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    // Instantiate a 220x220 world.
    World world = new World(220, 220);
    // Instantiate a turtle.
    Turtle turtle = new Turtle(world);
    turtle.setShellColor(Color.magenta);
    turtle.setPenColor(Color.pink);
    // Make four boxes.
    turtle.forward(50);
    turtle.turnLeft();
    turtle.forward(50);
    turtle.turnLeft();
    turtle.forward(50);
    turtle.turnLeft();
    turtle.forward(100);
    turtle.turnLeft();
    turtle.forward(50);
    turtle.turnLeft();
    turtle.forward(50);
    turtle.turnLeft();
    turtle.forward(100);
    turtle.turnLeft();
    turtle.forward(50);
    turtle.turnLeft();
    turtle.forward(50);
    turtle.turnLeft();
    turtle.forward(100);
    turtle.turnLeft();
    turtle.forward(50);
    turtle.turnLeft();
    turtle.forward(50);
    // Make the world visible.
    world.show(true);
  }
}
