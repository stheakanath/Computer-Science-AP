//Sony Theakanath
//Arrays-Asg6: Authentication Objects

import java.util.Scanner;

/** The AuthUser makes the specific account for that one person.
	 Also validates the password and returns a welcome message if password
	 is correct 
	    */
class AuthUser 
{
	String loginname, password, realname;
	public AuthUser(String login, String pass, String real) //Initalizes all of the above.
	{
		loginname = login;
		password = pass;
		realname = real;
	}
	public boolean validate(String attemptpass) // Validates password
	{
		if (!(attemptpass.equals(password)))
			return false;
		else
			return true;
	}
	public void successMessage() //Success Message
	{
			System.out.println("Successful Login! Welcome " + realname + "!");
	}
}

/** The tester class makes the array of objects and it prompts 
 	 the user for the username and password. It checks the array 
	 and returns messages depending on that result it is. It also includes
	 tries so if there are no more tries it closes the program.
	 */ 

public class AuthChecker_Theakanath
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		//Making Accounts
		AuthUser sony = new AuthUser("stheakanath", "123xyz", "Sony Theakanath");
		AuthUser chris = new AuthUser("ccorrea14", "lamepassword", "Chris Correa");
		AuthUser brad = new AuthUser("BLindy", "f0013g01d", "Brad Lindemann");
		AuthUser[] accounts = {sony, chris, brad};
		
		/**Prompts + Testing Username. This the main 
			part of the program. It is the validator and tries
			checker.
			*/
		System.out.println("Enter Username: ");
		String username = scan.nextLine();
		int tries = 3;
		for(int x = 0; x < accounts.length; x++)
		{
			if (tries == 1 )
			{
				System.out.println("No Tries Left. Closing Program.");
				break;
			}
			if (username.equals(accounts[x].loginname))
			{	
				tries = 3;
				System.out.println("Enter Password: ");
				String password = scan.nextLine();
				// Testing Password
				while (accounts[x].validate(password) == false)
				{
					if (tries == 1)
					{
						System.out.println("No More Tries. Closing Program.");
						break;
					} else {
						tries--;
						System.out.println("Incorrect Password. " + tries + " tries left. Enter Again: ");
						password = scan.nextLine();
					}
				}
				if (tries == 1)
				{ 
					break;
				} else {
					accounts[x].successMessage();
					break;
				}
			} 
			if (x == accounts.length-1) // Closes Program if there are no more tries for username.
			{
				tries--;
				System.out.println("No Matched Username. " + tries + " tries left. Enter Again: ");
				username = scan.nextLine();
				x = 0;
			}
		}
		
		
	}
}