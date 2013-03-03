//Sony Theakanath
//Computer Science AP

import acm.graphics.GRect;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;
import java.awt.Color;

/** Runs the program */
public class ACMcar extends GraphicsProgram 
{
	/** Constant representing the golden ratio */
	public static final double PHI = 1.618;

	public void run() {
		GRect rect = new GRect(100, 50, 300, 300 / PHI);
		rect.setFilled(true);
		rect.setColor(Color.blue);
		add(rect);
		GRect rect2 = new GRect(400, 142, 150, 150 / PHI);
		rect2.setFilled(true);
		rect2.setColor(Color.black);
		add(rect2);
		GPolygon poly = new GPolygon();
		int xLocation = 429;
		int yLocation = 141;
		poly.addVertex(xLocation-29,yLocation-90);
		poly.addVertex(xLocation+120,yLocation);
		poly.addVertex(xLocation-29,yLocation);
		poly.setFilled(true);
		poly.setColor(Color.YELLOW);
		add(poly);
		GOval oval = new GOval(300, 180 + 50 / PHI, 70, 100 / PHI);
		oval.setFilled(true);
		oval.setColor(Color.gray);
		add(oval);
		addKeyListener(this);
		GOval oval2 = new GOval(120, 180 + 50 / PHI, 70, 100 / PHI);
		oval2.setFilled(true);
		oval2.setColor(Color.gray);
		add(oval2);
		addKeyListener(this);
	}

	/** Standard Java entry point 
	  This method can be eliminated in most Java environments */
	public static void main(String[] args) {
		new ACMcar().start(args);
	}
}