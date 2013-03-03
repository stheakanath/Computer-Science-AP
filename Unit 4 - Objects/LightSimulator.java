//Sony Theakanath
//Richard LUUUUUUIII
//Class-Asg6: Books Class Prog
import java.util.Scanner;

/**
	This class prints out the state of the lights and converts
	the boolean.
*/
class Bulb
{	
	private boolean response;
	//Main Stuff
	public void State()
	{
		if (response == true)
		{
			System.out.println("THIS LIGHT IS ON");
		} else {
			System.out.println("THIS LIGHT IS OFF");
		}
	}
	public void Converter(String question)
	{ 
		int num = 0;
		while (num == 0)
		{
			if (question.equals("yes"))
			{
				response = true;
				num++;
			}
			else if (question.equals("no"))
			{
				response = false;
				num++;
			} 
		}
	}
}

/**
	Main method calls everything and asks
*/
public class Lights_TheakanathLiu
{
	public static void main (String[]args)
	{
		//First Instance
		Scanner scan = new Scanner(System.in);
		Bulb bulb = new Bulb();
		Bulb bulb2 = new Bulb();
		System.out.println("Do you want to turn on your first light?");
		System.out.println("Type \"yes\" or \"no\"");
		String question = scan.nextLine();
		bulb.Converter(question);
		bulb.State();
		// Second Instance
		System.out.println("Do you want to turn on your second light?");
		System.out.println("Type \"yes\" or \"no\"");
		String question2 = scan.nextLine();
		bulb.Converter(question2);
		bulb.State();
	}
}