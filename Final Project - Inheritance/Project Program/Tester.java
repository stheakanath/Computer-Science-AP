//Inheritance: Program Example
//By: Sony Theakanath and Richard Liu

/**
	The main class tests out many features of this program, including
	the ability to override methods, cast objects, and set variables
	into a new value. As demonstrated casting did affect the output.
*/
public class Tester
{
	public static void main(String[] args)
	{
		MaleHuman richard = new MaleHuman();
		FemaleHuman sonya = new FemaleHuman();
		richard.setBloodType("AB"); //changes default value
		Organism borderTerrier = new Dog("mammal", "very complex"); //using other constructor
		System.out.println(borderTerrier.talk());
		System.out.println(borderTerrier.toString());
		((Dog)borderTerrier).train(); //casting an Organism to a Dog
		System.out.println(borderTerrier.toString());
		System.out.println(richard.toString());
		richard.setBloodType("A"); //changing a value again, just in case doctors misread the results
		System.out.println(richard.toString());
		System.out.println(richard.talk());
		Organism germ = new Organism();
		System.out.println(germ.talk());
		System.out.println(sonya.talk());
		sonya.setHair("short hair"); //changing value again
		System.out.println(sonya.getHair());
		System.out.println("Blood type: " + richard.getBloodType());
	}
}