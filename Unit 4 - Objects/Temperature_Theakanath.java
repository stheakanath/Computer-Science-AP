//Sony THeakanath
//Final Prep - Asg3

import java.util.Scanner;

/** Completing questions 18 and 19 from the barrons book */

public class Temperature_Theakanath
{
	public static void main (String[]args)
	{
	
		/** Number 18 */
		Temperature t1 = new Temperature(40, "C");
		Temperature t2 = t1;
		Temperature t3 = t2.lower(20);
		Temperature t4 = t1.toFahrenheit();//hi this is a random comment with no use
		System.out.println(t1.getDegrees() + " " + t2.getDegrees() + " " + t3.getDegrees() + " " + t4.getDegrees());
		/** Number 19 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature scale: ");
		String scale = scan.nextLine();
		System.out.println("Enter number of degrees: ");
		double degrees = scan.nextDouble();
		if(Temperature.isValidTemp(degrees, scale))
		{
			Temperature t = new Temperature(degrees, scale);
		} else { 
			System.out.println("Exiting program...");
		}
	}
}
/** 
  as featured in Barron's!
*/

class Temperature 
{
	private String myScale;
	private double myDegrees;
	
	public Temperature()
	{
		myScale = "F";
		myDegrees = 0;
	}
	
	public Temperature( double degrees, String scale )
	{
		myScale = scale;
		myDegrees = degrees;
	}
	
	public double getDegrees() { return myDegrees; }
	
	public String getScale()  { return myScale; }
	
	public Temperature toFahrenheit()
	{
		myDegrees*=1.8;
		myDegrees+=32;
		return this;
	}
	
	public Temperature toCelsius()
	{
		myDegrees-=32;
		myDegrees= myDegrees/1.8;
		return this;
	}
	
	public Temperature raise( double amt )
	{
		myDegrees += amt;
		return this;
	}
	
	public Temperature lower( double amt )
	{
	
		myDegrees-=amt;
		return this;
	}
	
	public static boolean isValidTemp( double degrees, String scale )
	{
	
		if ((scale.equals("C") || scale.equals("F")))
			return true;
		else 
			return false;
	}
}