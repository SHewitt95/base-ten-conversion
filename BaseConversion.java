package collection;
import java.util.Scanner;
import java.util.ArrayList;
//=============================================================================
public class BaseConversion {
//-----------------------------------------------------------------------------
	private static Scanner keyboard = new Scanner(System.in);
	private static ArrayList<Integer> number = new ArrayList<Integer>();
//-----------------------------------------------------------------------------
	/**
	 * @author Sherman Hewitt
	 * @param args
	 */
	public static void main(String[] args) {
		int startNumber;
		int baseChange;
		int counter = 0;
		
		// Prompts user for starting base-10 number.
		System.out.print("Please enter base-10 number: ");
		startNumber = keyboard.nextInt();
		
		// Prompts user for desired new base.
		System.out.print("Please enter new base: ");
		baseChange = keyboard.nextInt();
		System.out.println();
		
		// Loop performs calculations and prints out the division,
		// the answers and the remainders.
		while((startNumber != 0)) {
			System.out.printf("%5d / %d = %-5d, remainder %d \n", 
					startNumber, baseChange, startNumber / baseChange, 
					startNumber % baseChange);
			number.add(startNumber % baseChange);
			startNumber = startNumber / baseChange;
			
			if (startNumber != 0) {
				counter++;
			}
		}
		
		// Loops through ArrayList from end to beginning and prints
		// the base-converted number.
		System.out.println();
		System.out.print("Your new number is ");
		for (int i = counter; i >= 0; i--) {
			System.out.print(number.get(i));
		}
	}
//-----------------------------------------------------------------------------
}
//=============================================================================
