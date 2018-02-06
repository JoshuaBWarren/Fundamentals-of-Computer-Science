//This is the class for CS210 Quiz One
//Created by: Joshua Warren
//Date: 1/5/2018

//This class will produce an image as required 
//for the quiz.  The image has three rows of
//characters with the added requirement of putting
//my name within the second row.
public class GettingStarted {
		
	//This static method will print out the first row
	public static void firstRow() {
		System.out.println("  //////////////////");
	}
	
	//This static method will print out the second row
	public static void secondRow() {
		System.out.println("<|| Joshua Warren ||>");
	}
	
	//This static method will print out the third row
	public static void thirdRow() {
		System.out.println("  \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
	}
	
	public static void main (String args[]) {
		firstRow();
		secondRow();
		thirdRow();
	}

}

