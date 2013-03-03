//Sony Theakanath
//Searching-Asg1: Linear Search

import java.util.*;

/**
	The program ran well the first time I compiled it. It was free of 
	errors and I had no problem of making the program.
	
	Interface finder includes the method find which finds the "needle"
	in "haystack".
*/
interface Finder
{
	int find( String[] haystack, String needle );
}

/**
	Class SequentialFinder implements the Finder and it overrides the method
	find. This finds the needle in the haystack and returns the index. If it
	is not found it returns -1.
*/
class SequentialFinder implements Finder
{
	public int find(String[]haystack, String needle)
	{
		for(int x = 0; x < haystack.length; x++)
		{
			if (haystack[x].equals(needle))
				return x; //If needle is found
		}
		return -1; //If needle is not found
	}
}

/** 
	The tester class. This has 2 methods: main and getList. getList 
	returns the list of the teachers to find using the needle and the
	tester asks the user what teacher he wants to find and returns the
	number accordingly.
*/
public class SequentialTester_Theakanath
{
	public static String[] getList()
	{
		String[] names = {"Adams", "Amarillas", "Baxter", "Duong","Giraudo", 
								"Gonzalez", "Hansbrough", "Kniffin", "Lum",
								"Lindemann", "Mathurin", "McCullough", "Molina", 
								"Reyerson", "Ward", "Wolf", "Wong", "Zabinski"};
		return names;
	}
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		SequentialFinder teachers = new SequentialFinder();
		System.out.println("Enter the name of the teacher you want to find.");
		String name = scan.nextLine();
		System.out.println("Finding name....");
		int result = teachers.find(getList(), name);
		if (result == -1)
			System.out.println("Teacher not found in list");
		else
			System.out.println("Teacher found in index: " + result + ".");	
	}
}