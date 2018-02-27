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
        
        int[] array3 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[] array4 = {4, 3, 2, 4, 3, 2};
        
           
        System.out.print(Arrays.toString(addInt(array3, array4)));

        
        //System.out.print(Arrays.toString(convertArray(array1)));
        
    } 

// more methods follow for i/o and add and .....
    
    public static int[] convertArray(int[] inputArray) {
    	
    	int numZero = MAX_DIGITS - inputArray.length;
    	int[] newArray = new int[MAX_DIGITS];
    	
    	for(int i = inputArray.length - 1; i >= 0; i--) {
    		newArray[i + numZero] = inputArray[i];
    	}
    	return newArray;
    }
    
    
    public static int[] addInt(int[] array1, int[] array2) {
    	
    	int colValue = 0;
    	int carryVal = 0;
    	
    	array1 = convertArray(array1);
    	array2 = convertArray(array2);
    	
    	int[] result = new int[MAX_DIGITS];
    	
    	for(int i = result.length - 1; i >= 0; i--) {
    		colValue = array1[i] + array2[i] + carryVal;
    		if(colValue >= 10) {
    			carryVal = colValue / 10;
    			result[i] = colValue % 10;
    			} else {
    				result[i] = colValue;
    				carryVal = 0;
    				}	
    	}
    	
    	result[0] = carryVal;
    	return result;  
    }
    

}