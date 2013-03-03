//Sony Theakanath
//Computer Science AP

import acm.graphics.GRect;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import java.awt.Color;
import java.lang.Math;

/** Runs the program */
public class TruckRacer_Theakanath extends GraphicsProgram 
{
	public void run() {
   	Truck truck1 = new Truck(100,50,Color.magenta);
   	truck1.addShapeGP(this);
	   Truck truck2 = new Truck(100,280, Color.cyan);
   	truck2.addShapeGP(this);
   	Truck truck3 = new Truck(100,510,Color.red);
   	truck3.addShapeGP(this);
	
   	GRect Finish = new GRect(1400, 10, 20, 800 );
	   Finish.setFilled(true);
	   Finish.setColor(Color.black);
	   add(Finish);

      GLabel glabel = new GLabel("", 50, 60);
      add(glabel);
      glabel.move(700, 40);
	
		
      pause(500);
      boolean done = false;
	   while(truck1.getX()<1700 || truck2.getX()<1700 || truck3.getX()<1700) {
		   String[] Label = {"no one", "Magenta", "Cyan", "Red"};
		   int f = 0;
		   pause(10);	
		   if(truck1.getX()<1700)
			   truck1.move(2 + (int)(Math.random()*15));
		   if(truck2.getX()<1700)
			   truck2.move(2 + (int)(Math.random()*15));
		   if(truck3.getX()<1700)
			   truck3.move(2 + (int)(Math.random()*15));
         if(truck1.getX() > 1700 && !done)
         {
            f = 1;
            glabel.setLabel(Label[f] + " is the winner!");
            System.out.println( Label[f] + " is the winner!");	
           done = true;
        } else if (truck2.getX() > 1700 && !done)  {
            f = 2;
            glabel.setLabel(Label[f] + " is the winner!");
           System.out.println( Label[f]+ " is the winner!");		
             done = true;
        } else if (truck3.getX() > 1700&& !done) {
            f = 3;
            glabel.setLabel(Label[f] + " is the winner!");
            System.out.println( Label[f]+ " is the winner!");	
          done = true;
         }
	   }			
	}

	/** Standard Java entry point 
	  This method can be eliminated in most Java environments */
	public static void main(String[] args) {
		new TruckRacer_Thomas().start(args);
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
	private int x1;
	
	/** Constant representing the golden ratio */
	public static final double PHI = 1.618;
	
	public void move(double dx)
	{
		body.move(dx,0);
		front.move(dx,0);
		window.move(dx,0);
		wheel.move(dx,0);
		wheel2.move(dx,0);
	}
	
	public Truck(int x, int y, Color bodyColor)
	{
		x1 = x;
		body = new GRect(x, y, 300, 300 / PHI);
		body.setFilled(true);
		body.setColor(bodyColor);
		
		
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
	
	public int getX()
	{
		return (int)front.getX();
	}
	
}
