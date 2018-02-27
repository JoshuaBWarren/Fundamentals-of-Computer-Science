// This program reads an input file that contains sequences of integers to
// be added together.  The program reads them as Strings so that it can
// process large integers.  Reset the constant DIGITS to allow it to handle
// larger integers.

import java.io.*;
import java.util.*;

public class SumBigInts {
    public static final int MAX_DIGITS = 25;

    
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
    	
        //Scanner input = new Scanner(new File("sum.txt"));
        //processFile(input);
        
        int[] array1 = {1, 2, 3, 4, 3, 2, 1, 4, 5};
        int[] array2 = {9, 9, 6, 5, 4, 3, 2, 1};
        

        
        int[] arrayTest = new int[MAX_DIGITS];
        int[] arrayTest1 = new int[MAX_DIGITS];
           
        System.out.println(Arrays.toString(addInt(array1, array2)));

        
        //System.out.print(Arrays.toString(convertArray(array1)));
        System.out.println(Arrays.toString(convertArray(stringToArray("12345"))));
        
        
        
    } 

// more methods follow for i/o and add and .....
    
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
    	
    	// inititalize our return array.
    	int[] newArray = new int[MAX_DIGITS];
    	
    	// Fill in the array from the right, starting with the last number.
    	for(int i = inputArray.length - 1; i >= 0; i--) {
    		newArray[i + numZero] = inputArray[i];
    	}
    	
    	// Give me my array!
    	return newArray;
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
    
    public static int[] stringToArray(String s) {
    	String[] numberString = s.split(" ");
    	
    	int[] result = new int[numberString.length];
    	for(int i = 0; i < numberString.length; i++) {
    		String tempNumber = numberString[i];
    		result[i] = Integer.parseInt(tempNumber);
    	}
    	
    	return result;
    	
    }
    
    public static void processFile(Scanner input) {
    	
    	while(input.hasNextLine()) {
    		
    	}
    	String line = input.nextLine();
    	
    }

}