/*
 * Project Assignment Three.
 * Joshua Warren
 * 3/1/2018
 * CS 210
 */

import java.io.*;
import java.util.*;

public class SumBigInts {
    public static final int MAX_DIGITS = 26;
    
    /*
     * For this assignment:
     * 
     * 1:  Create a method that will add two arrays of numbers.
     * 
     * 2:  Create a method to read a file full of numbers that uses the
     * add method to add them together.  
     * 
     * 3:  Convert it all into a string to produce a new file with
     * the new data.
     */

    public static void main(String[] args) throws FileNotFoundException {
    	
        Scanner input = new Scanner(new File("src/sum.txt"));
        processFile(input);
    } 

// more methods follow for i/o and add and .....
    
    /*
     * This is the main method for the assignment.
     * 
     * This method will receive a file with lines of string integers.
     * Then, it will convert each number into a number array.  It will
     * will then move the numbers to the right of the array and fill in
     * the empty spots with zero's.  When it's at the end of the line, it
     * will sum the entire line and print the total at the end.  
     * 
     * After, it will print the total amount of lines that were processed.
     */
    public static void processFile(Scanner input) {
    	
    	// set initial values
    	int count = 0;
    	String answer = "";
    	int[] zero = new int[MAX_DIGITS];
    	int[] result = new int[MAX_DIGITS];
    	
    	/*
    	 * grab our scanner input and start the while loop
    	 */
    	while(input.hasNextLine()) {
    		
    		// set the first line into a string
    		String line = input.nextLine();
    		
    		// create another scanner to read that line
    		Scanner linesc = new Scanner(line);
    		
    		 // loop through the line
    		while(linesc.hasNext()) {
    			
    			// set the first pattern into currentLine
    			String currentLine = linesc.next();
    			
    			// print it out
    			System.out.print(currentLine);
    			
    			//Check if there's a space between numbers
    			if(!linesc.hasNext()) {
    				//if not, put equals.
    				System.out.print(" = ");
    			} else {
    				//if so, put a plus.
    				System.out.print(" + ");
    			}
    			
    			/*
    			 * currentArray is the result of grabbing currentLine and converting
    			 * that string into a special array that will fill up the remaining
    			 * empty slots within our max array with zero's.
    			 */
    			int[] currentArray = convertArray(stringToArray(currentLine));
    			
    			// add the two integer arrays.
    			result = addArrays(result, currentArray);
    			
    			// if our result isn't full of zeros and thus has something.
    			if(result != zero) {
    				
    				// convert our special array back into a string.
    				answer = arrayToString(result);
    			} else {
    				
    				// else, set the answer to "0" as we have nothing.
    				answer = "0";
    				}
    			}

    		// print out the final answer of the summation.
    		System.out.println(answer);
    		
    		// add one to the count we're keeping of the total lines.
    		count++;
    		
    		// reset result into an array full of zero's.
    		result = new int[MAX_DIGITS];
    	}
    	// print space between the math and the total.
    	System.out.println();
    	
    	// print out the total amount of lines.
    	System.out.println("Total lines = " + count);
    }
    
    /*
     * This method adds two "big ints" together.  It uses convertArray
     * to convert the two Integer array's it's given and adds the values
     * in each column together.  
     */
    public static int[] addArrays(int[] array1, int[] array2) {
    	
    	// set the initial column value and carry over value.
    	int colValue = 0;
    	int carryVal = 0;
    	
    	// use helper method to convert the two input arrays.
    	array1 = convertArray(array1);
    	array2 = convertArray(array2);
    	
    	// initilize the return array.
    	int[] result = new int[MAX_DIGITS];
    	
    	
    	// Starting from the right side, add up the values in each column.
    	for(int i = result.length - 1; i >= 0; i--) {
    		
    		// add the two values.
    		colValue = array1[i] + array2[i] + carryVal;
    		
    		// if, the value is 10 or greater (two "digits"), move the carry value
    		// over to the left.
    		if(colValue >= 10) {
    			carryVal = colValue / 10;
    			result[i] = colValue % 10;
    			// otherwise, set the result array value.
    			} else {
    				result[i] = colValue;
    				carryVal = 0;
    				}	
    	}
    	
    	// reset the carryVal to zero.
    	result[0] = carryVal;
    	
    	// Give me my array!
    	return result;  
    }
    
    /*
     * This helper method will take in the strings of numbers and
     * convert them into a simple integer array of varying lengths.
     */
    public static int[] stringToArray(String s) {
    	
    	// initialize the return array.
    	int[] result = new int[s.length()];
    	
    	// Loop through the string and convert it.
    	for(int i = 0; i < result.length; i++) {
    		result[i] = Character.getNumericValue(s.charAt(i));
    	}
    	
    	// Give me my array!
    	return result;
    }
    
    /*
     * This helper method is going to trim off the proceeding
     * zero's in the number of the array and gives back
     * a string.
     */
    public static String arrayToString(int[] array) {
    	
    	// set the string value.
    	String line = "";
    	
    	// set the counter value.
    	int counter = 0;
    	
    	// loop through the array to find the zero's.
    	for(int i : array) {  		
    		if(i != 0) {
    			break;
    		}
    		counter++;
    	}
    	
    	/*
    	 * create the new array where the old length is 
    	 * replaced with the new length, without the zeros.
    	 */
    	int[] newArray = new int[array.length - counter];
    	
    	// fill in the new array with the length we need.
    	for(int i = 0; i < newArray.length; i++) {
    		newArray[i] = array[i + counter];
    	}
    	
    	// create the string using the values of the old array.
    	for(int i = 0; i < newArray.length; i++) {
    		line = line + newArray[i];
    	}

    	// if counter is 26, then we have an empty array.
    	if(counter == 26) {
    		
    		// set line to "0"
    		return line + "0";
    	} else {
    		
    		// else, return the string.
    		return line;
    	}
    }
    
    /*
     * This method is the helper method that will convert
     * every Integer array its given into an array that
     * contains the same values but all the way on the right 
     * side of it.  
     * 
     * It also places zero's in every space not occupied by 
     * an Integer.
     */
    public static int[] convertArray(int[] inputArray) {
    	
    	// get the difference between MAX_DIGITS and inputArray.
    	int numZero = MAX_DIGITS - inputArray.length;
    	
    	// initialize our return array.
    	int[] newArray = new int[MAX_DIGITS];
    	
    	// Fill in the array from the right, starting with the last number.
    	for(int i = inputArray.length - 1; i >= 0; i--) {
    		newArray[i + numZero] = inputArray[i];
    	}
    	
    	// Give me my array!
    	return newArray;
    }
    

}