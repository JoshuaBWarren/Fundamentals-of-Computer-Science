/*
 * Joshua Warren
 * CS210
 * 2/27/2018
 * Chapter 7 Quiz
 */

public class Chapter7 {
	
	public static void main(String[] args) {
		
	    int[] array = {12, 7, -1, 25, 3, 9};
	    int[] list1 = {16, 12, 22, 14};
	    int[] list2 = {46, 25, 19, 7, 4, 1};
	    
	    int score = 0;
	    
	    // Part A.
	    if (max(array)==25) score+=5;
	    
	    // Part B.
	    if (!isDescending(list1)) score+=5;
	    
	    if (isDescending(list2)) score+=5;
	    
	    System.out.println(score); // 15 points is a good start
	 }
	
	/*
	 * A: Write a method named max that accepts an array of integers 
	 * as a parameter and returns the maximum value in the array.
	 */
	public static int max(int[] array) {
		
		// set the return value to 0.
		int answer = array[0];
		
		// go through the array.
		for(int i = 1; i < array.length; i++) {
			
			// if array[i] is greater than the answer.
			if(array[i] > answer) {
				
				// replace answer with array[i].
				answer = array[i];
			}
		}
		
		// return the max number.
		return answer;
	}
	
	/*
	 * B: Write a static method named  isDescending  that accepts 
	 * an array int[] as a parameter and returns true if the list is 
	 * in decreasing order and false otherwise.
	 */
	public static boolean isDescending(int[] array) {
		
		// go through the array
		for(int i = 0; i < array.length-1; i++) {
			
			/*
			 * if the number, array[i] isn't bigger than the 
			 * value next to it.
			 */
			if(array[i] < array [i + 1]) {
				
				// return false: it's not in descending order.
				return false;
			}
		}
		/*
		 * returns true if the "if-statement" never procs: given
		 * array is in descending order.
		 */
		return true;
	}

}
