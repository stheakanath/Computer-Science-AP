//Sony Theakanath
//Graphics-Asg2: cardriver

import java.awt.Color;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.graphics.GPolygon;

/** Makes a a reloaded class
*/

public class CarDriver_Theakanath extends GraphicsProgram
{
	public static void main(String[] args)
	{
   	new CarDriver_Theakanath().start(args);
	}
	public void run ()
	{		
		Car myCar = new Car(100, 200);
		myCar.addTo( this );
		Car otherCar = new Car(250,370);
		otherCar.addTo(this);
	}
}

/**
	Makes the car
*/

class Car
{
	GRect body;
	GRect roof;
	GRect trunk;
	GPolygon windowfirst;
	GPolygon windowsecond;
	GOval wheel1;
	GOval wheel2;
	
	public Car(int xLocation, int yLocation)
	{
	   body = new GRect(xLocation,yLocation,150,100);
		body.setFilled(true);
		body.setColor(Color.RED);
		roof= new GRect(xLocation-75,yLocation+50,75,50);
		roof.setFilled(true);
		roof.setColor(Color.RED);
		trunk= new GRect(xLocation+150,yLocation+50,85,50);
		trunk.setFilled(true);
		trunk.setColor(Color.RED);
	   windowfirst = new GPolygon();
		windowfirst.addVertex(xLocation,yLocation);
		windowfirst.addVertex(xLocation,yLocation+50);
		windowfirst.addVertex(xLocation-30,yLocation+50);
		windowfirst.setFilled(true);
		windowfirst.setColor(Color.RED);
		windowsecond = new GPolygon();
		windowsecond.addVertex(xLocation+150,yLocation);
		windowsecond.addVertex(xLocation+150,yLocation+50);
		windowsecond.addVertex(xLocation+180,yLocation+50);
		windowsecond.setFilled(true);
		windowsecond.setColor(Color.RED);
		wheel1 = new GOval(xLocation, yLocation+75, 50, 50);
		wheel1.setFilled(true);
		wheel1.setColor(Color.BLACK);
		wheel2 = new GOval(xLocation+100, yLocation+75, 50, 50);
		wheel2.setFilled(true);
		wheel2.setColor(Color.BLACK);
	}
	public void addTo(GraphicsProgram CarDriver_Theakanath)
	{
		CarDriver_Theakanath.add(body);
		CarDriver_Theakanath.add(roof);
		CarDriver_Theakanath.add(trunk);
		CarDriver_Theakanath.add(windowfirst);
		CarDriver_Theakanath.add(windowsecond);
		CarDriver_Theakanath.add(wheel1);
		CarDriver_Theakanath.add(wheel2);
	}
	
}