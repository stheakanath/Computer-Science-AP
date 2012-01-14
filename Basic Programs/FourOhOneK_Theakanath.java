//Sony Theakanath
//Loops-Asg6: 401K Earnings

import java.util.Scanner;

/** This program will print out a chart based on your 401K investments
	 It gives user input + a hard coded input
	 Retirement is the actual behind the scenes code. It takes the information and prints
	 out the stuffs.
*/

class Retirement
{
	private int startyear, endyear, previousyearbalance, anncontribution, earnings, randomearnings;
	private double annreturn;
	
	public Retirement(double annreturn1, int anncontribution1, int startage1, int endage1)
	{
		anncontribution = (int)(0.50*anncontribution1);
		annreturn = annreturn1;
		startyear = startage1;
		endyear = endage1;
	}
	public int value(int lastyear)
	{
		double balance = anncontribution*annreturn;
		int age = endyear-lastyear;
		while (age != 0)
		{
			if (age == 1)
			{
				previousyearbalance = (int)balance;
			}
			
			balance = balance +(annreturn*(balance + anncontribution));
			age--;
		}
		return (int)balance;
	}
	public int randomEarnings()
	{
		int randomNumber = (int)((Math.random()*19.5)-5);
		randomearnings = randomNumber;
		return randomNumber;
	}
	public void printChart()
	{
		int x = 5;
		int age = endyear-startyear;
		int year = endyear;
		int startyear1 = startyear;
		System.out.println("| Year | Amount Given | Balance | Previous Balance | Earnings | ");
		System.out.println("---------------------------------------------------------------");
		while (age != -1)
		{
			this.value(year);
			this.randomEarnings();
			String length1 = Integer.toString(previousyearbalance);
			String percentlength = Integer.toString(randomearnings);
			if (this.value(year) < 999)
			{
				if (length1.length() == 1)
				{
					if (percentlength.length() == 1)
						System.out.println("| " +startyear1 + " |     $" + anncontribution*2 + "    |  $" + this.value(year) + "   |        $" + previousyearbalance + "        | " + randomearnings+"%       |");
					else
						System.out.println("| " +startyear1 + " |     $" + anncontribution*2 + "    |  $" + this.value(year) + "   |        $" + previousyearbalance + "        | " + randomearnings+"%      |");
				} else if (length1.length() == 3) {
					if (percentlength.length() == 1)
						System.out.println("| " +startyear1 + " |     $" + anncontribution*2 + "    |  $" + this.value(year) + "   |      $" + previousyearbalance + "        | " + randomearnings+"%       |");
					else
						System.out.println("| " +startyear1 + " |     $" + anncontribution*2 + "    |  $" + this.value(year) + "   |      $" + previousyearbalance + "        | " + randomearnings+"%      |");
				} else {
					if (percentlength.length() == 1)
						System.out.println("| " +startyear1 + " |     $" + anncontribution*2 + "    |  $" + this.value(year) + "   |      $" + previousyearbalance + "       | "+ randomearnings+"%       |");
					else
						System.out.println("| " +startyear1 + " |     $" + anncontribution*2 + "    |  $" + this.value(year) + "   |      $" + previousyearbalance + "       | "+ randomearnings+"%      |");
				}
	  		}		
			else
			{
				if (length1.length() == 3)
					if (percentlength.length() == 1)
						System.out.println("| " +startyear1 + " |     $" + anncontribution*2 + "    | $" + this.value(year) + "   |      $" + previousyearbalance + "        | "+ randomearnings+"%       |");
					else
						System.out.println("| " +startyear1 + " |     $" + anncontribution*2 + "    | $" + this.value(year) + "   |      $" + previousyearbalance + "        | "+ randomearnings+"%      |");
				else 
					if (percentlength.length() == 1)
						System.out.println("| " +startyear1 + " |     $" + anncontribution*2 + "    | $" + this.value(year) + "   |     $" + previousyearbalance + "        | "+ randomearnings+"%       |");
					else
						System.out.println("| " +startyear1 + " |     $" + anncontribution*2 + "    | $" + this.value(year) + "   |     $" + previousyearbalance + "        | "+ randomearnings+"%      |");
			} 
			System.out.println("---------------------------------------------------------------");
	      year--;
			startyear1++;
			age--;		
		}
	}
}

/**
	This is the tester class calling the Retirement stuffs
*/

public class FourOhOneK_Theakanath
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("I will calculate your 401k investments and this will print out a chart");
		System.out.println("What year did you start investing?");
		int year = scan.nextInt();
		System.out.println("What year will you stop investing?");
		int stopyear = scan.nextInt();
		System.out.println("How many dollars do you contribute every year?");
		int dollars = scan.nextInt();
		System.out.println("What is the percent return of the bank? (Give it in a decimal Ex 0.06)");
		double return1 = scan.nextDouble();
		System.out.println("Here is your results for 401k investment\n");
		Retirement user = new Retirement(return1,dollars,year,stopyear);
		user.printChart();
		System.out.println("Heres another chart that has the hard coded values\n");
		Retirement firstAccount = new Retirement(0.06, 4000, 1990, 2011);
		firstAccount.printChart();
	}
}
