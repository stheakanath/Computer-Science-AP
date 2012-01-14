//Sony Theakanath
//Arrays-Asg 7: Bouncy Balls

import java.awt.Color;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

/** This class creates the individual ball. It 
	 measures the direction of travel (of the ball)
	 and its location. All of the variables are stored
	 in a public variable so it can be modified throughout
	 multiple classes
	 */

class Ball
{
	GOval individualball;
	public int deltaX, deltaY, locationX, locationY;
	public Ball()
	{
		int xLocation = (int)(Math.random()*640);
		int yLocation = (int)(Math.random()*470);
		individualball = new GOval(xLocation, yLocation, 20, 20);
		locationX = (int)individualball.getX();
		locationY = (int)individualball.getY();
		deltaX = (int)(Math.random()*3);
		deltaY = (int)(Math.random()*3);
		individualball.setColor(Color.BLUE);
		individualball.setFilled(true);
	}
	public void addTo(GraphicsProgram object)
	{
		object.add(individualball);
	}
	public void move()
	{
		individualball.move(deltaX, deltaY);
	}

}

/** The tester class. This has the logic of the bouncing 
	 of the allballs. It also creates the objects and puts
	 them in an array
	 */

public class BouncingBalls_Theakanath extends GraphicsProgram
{
	public void run()
	{
		GRect box = new GRect(20, 20, 700,  500);
		
		add (box);
		Ball ball0 = new Ball();
		ball0.addTo(this);
		Ball ball1 = new Ball();
		ball1.addTo(this);
		Ball ball2 = new Ball();
		ball2.addTo(this);
		Ball ball3 = new Ball();
		ball3.addTo(this);
		Ball ball4 = new Ball();
		ball4.addTo(this);
		Ball[] allballs = {ball0, ball1, ball2, ball3, ball4};
		/** Logic of bouncing */
		for(int x = 0; x <allballs.length; x++)
		{
			allballs[x].locationX = (int)allballs[x].individualball.getX();
			allballs[x].locationY = (int)allballs[x].individualball.getY();
			if (allballs[x].locationX > 693 && allballs[x].locationX <707)
			{
				allballs[x].deltaX = allballs[x].deltaX-(allballs[x].deltaX*2);
			}
			if (allballs[x].locationX > 13 && allballs[x].locationX < 27)
			{
				allballs[x].deltaX = allballs[x].deltaX-(allballs[x].deltaX*2);
			}
			if(allballs[x].locationY > 493 && allballs[x].locationY < 507)
			{
				allballs[x].deltaY = allballs[x].deltaY-(allballs[x].deltaY*2);
			}
			if(allballs[x].locationY > 13 && allballs[x].locationY < 27)
			{
				allballs[x].deltaY = allballs[x].deltaY-(allballs[x].deltaY*2);
			}
			
			allballs[x].move();
			pause(3);
			if (x == 4)
			{
				x = -1;
			}
		}
	}
	public static void main(String[] args)
	{
		new BouncingBalls_Theakanath().start(args);
	}
}
