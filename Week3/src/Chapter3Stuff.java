import java.util.Scanner;

/*
 * Practice code for Chapter 3.
 */
public class Chapter3Stuff {
	/*
	public static void main (String[] args) {
		int x = 15;
		sentence(x, 42);
		
		int y = x - 5;
		sentence(y, x + y);
	}
	
	public static void sentence(int num1, int num2) {
		System.out.println(num1 + " " + num2);
	} 
	*/
	/*
	public static void main (String[] args) {
		double x = 10.01;
		double y = 8.0;
		
		printer(x, y);
		
	}
	
	
	public static void printer(double x, double y) {
		double bubble = 867.5309;
		int z = 5;
		System.out.println("x = " + x + " and y = " + y);
		System.out.println("x = " + x + " and y = " + bubble);
		System.out.println("The value from main is: " + bubble);
		System.out.println("z = " + z);
	}
	*/
	/*
	public static void main(String[] args) {
		String soda = "coke";
		String pop = "pepsi";
		String coke = "pop";
		String pepsi = "soda";
		String say = pop;
		
		carbonated(coke, soda, pop);
		carbonated(pop, pepsi, pepsi);
		carbonated("pop", pop, "koolaid");
		carbonated(say, "say", pop);
	}
	
	public static void carbonated(String coke, String soda, String pop) {
		System.out.println("say " + soda + " not " + pop + " or " + coke);
	}
	*/
	/*
	public static void main(String[] args) {
		printStrings("Batman", 5);
	}
	
	public static void printStrings(String input, int number) {
		for(int i = 1; i <= number; i++) {
			System.out.print(input);
		}
	}

	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = 0.0;
		ftoc(tempf, tempc);
		//System.out.println("Body temp in C is: " + tempc);
	}
	
	public static void ftoc(double tempf, double tempc) {
		tempc = (tempf - 32) * 5 / 9;
		System.out.println("Body temp in C is: " + tempc);
	}
	
	// NAME GAME
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = input.nextLine();
		
		int firstSpace = name.indexOf(" ");
		String firstName = name.substring(0, firstSpace);
		String lastName = name.substring(firstSpace + 1);	
		
		singSong(firstName);
		singSong(lastName);
	}
	
	public static void singSong(String name) {
		String suffix = name.substring(1);
		System.out.println(name + " " + name + ", bo-B" + suffix);
		System.out.println("Banana-fana fo-F" + suffix);
		System.out.println("Fee-fi-mo-M" + suffix);
		System.out.println(name.toUpperCase() + "!");
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.print("Type an integer: ");
		int number = console.nextInt();
		System.out.print(number + " " + "times 2 = " + number * 2);

	}

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.print("What is your phrase? ");
		String phrase = console.nextLine();
		System.out.print("How many times should I repeat it? ");
		int number = console.nextInt();
		
		for(int i = 1; i <= number; i++) {
			System.out.println(phrase);
		}
		
		//System.out.print(phrase);
	}

	
	public static void main(String[] args) {
		
		printPowersOf2(10);
	}
	
	public static void printPowersOf2(int x) {
		
		for(int i = 0; i <= x; i++) {
			System.out.print((int)Math.pow(2, i) + " ");
		}

	}
	*/
	public static void main(String[] args) {
		
		printSquare(1, 5);
	}
	
	public static void printSquare(int min, int max) {
		
		for(int i = min; i <= max; i++) {
			int k = i;
			for(int j = min; j <= max; j++) {
				System.out.print(k);
				k = k == max ? min : k + 1;
			}
			System.out.println();
		}
	
	}
}




