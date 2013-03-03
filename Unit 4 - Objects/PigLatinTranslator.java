//Sony Theakanath
//Objects-Asg2

/**
	This program will take the first letter of a word
	and will put it in the end of the word adding -ay at
	the end of the word. (Cannot do sentences yet).
*/
import java.util.Scanner;

public class PigXl8r_Theakanath
{
	public static void main (String[]args)
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Pig Latin Translator(Simplified) \nby Sony Theakanath");
	System.out.println("\nThis program will take the first letter of a word");
	System.out.println("and will put it in the end of the word with -ay");
	System.out.println("-------------------------------------------------");
	System.out.println("Give me a word to translate into Pig Latin");
	String rawWord = input.nextLine();
	int rawWordLength = rawWord.length();
	String rawFinishedWord = rawWord.substring(1,rawWordLength)+ rawWord.substring(0,1)+"ay";
	String finalFinishedWord = rawFinishedWord.toLowerCase();
	System.out.println("You inputed " + rawWord + " and I translated it to");
	System.out.println(finalFinishedWord);
	}
}