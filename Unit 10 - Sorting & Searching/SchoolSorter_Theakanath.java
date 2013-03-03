//Sony Theakanath
//Searching-Asg2: Sorted School (In Class)

import java.util.Collections;
import java.util.ArrayList;

/** The tester class. This has the main, creates the arraylist and 
	 prints out the results after calling compareTo
	 */
public class SchoolSorter_Theakanath {
	public static void main(String[] args)
	{
		//Students ArrayList
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Sony", "Bellarmine", 31, 7));
		students.add(new Student("Chris", "Bellarmine", 20, 7));
		students.add(new Student("Richard", "Bellarmine", 26,7));
		students.add(new Student("Bryce", "Bellarmine", 28,7));
		students.add(new Student("Joe", "Bellarmine", 33, 7));
		students.add(new Student("Sony", "Bellarmine", 30,7));
		
		//Teachers ArrayList
		ArrayList<Teacher> teachers = new ArrayList<Teacher>();
		teachers.add(new Teacher("Brad", "Bellarmine"));
		teachers.add(new Teacher("Katie", "Bellarmine"));
		teachers.add(new Teacher("Urza", "Bellarmine"));
		
		//Sorting
		Collections.sort(students);
		Collections.sort(teachers);
		
		//Printing 
		System.out.println("Sorting Students. Printing and displaying students according to name then GPA if tie. \n");
		for(Student s: students)
			System.out.println(s.getName() + " " + s.getGPA());
		System.out.println("-----------------\nTesting out compareTo (Chris[1] and Joe[2])..\n");
		System.out.println(students.get(1).compareTo(students.get(2)));
		System.out.println("-----------------\nSorting Teachers and printing sorted list..\n");
		for(Teacher t: teachers)
			System.out.println(t.getName());
	}
}

/** Person class overides the compareTo method and compares the names of the
	 students. It implements Comparable in order to use the COMpareTo method.
	 */
class Person implements Comparable
{
	private String name;
	
	public Person( String name ) { this.name = name; }
	
	public String getName() { return name; }
	
	//Overriding compareTo
	public int compareTo(Object obj) { return this.toString().compareTo(obj.toString()); }

  	public String toString()
	{
		String returnString = "person named: " + name;
		return returnString;
	}
	
}

/** Student class extends the Person and personalizes it for the student.
	 It includes the GPA school and all the stuff from Person. It also
	 overrides compareTo for student to also include GPA when comparing
	 */
class Student extends Person
{
	private String school;
	private int numUnits;
	private double gradePoints;
	
	public Student( String studName, String school, double gradePoint, int numUnit )
	{
		super( studName );
		this.school = school;
		numUnits = numUnit; //Changed to check GPA
		gradePoints = gradePoint;
	}
  
  	public void addCredits( int units, double points )
	{
		numUnits += units;
		gradePoints += points;
	}
	
	//Overriding compareTo from parent class.
	public int compareTo(Student obj) { return this.toString().compareTo(obj.toString()); }
	
	//Created for printing. This returns the GPA.
	public double getGPA() { return gradePoints/numUnits; }
  
	public String toString()
	{
		String returnString = "I'm a Student at: " + school + " and I'm a " + super.toString();
		returnString = returnString + "\n  and i have GPA of " + gradePoints/numUnits;
		return returnString;
	}
}

/** Same as the Student class, this is personalized for the teacher.
	 Just has teacher attributes nothing more. COmpareto is not overrided
	 here.
	*/	

class Teacher extends Person 
{
	private String school;
	private int numClasses;

	public Teacher( String teacherName, String school )
	{
		super( teacherName );
		this.school = school;
		numClasses = 0;
	}
	
	public void addClass( ) { numClasses += 1;}
	 
	public String toString()
	{
		String returnString = "I'm a Teacher at: " + school + " and I'm a " + super.toString();
		returnString = returnString + "\n  I teach " + numClasses + " classes";
		return returnString;
	}
}

