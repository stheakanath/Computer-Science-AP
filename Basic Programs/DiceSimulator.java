//Sony Theakanath
//Class-Asg2 die class -print

/** Shows my abilityto create a method and a print function

*/
class Die
{
	private final int MAX_FACE = 6;
	private int faceValue;
	public int roll()
	{
		faceValue = (int)(Math.random() * MAX_FACE) + 1;
		return faceValue;
	}
	public int getFaceValue()
	{
		return faceValue;
	}
	
	public void print1()
	{
		System.out.print(roll());	
	}

}

public class DieTester_Theakanath
{
	public static void main (String[]args)
	{
		Die die1 = new Die();
		Die die2 = new Die();
		System.out.print("Die1: ");
		die1.print1();
		System.out.print(" Die2: ");
		die2.print1();
	}
}
	