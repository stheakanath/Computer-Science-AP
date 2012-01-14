// Sony Theakanath
// Types-Asg5: In class Average

import java.util.Scanner;
import java.text.*;

public class Average_Theakanath
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a first integer");
		int firstInteger = input.nextInt();
		System.out.println("Give me a second integer");
		int secondInteger = input.nextInt();
		System.out.println("Give me a third integer");
		int thirdInteger = input.nextInt();
		double averageInput = (firstInteger + secondInteger + thirdInteger)/3;
		System.out.println("Your average of these three numbers is: " + averageInput);
		System.out.println("I got this by finding the average of the numbers.");
		double firstRandom = (Math.random()*(100-0));
		double secondRandom = (Math.random()*(100-0));
		double thirdRandom = (Math.random()*(100-0));
		double randomAverage = (firstRandom + secondRandom + thirdRandom)/3;
		System.out.println("The average of the three random generated integers: " + firstRandom);
		System.out.println(secondRandom + " and " + thirdRandom);
		DecimalFormat lastFormatPrint = new DecimalFormat("#.##");
		System.out.println("is " + lastFormatPrint.format(randomAverage));
	}
}