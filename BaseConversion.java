package collection;
import java.util.InputMismatchException;
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
		int startNumber = 0;
		int baseChange = 2;
		int counter = 0;
		boolean success;
		// ASCII representation of {0,1,2,3,4,5,6,7,8,9,11,12,13,14,15,16}
		int[] hexidecimal = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
							65, 66, 67, 68, 69, 70};
		
		// Prompts user for starting base-10 number. Exception/While loop 
		// catches inputs that aren't proper integers.
		success = false;
		while (!success) {
			try {
				System.out.print("Please enter base-10 number (no decimal): ");
				startNumber = keyboard.nextInt();
				success = true;
			} catch (InputMismatchException e) {
				keyboard.nextLine();
			} catch (NumberFormatException e) {
				keyboard.nextLine();
			}
		}
		
		// Prompts user for desired new base. Exception/While loop 
		// catches inputs that aren't proper integers.
		success = false;
		while (!success) {
			try {
				System.out.print("Please enter new base (no decimal): ");
				baseChange = keyboard.nextInt();
				success = true;
				System.out.println();
			} catch (InputMismatchException e) {
				keyboard.nextLine();
			} catch (NumberFormatException e) {
				keyboard.nextLine();
			}
		}
		
		// Loop performs calculations and prints out the division,
		// the answers and the remainders.
		while(startNumber != 0) {
			System.out.printf("%5d / %d = %-5d, remainder %c \n", 
					startNumber, baseChange, startNumber / baseChange, 
					(char)hexidecimal[startNumber % baseChange]);
			
			number.add(hexidecimal[startNumber % baseChange]);
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
			System.out.print((char)number.get(i).intValue());
		}
	}
//-----------------------------------------------------------------------------
}
//=============================================================================
