import java.util.Random;

/*
 * Joshua Warren, 2/6/2018, CS210, Chapter 5 Quiz
 */

public class Chapter5 {
	
	public static void main (String[] args) {
		

		System.out.println(isPerfectNumber(6));
		System.out.println(isPerfectNumber(28));
		System.out.println(isPerfectNumber(1));
		System.out.println(isPerfectNumber(10));
		
		System.out.println(random4DigitNum());
		System.out.println(random4DigitNumber());
		
	}
	
	/*
	 * Write a boolean method that accepts a single positive
	 * integer parameter and returns a boolean.
	 */
	public static boolean isPerfectNumber(int input) {
		
		int number = 0;
		for(int i = 1; i < input; i++) {
			if (input % i == 0) {
				number = number + i;
			}
		}
		if (number == input) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/*
	 * I wasn't sure if we were to use the Random class or
	 * create a method using Math.random().  
	 * 
	 * I assumed it was the Random class as it was taught in 
	 * Chapter 5 but I didn't want to take the risk of losing
	 * points on an assumption.
	 * 
	 * And, since the wonderful world of coding allows for
	 * solving one problem in many different ways, I created
	 * two methods that satisfy the required question on the quiz.
	 */
	
	/*
	 * Write a method that returns an int of exactly 4 digits.
	 */
	public static int random4DigitNum() {

		return (new Random().nextInt(9000) + 1000);
	}
	
	public static int random4DigitNumber() {
		
		int n = (int)Math.floor(1000 + Math.random() * 9000);
		return n;
	}

}
