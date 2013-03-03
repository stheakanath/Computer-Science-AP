//Inheritance: Program Example
//By: Sony Theakanath and Richard Liu

/**
    Here we see the FemaleHuman extending to the Human. Thus the FemaleHuman
    inherits the properties of the Human AND the Organism because Human
    "extends" to the Organism.
*/

public class FemaleHuman extends Human
{
	public FemaleHuman()
	{
		super("long hair", "B");
	}
	
	//Method overriding to reflect the voice of a female
	public String talk()
	{
		return "Hello there.";
	}
	
	//Overriding to reflect the female heart
	public int heart()
	{
		return 100;
	}
	
	//Again like the male the toString access the protected variables in the parent class by calling super();
	public String toString()
	{
		return ("I am a female human. I have " + super.getHair() + " and " + super.getBloodType() + " type blood.");
	}	
}
