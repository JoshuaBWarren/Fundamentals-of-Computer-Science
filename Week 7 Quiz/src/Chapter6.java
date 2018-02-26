import java.io.*;
import java.util.*;

/*
 * Joshua Warren, CS210, Chapter 6 Quiz, 2/20/2018
 */

public class Chapter6 {
	
	/*
	 * Given static main method.
	 */
    public static void main(String[] args) throws FileNotFoundException {
    	
        File file = new File("src/whatever.txt"); // any file will work
        
        Scanner input = new Scanner(file);
        
        System.out.println(oneLiner(input));
    }
    
    /*
     * Quiz: create a static method that takes a file of text and reduces
     * it all to a single line of text with only a single space
     * between them.
     */
    public static String oneLiner(Scanner parameter) {
    	
    	// Grab the first token.
    	String text = parameter.next();
    	
    	/*
    	 * While loop with the boolean .hasNext() that will
    	 * keep on looping until we get to the end of
    	 * the file we're looking at.
    	 */
    	while(parameter.hasNext()) {
    		text = text + " " + parameter.next();
    	}
    	
    	return text;
    	
    }
    
    
}
