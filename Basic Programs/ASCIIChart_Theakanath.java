//Sony Theakanath
//ASCII Print Assn

/** This awesome code prints the ASCII chart from
    32-127 left aligned awesomely.
*/

//tester class
public class ASCIIChart_Theakanath
{
	public static void main(String[]args)
	{
		ASCII tester = new ASCII();
		tester.printChart();
	}
}

// Printing

class ASCII
{
	public void printChart()
	{
		int beginning = 32;
		int row = 0;
		while (beginning < 128)
		{
			if (row == 5)
			{
				System.out.print("\n");
				row = 0;
			}
			if (beginning < 100)
			{
				System.out.print(" " + beginning + " " + (char)beginning + "\t");
				row++;
				beginning++;
			} else {
				System.out.print(beginning + " " + (char)beginning + "\t");
				row++;
				beginning++;
			}

		}
	}
}