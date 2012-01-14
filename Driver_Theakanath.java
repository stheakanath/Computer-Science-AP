//Sony Theakanath

import java.util.Scanner;
import java.util.ArrayList;

public class NumCounter_Theakanath
{
	public static void main (String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Which assignment would you like? (7.1 or 7.2)");
		String answer = scan.nextLine();
		if (answer.equals("7.1"))
		{
			System.out.println("Launching Assignment 7.1: Counter from 0-50");
			System.out.println("Enter the numbers seperated by a comma. NO SPACES. EX: 5,3,1,3,21,5,1,2,12,4,1,21,4,1,2,4");
			String listofnumbers = scan.nextLine();
			Nums sevenpointone = new Nums(listofnumbers);
			sevenpointone.counter();
		} else if (answer.equals("7.2")) {
			System.out.println("Launching Assignment 7.2: Counter from -25 to 25");
			System.out.println("Enter the numbers seperated by a comma. NO SPACES. EX: 5,3,1,3,21,5,1,2,12,4,1,21,4,1,2,4");
			String listofnumbers = scan.nextLine();
			Nums sevenpointotwo = new Nums(listofnumbers);
			sevenpointtwo.counter();
		} else {
			System.out.println("Not valid entry. Closing Program");
		}
	}
}

class Nums
{
	//7.1 Vars
	private String[] numbers; //User inputed numbers
	private String[] counter; //List of 0 to 50
	private int[] occurrence = new int[51]; //Stores how many times each has occurred
	
	//7.2 Vars
	private String[] negcounter; //List of -25 to 25
	private int[] negoccurrence = new int[51];
	
	//Constructor which sets everything
	public Nums(String nums)
	{
		numbers = nums.split(",");
		counter = new String[51];
		for (int x = 0; x < counter.length; x++)
		{
			counter[x] = x + "";
		}
	}
	
	//Assignment 7.1 which counts each occurrence from 0 to 50
	public void counter()
	{
		for(int x = 0; x < numbers.length; x++)
		{
			for (int y = 0; y < counter.length; y++)
			{
				if(numbers[x].equals(counter[y]))
				{ 
					occurrence[y]++;
					break;
				}
			}
		}
		for (int z = 0; z < occurrence.length; z++)
		{
			System.out.println("Number " + z + " is typed " + occurrence[z] + " times.");
		}	
	}
	
	public void negcounter()
	{
		for(int x = 0; x < numbers.length; x++)
		{
			for (int y = 0; y < negcounter.length; y++)
			{
				if(numbers[x].equals(negcounter[y]))
				{ 
					negoccurrence[y]++;
					break;
				}
			}
		}
		for (int z = 0; z < negoccurrence.length; z++)
		{
			System.out.println("Number " + (z-25) + " is typed " + negoccurrence[z] + " times.");
		}	
	}
}