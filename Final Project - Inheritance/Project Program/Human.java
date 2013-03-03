//Inheritance: Program Example
//By: Sony Theakanath and Richard Liu

/**
	 The class Human extends to the Organism which now inherits all the
	 properties of Organism AND human. Note the extends. To call the parent
	 constructor you see that we use super() in order to call it. This is called
	 overriding.
	 
	 Refer to the Dog.java class for more javadoc since these are essentially the same.
*/
public class Human extends Organism
{
	protected String hair;
	protected String bloodType;
   
	public Human(String hairType, String bloodType1)
	{
		super("mammal", "complex"); //Note the super, we are calling it from the parent class
		hair = hairType;
		bloodType = bloodType1;
	}
	
	//Returns the protected variable to be accessed in other classes
	public String getHair()
	{
		return hair;
	}
	
	//Returns the protected variable to be accessed in other classes
	public String getBloodType()
	{
		return bloodType;
	}
	
	//Returns what the guy is talking about
	public String talk()
	{
		return "I am a human.";
	}
	
	//Sets the bloodtype
	public void setBloodType(String newType)
	{
		bloodType = newType;
	}
	
	//Sets the hair
	public void setHair(String newHair)
	{
		hair = newHair;
	}

   //Average heart rate of Human
	public int heart()
	{
		return 72;
	}
	
	//ToString method!
	public String toString()
	{
		return ("Hi. I have " + hair + " and " + bloodType);
	}
}