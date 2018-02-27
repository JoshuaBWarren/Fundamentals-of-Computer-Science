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
        
        int[] array1 = {1, 2, 3, 4, 3, 2, 1, 4, 3, 2};
        int[] array2 = {9, 9, 6, 5, 4, 3, 2, 1, 3, 2};
        
        int[] array3 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[] array4 = {4, 3, 2, 4, 3, 2};
        
        int[] arrayTest = new int[MAX_DIGITS];
        int[] arrayTest1 = new int[MAX_DIGITS];
        
        for(int i = 0; i < arrayTest.length; i++) {
        	arrayTest[i] = addInt(array1, array2)[i];
        }
        
        for(int i = 0; i < arrayTest.length; i++) {
        	System.out.print(arrayTest[i] + " ");
        }
        
        /*
        for(int i = 0; i < arrayTest1.length; i++) {
        	arrayTest1[i] = addInt(array3, array4)[i];
        }
        
        for(int i = 0; i < arrayTest1.length; i++) {
        	System.out.print(arrayTest1[i] + " ");
        }
        */
        
    } 

// more methods follow for i/o and add and .....
    
    
    public static int[] addInt(int[] array1, int[] array2) {
    	
    	int colValue = 0;
    	int rangeVal = 0;
    	int arrayMod = 0;
    	
    	int[] result = new int[MAX_DIGITS];
    	
    	if(array1.length == array2.length) {
    		arrayMod = result.length - array1.length + 1; // = 17?
    	} else {
    		//arrayMod = (array1.length + array2.length) - result.length;
    	}
    	
    	for(int i = result.length - 16; i >= 0; i--) {
    		colValue = array1[i] + array2[i] + rangeVal;    		
    		if(colValue >= 10) {
    			rangeVal = colValue / 10;
    			result[i + 1] = colValue % 10;
    			
    			} else {
    				result[i + 1] = colValue;
    				rangeVal = 0;
    			}
    		}
    	result[0] = rangeVal;
    	return result;
    }
    

}