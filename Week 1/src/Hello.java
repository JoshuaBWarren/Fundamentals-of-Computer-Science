// Joshua Warren
// January 2nd, 2018
// first setup
// Intro to Computer Science
public class Hello {
	
	public static void first() {
		System.out.println("Inside first method");
	}
	
	public static void second() {
		System.out.println("Inside second method");
		first();
	}
	
	public static void third() {
		System.out.println("Inside third method");
		first();
		second();
	}
	
	//Sally exercise
	public static void Sally() {
		System.out.println("\"Several slashes are sometimes seen,\"");
		System.out.println("said Sally. \"I've said so.\" See?");
		System.out.println("\\ / \\\\ // \\\\\\ ///");
	}
	
	public static void TestOfKnowledge() {
		System.out.println("This is a test of your");
		System.out.println("knowledge of \"quotes\" used");
		System.out.println("in \'string literals.\'");
		System.out.println();
		System.out.println("You're bound to \"get it right\"");
		System.out.println("if you read the section on");
		System.out.println("\'\'quotes.\'\'");
	}
	
	public static void main(String[] args) {
		// My first JDK 8 with Oxygen
		System.out.print("To be ");
	}
}
