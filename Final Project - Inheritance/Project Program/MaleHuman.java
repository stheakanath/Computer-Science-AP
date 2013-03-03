//Inheritance: Program Example
//By: Sony Theakanath and Richard Liu

/**
    Here we see the MaleHuman extending to the Human. Thus the MaleHuman
    inherits the properties of the Human AND the Organism because Human
    "extends" to the Organism.
*/
public class MaleHuman extends Human //Here we inherit the properties of the Human
{
	public MaleHuman()
	{
		super("short hair", "O"); //Again we see overriding
	}

	public MaleHuman(String hairLength, String blood)
	{
		super(hairLength, blood); //Overriding
	}
	
	//Method overrding the talk() method to show that he is a male
	public String talk()
	{
		return "Hey bro.";
	}
	
	//Method overriding again to show the different heart rate for males
	public int heart()
	{
		return 90;
	}
	
	/*
		The toString access the protected variables in the parent class by
		calling super();
	*/
	public String toString()
	{
		return ("I am a male human. I have " + super.getHair() + " and " + super.getBloodType() + " type blood.");
	}
}