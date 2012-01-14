//Sony tHEAKANATH
//If-Asg8-Quizzer

import java.util.Scanner;

/** Asks series of questions and grades
    Learned if lesson
    */
public class Quizzer_Theakanath
{
	public static void main (String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Take test? (yes or no)");
		String answer = scan.nextLine();
		while (answer.equalsIgnoreCase("yes"))
		{ 
			Questioneer question = new Questioneer();
			question.askQuestions();
			question.displayResults();
			System.out.println("Play Again?");
			answer = scan.nextLine();
		}
		System.out.println("Good bye nice playing with you");
	}
}


/** The actual muscle of the program. Asks questions and 
	 stores the grades. Also handles prompts
	 */
class Questioneer
{
	private int fullScore;
	
	Scanner scan = new Scanner(System.in);
	
	//Asks Questions
	public void askQuestions()
	{
		//Questions + Grading
		System.out.println("This will determine how smart you are");
		
		//Q1
		System.out.println("1 + 1 = ?");
		System.out.println("A=window; B=2; C=4; D=IDK"); 
		String q1 = scan.nextLine();
		while (!q1.equalsIgnoreCase("a")&&!q1.equalsIgnoreCase("b")&&!q1.equalsIgnoreCase("c")&&!q1.equalsIgnoreCase("d"))
		{
			System.out.println("Invalid entry. Try Again.");
			q1 = scan.nextLine();
		}
		if (q1.equalsIgnoreCase("a"))
		{
			System.out.println("Correct! 1 Point Awarded");
			fullScore++;
		} else {
			System.out.println("Incorrect.");
		}
		//Q2
		System.out.println("What is a better school, Bellarmine or Mitty");
		String q2 = scan.nextLine();
		while (!q2.equalsIgnoreCase("bellarmine")&&!q2.equalsIgnoreCase("mitty"))
		{
			System.out.println("Invalid entry.Try Again.");
			q2 = scan.nextLine();
		}	
		if (q2.equalsIgnoreCase("bellarmine"))
		{
			System.out.println("Correct! 1 Point Awarded");
			fullScore++;
		} else {
			System.out.println("Incorrect. 50 Points Deducted");
			fullScore -= 50;
		}
		
		//Q3
		System.out.println("Does comparing a string using == work in Java?");
		System.out.println("A= Yes; B= No; C= IDK");
		String q3 = scan.nextLine();
		while (!q3.equalsIgnoreCase("a")&&!q3.equalsIgnoreCase("b")&&!q3.equalsIgnoreCase("c"))
		{
			System.out.println("Invalid entry. Try Again.");
			q3 = scan.nextLine();
		}
		if (q3.equalsIgnoreCase("a"))
		{
			System.out.println("Correct! 1 Point Awarded");
		} else {
			System.out.println("Incorrect");
		}
		
		//Q4
		System.out.println("Who's better Chris or Sony");
		String q4 = scan.nextLine();
		while (!q4.equalsIgnoreCase("sony")&&!q4.equalsIgnoreCase("chris"))
		{
			System.out.println("Invalid Entry. DO IT AGAIN UGH.");
			q4 = scan.nextLine();
		}
		if (q4.equalsIgnoreCase("sony"))
		{
			System.out.println("Correct! 50 Points Awarded!!");
			fullScore+= 50;
		} else {
			System.out.println("Booo Chris. You lost 100,000 points.");
			fullScore-= 100000;
		}
		
		//Q5
		System.out.println("What is the deriative of 0");
		System.out.println("A=234; B= sin(x)/x^2*34; C= 0");
		String q5 = scan.nextLine();
		while (!q5.equalsIgnoreCase("a")&&!q5.equalsIgnoreCase("b")&&!q5.equalsIgnoreCase("c"))
		{
			System.out.println("Invalid Entry. DO IT AGAIN UGH.");
			q5 = scan.nextLine();
		}
		if (q5.equalsIgnoreCase("c"))
		{
			System.out.println("Correct! 1 Point Awarded");
		} else {
			System.out.println("Incorrect.");
		}
		
		//Q6
		System.out.println("What is your Weighted GPA");
		System.out.println("A= < 3.0; B= <3.5; C= <4.0; D= >4.01");
		String q6 = scan.nextLine();
		while (!q6.equalsIgnoreCase("a")&&!q6.equalsIgnoreCase("b")&&!q6.equalsIgnoreCase("c")&&!q6.equalsIgnoreCase("d"))
		{
			System.out.println("Invalid Entry. DO IT AGAIN UGH.");
			q6 = scan.nextLine();
		}
		if (q6.equalsIgnoreCase("D"))
		{
			System.out.println("Awesome! 5 Points Awarded");
		} else if (q6.equalsIgnoreCase("C")) {
			System.out.println("Awesome! 3 Points Awarded");
		} else {
			System.out.println("Wow improve man. No points for you.");
		}
	}
	
	//Gets score
	public int getScore()
	{
		return fullScore;	
	} 
	
	//Display result
	public void displayResults()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Done! Do you want to know your score?");
		String boo = scan.nextLine();
		while (!boo.equalsIgnoreCase("yes")&&!boo.equalsIgnoreCase("no"))
		{
			System.out.println("Incorrect input. Type 'Yes' or 'No'");
			boo = scan.nextLine();
		}
		if (boo.equalsIgnoreCase("yes"))
		{
			System.out.println("Your score is: " + fullScore+ " out of 59");
		} else {
			System.out.println("You entered an answer other than no. I wont give your result.");
		}
	}
	
} 