//Inheritance: Program Example
//By: Sony Theakanath and Richard Liu

/**
	Refer to Organism.java for inheritance explaination.
	
   The class Dog "inherits" the properties of Organism. So Dog has access to methods,
   talk, toString and the constructor and its own methods.
  
   To inherit these properties the Dog class has to "extend" to the parent class which
   in this case is the Organism.
  
   If there are two functions that have the same name then to call the parent function you
   have to "super" it. Example to call the talk function in Organism you call it like:
   super.talk(); To call the constructor you just call super() + the constructor parameters.
   The code is explained below.
*/

public class Dog extends Organism //To "inherit" the parent class you have to "extend" to the parent class
{
	protected boolean isTrained;
	
	public Dog() //default constructor
	{
		super("mammal", "complex");
	}
	
	public Dog(String type, String organismType)
	{
		super(type, organismType);
	}

	public String talk()
	{
		return "Bark! Bark!";
	}
	
	public void train()
	{
		isTrained = true;
	}

	public String toString()
	{
		if (isTrained)
			return ("I am a trained dog. I am obedient.");
		return ("Bark, bark, bark, grrr. BARK!!!");
	}
}