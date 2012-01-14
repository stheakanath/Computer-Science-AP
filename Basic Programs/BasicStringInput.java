// Sony Theakanath
// Asg 2 String-Input

import java.util.Scanner;

public class Stringsinput_Theakanath
{
	public static void main (String[]args)
	{
		Scanner scan  = new Scanner (System.in);
		System.out.println("What is your First Name?");
		String firstName = scan.nextLine();
		System.out.println("What is your last name?");
		String lastName = scan.nextLine();
		String asgNumber = "              Type-Asg 2";
		String quote ="\n\"Donuts, is there anything we can do without them?\" -Homer Simpson";
		System.out.println(firstName + " " +  lastName +asgNumber + quote);
	}
}
