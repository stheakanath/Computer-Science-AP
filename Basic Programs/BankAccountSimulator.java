//Sony Theakanath
//Class-Asg8: Account Class

import java.text.NumberFormat;

/**  
	Represents a bank account with basic services such as deposit
  and withdraw.
  */
public class AccountTest_Theakanath
{
	public static void main (String[]args)
	{
		Account firstAccount = new Account(123412);
		Account secondAccount = new Account(312441);
		firstAccount.createAccount(234.12);
		secondAccount.createAccount(200);
		System.out.println("Your current balance for account "+ firstAccount.acctNumber + ": "+ firstAccount.balance);
		System.out.println("Your current balance for account "+ secondAccount.acctNumber + ": " + secondAccount.balance);
		System.out.println("Now I withdraw 24 dollars from both of the accounts. Also I get a fee of 5 dollars.");
		firstAccount.debit(24);
		secondAccount.debit(24);
		System.out.println("Your new balance for account "+ firstAccount.acctNumber + ": "+ firstAccount.balance);
		System.out.println("Your new balance for account "+ secondAccount.acctNumber + ": "+ secondAccount.balance);

	}
}

class Account
{
   private final double RATE = 0.035;  // interest rate of 3.5%

   public int acctNumber;
   public double balance;
   private String name;

   //-----------------------------------------------------------------
   //  Sets up the account by defining its owner, account number,
   //  and initial balance.
   //-----------------------------------------------------------------
   public Account (int account)
   {
      acctNumber = account;
   }

   //-----------------------------------------------------------------
   //  Deposits the specified amount into the account. Returns the
   //  new balance.
   //-----------------------------------------------------------------
   public double deposit (double amount)
   {
      balance = balance + amount;

      return balance;
   }

   //-----------------------------------------------------------------
   //  Withdraws the specified amount from the account and applies
   //  the fee. Returns the new balance.
   //-----------------------------------------------------------------
   public double withdraw (double amount, double fee)
   {
      balance = balance - amount - fee;

      return balance;
   }

   //-----------------------------------------------------------------
   //  Adds interest to the account and returns the new balance.
   //-----------------------------------------------------------------
   public double addInterest ()
   {
      balance += (balance * RATE);
      return balance;
   }

   //-----------------------------------------------------------------
   //  Returns the current balance of the account.
   //-----------------------------------------------------------------
   public double getBalance ()
   {
      return balance;
   }

   //-----------------------------------------------------------------
   //  Returns a one-line description of the account as a string.
   //-----------------------------------------------------------------
   public String toString ()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();

      return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
   }
	
	public void debit (double amount)
	{
		withdraw(amount, 5);
	}
	
	public void createAccount(double amount)
	{
		balance = amount;
	}
	
}
