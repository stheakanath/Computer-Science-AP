//Sony Theakanath
//Modified from Jeff Thomas
//Computer Science AP

import acm.graphics.GRect;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;
import java.awt.Color;

/** Runs the program */
public class TruckDriver extends GraphicsProgram 
{
	public void run() {
	   Truck truck1 = new Truck(100,50);
	   truck1.addShapeGP(this);
	   Truck truck2 = new Truck(100,280);
	   truck2.addShapeGP(this);
	   Truck truck3 = new Truck(100,510);
   	truck3.addShapeGP(this);
	}

	/** Standard Java entry point 
	  This method can be eliminated in most Java environments */
	public static void main(String[] args) {
		new TruckDriver().start(args);
	}
}

/** this class creates the Truck and contains all the methods which affect it.*/

class Truck
{
   private GRect body;
	private GRect front;
	private GPolygon window;
	private GOval wheel;
	private GOval wheel2;
	
	/** Constant representing the golden ratio */
	public static final double PHI = 1.618;
	
	public Truck(int x, int y)
	{
		body = new GRect(x, y, 300, 300 / PHI);
		body.setFilled(true);
		body.setColor(Color.blue);
		front = new GRect(x + 300, y + 92, 150, 150 / PHI);
		front.setFilled(true);
		front.setColor(Color.black);
		window = new GPolygon();
		int xLocation = x + 329;
		int yLocation = y + 91;
		window.addVertex(xLocation-29,yLocation-90);
		window.addVertex(xLocation+120,yLocation);
		window.addVertex(xLocation-29,yLocation);
		window.setFilled(true);
		window.setColor(Color.YELLOW);
		wheel = new GOval(x + 200, y + 115 + 50 / PHI, 70, 100 / PHI);
		wheel.setFilled(true);
		wheel.setColor(Color.gray);
		wheel2 = new GOval(x + 20, y + 115 + 50 / PHI, 70, 100 / PHI);
		wheel2.setFilled(true);
		wheel2.setColor(Color.gray);	
	}
	
	public void addShapeGP(GraphicsProgram gp)
	{
		gp.add(body);
		gp.add(front);
		gp.add(window);
		gp.add(wheel);
		gp.add(wheel2);
	}
}


