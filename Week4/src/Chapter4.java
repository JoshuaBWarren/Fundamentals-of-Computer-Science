/*
 * Joshua Warren, 1/30/2018, CS210, Chapter 4 Quiz
 */
public class Chapter4 {
	
	public static void main (String[] args) {
		
		//System.out.println(medianOf3(5, 10, 15));
		
		//System.out.println(repeatChar("Batman"));
		System.out.println(reverseStutter("Batman"));
		
		System.out.println(medianOf3(11, 2, 0));
		
	}
	
	/*
	 * Write a method that returns the median (middle) of three integer values.
	 */
	public static int medianOf3(int n1, int n2, int n3) {
		
		int firstNumber = 0;
		int secondNumber = 0;
		
		firstNumber = Math.max(n1, n2);
		secondNumber = Math.max(firstNumber, n3);
		
		if(firstNumber > n3) {
			return n3;
		} else {
			return n2;
		}
	}
	
	/*
	 * Write a method that accepts a String parameter and returns that String
	 * with its characters reversed and repeated.
	 */
	public static String reverseStutter(String input) {
		
		String reverseWord = "";
		int length = input.length();
		for(int i = length - 1; i >= 0; i--) {
			reverseWord = reverseWord + input.charAt(i);
		}
		
		return repeatChar(reverseWord);
	}
	
	/*
	 * This is my helper method.  It repeats a character twice
	 * in a string.
	 */
	public static String repeatChar(String input) {
		
		String newString = "";
		for (int i = 0; i < input.length(); i++) {
			newString = newString + input.charAt(i) + input.charAt(i);
		}
		return newString;
	}

}
