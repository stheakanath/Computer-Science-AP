// Sony
// Advanced Calculator

import java.util.Scanner;
/**
  More Advanced Calculator from BasicCalcultor, now stores values in memory
*/
class BasicCalculator
{
	private int operandA;
	private int operandB;
	private int memory;
	
	//Setting values
	public void setA( int a )
	{
		operandA = a;
	}

	public void setB( int b )
	{
		operandB = b;
	}

	/*The add method takes no parameters and returns the sum of 
	the values in operandA and operandB.*/
	 
	public int add ()
	{
		return operandA + operandB;
	}
	
	//Difference method substracts
	
	public int difference ()
	{
		return operandA-operandB;
	}
	
	//Memory Plus adds "5" to memory
	public int memoryPlus(int num )
	{
		return num+memory;
	}
	
	//MemoryMinus substracts "5" from memory
	public int memoryMinus(int num)
	{
		return num - memory;
	}
	
	//memoryReturn stores the parameter value in the memory instance variable
	public void memoryStore(int num)
	{
		memory = num;
	}
	
	public int memoryRecall()
	{
		return memory;
	}
	
	

}

public class Calculator_Theakanath
{
	public static void main (String []args)
	{
		BasicCalculator calc = new BasicCalculator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a Value A: ");
		int a = scan.nextInt();
		calc.setA(a);
		System.out.println("Give me a Value B: ");
		int b = scan.nextInt();
		calc.setB(b);
		
		int add1= calc.add();
		int difference2 = calc.difference();
		System.out.println("Sum " + add1);
		System.out.println("Difference " + difference2);
		System.out.println("Now for Memory Stored Values (Note Memory = 0 before functions)");
		System.out.println("Memory Plus (Adds '5' to memory): " + calc.memoryPlus(5));
		System.out.println("Memory Minus (Substracts '5' from memory): " + calc.memoryMinus(5));
		calc.memoryStore(5);
		System.out.println("Memory Store (Stores 5 to memory)");
		System.out.println("Memory Recall(Recalls Memory) " + calc.memoryRecall());
	}

}