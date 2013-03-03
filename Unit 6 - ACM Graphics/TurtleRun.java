// Sony Theakanath
// Turtle Run- Objects Asg 7


import acm.program.GraphicsProgram;
import acm.graphics.GTurtle;
import acm.graphics.GRect;
import acm.graphics.GLabel;

/** the program simulates the turtle run spurts
*/
public class TurtleRun_Theakanath extends GraphicsProgram
{
	public static void main(String[] args)
	{
 		new TurtleRun_Theakanath().start(args);
	}
	
	public void run()
	{
		 
		GTurtle turtle = new GTurtle(10,200);
		add (turtle);
		GRect grect = new GRect(500,0,20, 500);
		add (grect);
		GLabel glabel = new GLabel("Finish Line", 525, 25);
		add(glabel);
		int turtleposition = 10;
		int finishline = 500;
		while (turtleposition < finishline)
		{
			int moveahead = (int)(Math.random()*81+20);
			turtle.forward(moveahead);
			turtleposition = turtleposition + moveahead;
			turtle.pause(1000);
		}
		turtle.right(90);
		turtle.pause(500);
		turtle.forward(200);
		turtle.pause(500);
		turtle.right(90);
		turtle.pause(500);
		turtle.forward(20);
		turtle.pause(500);
		turtle.left(323);
		
		
	}
}