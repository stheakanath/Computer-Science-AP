//Sony Theakanath
//Warmup-Asg3: School Classes


/** The tester class. This is where I test all 3 Classes. 
	 It prints out the objects and uses all the methods in 
	 each of the classes
	 */
public class School_Theaka
{
	public static void main (String[]args)
	{
		//Creating all of the objects
		int[] sonyscores = {91,60,100,95,96,81,76,100,87};
		int[] chrisscores = {91,70,89,60,70,89,12,45,89,100};
		int[] richardscores = {88, 89,90,92}; //Required array for assignment
		int[] bobscores = {100,100,100,100,90,100,100};
		Address bellarmine = new Address("960 W Hedding Street",  "San Jose", "California", 95126);
		Address sonyaddress = new Address("1211 Spruance St", "San Jose", "California", 95128);
		Student sony = new Student("Sony", "Theakanath", sonyaddress, bellarmine, sonyscores );
		Address chrisaddress = new Address("123 Toe St", "San Jose", "California", 95126);
		Student chris = new Student("Chris", "Correa", chrisaddress, bellarmine, chrisscores );
		Address richardaddress = new Address("681 Something st", "San Jose", "California", 95123);
		Student richard = new Student("Richard", "Liu", richardaddress, bellarmine, richardscores);
		Student bob = new Student("Bob", "Theakanath", sonyaddress, bellarmine, bobscores);
		
		//Excercise 6.2
		System.out.println("Student Sony");
		sony.setTestScore(1, 95);
		System.out.println(sony.toString());
		System.out.println("Hmm I wonder what Sony got on his 1st test: " + sony.getTestScore(1) + "\n---------------------------------------------");
		System.out.println("Student Chris");
		System.out.println(chris.toString() + "\n---------------------------------------------");
		System.out.println("Student Richard");
		System.out.println(richard.toString());
		
		//Excercise 6.3
		System.out.println("\n---------------------------------------------\nComputer Science A AP Class");
		Course compsciap = new Course("Computer Science \"A\" AP");
		compsciap.addStudent(sony);
		compsciap.addStudent(chris);
		compsciap.addStudent(richard);
		System.out.println("Adding student Bob to Class...");
		compsciap.addStudent(bob);
		System.out.println("Enrolled Students: \n");
		compsciap.roll();
		System.out.println("\nOverall Course Test Average: " + compsciap.average());
		
	}
}

/** The address class creates an address in order to store the objects
	 It is later used in the Student class.
	 */
class Address
{
   private String streetAddress, city, state;
   private long zipCode;
	
	//Constructor
   public Address (String street, String town, String st, long zip)
   {
      streetAddress = street;
      city = town;
      state = st;
      zipCode = zip;
   }

   public String toString()
   {
      String result;

      result = streetAddress + "\n";
      result += city + ", " + state + "  " + zipCode;

      return result;
   }
}

/** The Student class creates an object per student. It contains
	 3 test scores and his home, school address. It also contains
	 his first name and his last name
	 */
class Student
{
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	private int[] testscores;
	
	//Constructor
	public Student (String first, String last, Address home, Address school, int[] scores)
	{
		testscores = new int[scores.length];
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		for(int x = 0; x < scores.length; x++)
		{
			testscores[x] = scores[x];
		}
	}
	
	//Sets the test score for a particular test
	public void setTestScore (int test, int score)
	{
		testscores[test-1] = score;
	}
	
	//Get the test score of a particular test
	public int getTestScore (int test)
	{
		if (test > testscores.length || test < 0)
		{
			return -1;
		} else {
			return testscores[test-1];
		}
	}
	
	//Gets the name of the student. Used in Course class.
	public String getName()
	{
		return firstName + " " + lastName;	
	}
	
	//Gets the average of the student
	public int average()
	{
		int total = 0;
		for (int x = 0; x < testscores.length; x++)
		{
			total+= testscores[x];
		}
		return total/testscores.length;
	}
	public String toString()
	{
		String result;
		result = firstName + " " + lastName + "\n\n";
		result += "Home Address:\n" + homeAddress + "\n\n";
		result += "School Address:\n" + schoolAddress + "\n\n";
		for (int x = 0; x < testscores.length; x++)
		{
			result+= "Test " + (x+1) + ": " + testscores[x] + "\n";
		}
		result += "Average Test Scores: " + this.average();
		return result;
	}
}

/** The Course creates an object for each course. It contains
	 all of the students in the class and the name of the course. 
	 */
class Course
{
	private Student[] enrolledstudents = new Student[10];
	private int amountofstudents;
	private String coursename;
	
	//Constructor
	public Course(String coursename)
	{
		coursename = this.coursename;
	}
	
	//Adds the student to the array
	public void addStudent(Student name)
	{
		enrolledstudents[amountofstudents] = name;
		amountofstudents++;
	}
	
	//Computes the average for all students in the course
	public int average()
	{
		int total = 0;
		for(int x = 0; x < amountofstudents; x++)
		{
			total += enrolledstudents[x].average();
		}
		return (int)(total/amountofstudents);
	}
	
	//Prints out the students enrolled
	public void roll()
	{
		for(int x = 0; x < amountofstudents; x++)
		{
			System.out.println(enrolledstudents[x].getName());
		}
	}
}	