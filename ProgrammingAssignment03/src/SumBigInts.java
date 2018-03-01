// This program reads an input file that contains sequences of integers to
// be added together.  The program reads them as Strings so that it can
// process large integers.  Reset the constant DIGITS to allow it to handle
// larger integers.

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
        
        int[] array1 = {1, 2, 3, 4, 3, 2, 1, 4, 5};
        int[] array2 = {9, 9, 6, 5, 4, 3, 2, 1};
        
        int[] array3 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[] array4 = {4, 3, 2, 4, 3, 2};
        
           

       // System.out.println(Arrays.toString(addInt(array3, array4)));
       // int[] test1 = addInt(array3, array4);
       // System.out.println(arrayToString(test1));


        //System.out.println(Arrays.toString(addInt(array1, array2)));

        
        //System.out.print(Arrays.toString(convertArray(array1)));
        //System.out.println(Arrays.toString(convertArray(stringToArray("12345"))));
        //System.out.println(Arrays.toString(stringToArray("123456")));
        

    } 

// more methods follow for i/o and add and .....
    
    
    public static void processFile(Scanner input) {
    	
    	int count = 0;
    	
    	int[] result = new int[MAX_DIGITS];
    	while(input.hasNextLine()) {
    		
    		String line = input.nextLine();
    		Scanner linesc = new Scanner(line);
    		
    		while(linesc.hasNext()) {
    			String currentLine = linesc.next();
    			System.out.print(currentLine);
    			System.out.print(" + ");
    			int[] currentArray = convertArray(stringToArray(currentLine));
    			result = addInt(result, currentArray);
    		}
    		
    		String answer = arrayToString(result);
    		System.out.println(" = " + answer);
    		//System.out.println(Arrays.toString(result));
    		count++;
    		result = new int[MAX_DIGITS];
    		
    	}
    	System.out.println("Total lines = " + count);
    }
    

    
    /*
     * This method adds two "big ints" together.  It uses convertArray
     * to convert the two Integer array's it's given and adds the values
     * in each column together.  
     */
    public static int[] addInt(int[] array1, int[] array2) {
    	
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
    	
    	// return the number from the array as a line.
    	return line;
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