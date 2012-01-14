//Sony Theakanath
//Abhi Kumar
//Types-Asg6: Bell Market Coin Changer

/** This code figures out the amount of change needed 
    when given a dollar bill
		*/

import java.util.Scanner;

public class CoinChanger_TheakanathKumar
{
	public static void main (String[]args)
	{
		System.out.println("Bell Market Coin Changer by Sony Theakanath & Abhi Kumar");
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your total sale?");
		double totalSale = scan.nextDouble();
		System.out.println("Enter the amount of money you are giving the Bell Market Guy");
		//Figuring out change
		double moneyG = scan.nextDouble();
		double change = moneyG-totalSale ;
		//All stuff below calculates the change
		double quarters = change/0.25;
		double quarters2 = quarters-(int)quarters;
		quarters2 = (0.25*quarters2) ;
		int quarterschange = (int)((quarters2*100)+0.5);
		int dimes = quarterschange/10;
		int dimeschange = quarterschange-(dimes*10);
		int nickels = dimeschange/5;
		int nickelschange = dimeschange-(nickels*5);
		int pennies = nickelschange;
		int pennieschange = nickelschange-(pennies);
		//Printing
		System.out.println("For your payment of " + moneyG + " Dollars and the total sale of");
		System.out.println(totalSale + " Dollars, your change is: " + change + " Dollars.");
		System.out.println("You will get " + (int)quarters + " Quarters, " + (int)dimes + " Dimes, " + (int)nickels);
		System.out.println("Nickels, and " + (int)pennies + " Pennies.");
	}
	
}
		