//Sony Theakanath
//Arrays-Asg3: Authentication Arrays

import java.util.Scanner;

/** This is the first assignment utilizing arrays for a login system.
    System is lined up with each other and there is 7 Predefined Usernames/passwords.
*/
class Authenticate 
{
	//Defines, checks and prints answers based on input
	public void arrayChecker(String name1,String pass1)
	{
		Scanner scan = new Scanner(System.in);
		String pass = pass1;
		String name = name1;
		String[] username = {"stheakanath", "BLindy", "chris", "richard.a.liu", "thomastk", "pingpongplaya", "thetroll"};
		String[] password = {"123xyz", "f0013g01d", "iamaloser", "Pa55w0rd", "thomas", "pingballs123", "foreveralone"};
		int x = 0;
		int tries = 3;
		while (x < 7)
		{
			if(!(name.equals(username[x])) && tries > 0) {
				x++;
				if (x == 6 && !(name.equals(username[x])))
				{
					System.out.println("Incorrect Username. Enter Again. " + tries  + " tries left.");
					tries--;
					name = scan.nextLine();
					x = 0;
				}
			} else if (name.equals(username[x]) && pass.equals(password[x])) {
				System.out.println("Correct Login!");
				x = 10;
			} else if (name.equals(username[x]) && !(pass.equals(password[x]))) {
				while (tries != 0)
				{
					System.out.println("Incorrect Password but correct Username. Enter Again. " + tries + " tries left.");
					tries--;
					pass = scan.nextLine();
				}
				x=10;
				System.out.println("TRIES RAN OUT. LOCKOUT.");
			} else if (tries == 0) {
				System.out.println("TRIES RAN OUT HAHA. I SHALL LOCK YOU OUT.");
				x = 10;
			} else {
				System.out.println("incorrect login");
				name = scan.nextLine();
				tries++;
			}
		}
	}
}

/** tester class 
 */
public class LoginAuthenticate_Theakanath
{
	public static void main (String[]args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter username");
		String name = scan.nextLine();
		System.out.println("Enter password");
		String pas= scan.nextLine();
		Authenticate tester = new Authenticate ();
		tester.arrayChecker(name, pas);
	}
}