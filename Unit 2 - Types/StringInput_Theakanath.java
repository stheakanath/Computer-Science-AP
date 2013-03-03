//Sony Theakanath
//Computer Science AP

import java.util.Scanner;

public class StringInput_Theakanath
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.println("What is your first name?");
		String firstname = input.nextLine();
		System.out.println("What is your last name?");
		String lastname = input.nextLine();
		System.out.println("What school do you go to?");
		String school = input.nextLine();
		String quote = "You either die the hero, or live long enough to see yourself become the villain.";
		String quoteOrigin = "-Harvey Dent, The Dark Knight Rises";
		
		System.out.println("\"" + "Hey " + firstname + " " + lastname + " from " + school + ", do you want to know a really cool quote?" + "\"" + "\"" + quote + "\"" + quoteOrigin);
	}
}