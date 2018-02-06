/*
 * Joshua Warren, CS 210 Fundamentals of Computer Science,
1/23/2018, Chapter 03 Quiz
 */

/*
 * This is the main class for the quiz.  It has two methods that
 * fulfill the requirements of the quiz.
 */
public class Chapter3 {

	/*
	 * Main method.  Has the two tests needed
	 * to show the method results.
	 */
	public static void main (String args[]) {

        System.out.println(pentagonArea(3.14)); 
        // 16.963218978846978... return a real number, area of a pentagon

        System.out.println(addSpaces("aBcD")); 
        // the String "a B c D" is returned, one space between each char
    }
	
	/*
	 * This method is the formula for the area of a pentagon.  It
	 * takes in a single input in the form of a double and computes
	 * the area of a Pentagon.
	 */
	public static double pentagonArea(double number) {
		double side = (5 * Math.pow(number, 2)) / (4 * Math.tan(Math.PI / 5));
		return side;
	}
	
	/*
	 * This is the method that will add a whitespace in between characters.
	 * I thought about using a loop with input.length, but I don't like
	 * cluttery code.
	 */
	public static String addSpaces(String input) {
		return input.replace("",  " ").trim();
	}
}
