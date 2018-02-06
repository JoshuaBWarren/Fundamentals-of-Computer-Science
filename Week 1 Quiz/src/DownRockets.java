/*
 * Joshua Warren, CS 210 Fundamentals of Computer Science,
1/9/2018, Chapter 01 Quiz
 */

/* This is the the main class for the quiz.  It has
 * the main method that will call the three methods 
 * below it to accomplish the needs of the quiz.
 */
public class DownRockets {
	
	/*
	 * Main method: prints out the required picture
	 * for the quiz.
	 */
	public static void main(String args[]) {
		
		topBody();
		showQuotes();
		bottomBody();
		
	}
	
	/*
	 * Method One: prints by line the bottom part of the
	 * rocket as well as the top portion of the body.
	 */
	public static void topBody() {
		System.out.println(" \\    /   \\    /");
		System.out.println("  \\  /     \\  /");
		System.out.println("   \\/       \\/");
		System.out.println("+------+ +------+");
		System.out.println("|      | |      |");
		System.out.println("|      | |      |");
	}
	
	/*
	 * Method Two: prints by line the main part of the body
	 * to include the "show quotes".
	 */
	public static void showQuotes() {
		System.out.println("+------+ +------+");
		System.out.println("|\"show\"| |\"show\"|");
		System.out.println("|quotes| |quotes|");
		System.out.println("+------+ +------+");
	}
	
	/*
	 * Method Three: prints out the bottom portion
	 * of the rocket.
	 */
	public static void bottomBody() {
		System.out.println("|      | |      |");
		System.out.println("|      | |      |");
		System.out.println("+------+ +------+");
		System.out.println(" \\    /   \\    /");
		System.out.println("  \\  /     \\  /");
		System.out.println("   \\/       \\/");
	}

}
