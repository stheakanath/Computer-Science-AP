//Inheritance: Program Example
//By: Sony Theakanath and Richard Liu
  
/**
	This Inheritance program example will teach you the basics of inheritance,
   outlining the important aspects using javadocs throughout the code. The example
   I am using here is Organism and its subparts. The master class Organism has 3 major
   functions: heart, brain, and skeleton.
  
   Inheritance basically "inherits" the aspects of a class to use within its base class.
   This allows for more precise functions for the class.
  
   Here's an example. Humans inherit Organism functions. We use this by extending Humans to
   Organisms. We can be even more precise by making MaleHumans which extend to Human. This
   inherits Human functions PLUS the parent classes it extends to. So it inherits both
   the Human class and the Organism class.
*/

/**
   The class Organism is the base class in which all of the classes inherit. This has
   4 basic functions: heart, brain, and skeleton which denote what kind is what. The toString
   method prints out everything.
*/

public class Organism
{
	protected String species; //determines what species the Organism is
	protected String typeOfOrganism; //determines what type of organism the species is
	
	public Organism() //default constructor, sets everything to null
	{
		species = null;
		typeOfOrganism = null;
	}
	
	public Organism(String speciesType, String type)
	{
		species = speciesType;
		typeOfOrganism = type;
	}
	
	public String talk()
	{
		return "I cannot speak.";
	}
 
	public String getSpecies() { return species; }
 
	public String getTypeOfOrganism() { return typeOfOrganism; }
	 
	public String toString()
	{
		return "I am a " + species + " and I am a " + typeOfOrganism + " being.";
	}
}