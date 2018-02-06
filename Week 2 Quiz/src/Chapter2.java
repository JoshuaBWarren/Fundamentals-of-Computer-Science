/*Joshua Warren, CS 210 Fundamentals of Computer Science,
 * 
 * This is the main class for the quiz.  It's supposed to print past
 * 9 and into 10 "0's", and all the way to 4.  I couldn't
 * figure out how to make it not print "10" ten times.
 */

public class Chapter2 {

	public static void main (String args[]) {
		
		// First loop for the number to print.
		for(int i = 0; i <= 14; i++) {
			
			// Second loop for the number of spaces
		    for(int j = 14 - i; j > 0; j--) {
		        System.out.print(" ");
		    }
		    // Third loop that does the printing.
		    for(int j = 0; j < i; j++) {
		        System.out.print(i % 10);
		    }
		    // Skip to next line.
		    System.out.println();
		}
		System.out.println("Joshua Warren");
		
	}
}
