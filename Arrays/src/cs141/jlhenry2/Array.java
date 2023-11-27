/**
 * 
 */
package cs141.jlhenry2;
import java.util.*;
/**
 * @author jlhenry2
 *
 */
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] owner = {"Alice", "Bob", "Carol"};
		
		Scanner scnr = new Scanner(System.in);
		
		String person; 
		
		System.out.println("Who are you looking for?");
		
		person = scnr.nextLine();
		
		boolean found = false;
		
		for (int index = 0; index < owner.length; index++) {
			//System.out.println(owner [index]);
			if (person.equals(owner[index])) {
				found = true;
			}
		}
		
		if (found == true) {
			System.out.println(person + " is on the list");
		}
		else {
			System.out.println(person + " is not on the list");
		}
		

	}

}

