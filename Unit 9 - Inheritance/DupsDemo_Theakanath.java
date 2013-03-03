//Sony Theakanath
//Chris correa
//ArrayLists-Asg4: Remove Dup

import java.util.ArrayList;

/** This program removes the duplicates of the program. It supplies two ways:
	 It can return a regular array or an ArrayList. Your choice.
	 */
	 
public class DupsDemo_Theakanath
{
	public static void main(String[] args)
	{
		//Creating Le Studs
		Student[] studs = {	new Student("Chris","Yavercovski",2015),
					new Student("Matthew", "Shales", 2013),
					new Student("Kyle", "Gustlin", 2012),
					new Student("Riley", "Quinlan", 2013),
					new Student("Adam", "Pramono", 2013),
					new Student("Adam", "Quichocho", 2013),
					new Student("Adam", "Pinarbasi", 2013),
					new Student("Kyle", "Suppes", 2012),
					new Student("Chris","Yavercovski",2015),
					new Student("Chris","Yavercovski",2015) };
					
		//Copying studs from the regular Array to an ArrayList
		ArrayList<Student> liststuds = new ArrayList<Student>();
		for (Student s : studs)
         liststuds.add(s);
		
		//Removing and Printing the Duplicates using ArrayList Method
		ArrayList<Student> noDups = removeDups( liststuds );	
		System.out.println("Printing out using ArrayList converter method");
		for(int x = 0; x < noDups.size(); x++)
			System.out.println(noDups.get(x).getEmail());

		//Removing and Printing the Duplicates using reg Array Method
		Student[] nodupsregarray = removeDups ( studs );
		System.out.println("\nPrinting out using ArrayList converter method");
		for(int x = 0; x < nodupsregarray.length; x++)
			System.out.println(nodupsregarray[x].getEmail());	
		
	}

	/**
		Return a new Array with no duplicates
	*/
	public static Student[] removeDups( Student[] input)
	{
		ArrayList<Student> finishedlist = new ArrayList<Student>();
		for (Student s : input)
         finishedlist.add(s);
		for (int x = 0; x < finishedlist.size(); x++)
		{
			for (int y = x+1; y < finishedlist.size(); y++)
			{
				if(finishedlist.get(x).getEmail().equals(finishedlist.get(y).getEmail()))
				{
					finishedlist.remove(y);
					y--;
				}
			}
		}
		
		Student[] finallist = new Student[finishedlist.size()]; 
		finallist = finishedlist.toArray(finallist);
		return finallist;
		
	}
	
	/**
		Return a new ArrayList with no duplicates.
		This uses an ArrayList for input and exports
		using an ArrayList.
	*/
	public static ArrayList<Student> removeDups( ArrayList<Student> input )
	{
		ArrayList<Student> finishedlist = input;
		for (int x = 0; x < finishedlist.size(); x++)
		{
			for (int y = x+1; y < finishedlist.size(); y++)
			{
				if(finishedlist.get(x).getEmail().equals(finishedlist.get(y).getEmail()))
				{
					finishedlist.remove(y);
					y--;
				}
			}
		}
		return finishedlist;
	}
}

/** Student class which we did in le class. It makes
	 the email for the student.
	*/

class Student
{
	private String first;
	private String last;
	private int year;  //4 digit grad year
	
	public Student( String firstName, String lastName, int year )
	{
		first = firstName;
		last = lastName;
		this.year = year;
	}

	/**
		Returns the BCP email for this student.
		This method is an accessor
	*/
	public String getEmail ()
	{
		String retVal = this.first + "." + this.last + (this.year%100) + "@bcp.org";
		return retVal;
	}
}
