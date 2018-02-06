import java.util.Random;
import java.util.Scanner;

public class Stuff {
	
	public static void main (String[] args) {
		
		mystery(19);
		mystery(42);


		Scanner input = new Scanner(System.in);
		String answer;
		do {
			System.out.println("She sells seashells by the seashore.");
			System.out.print("Do you want to hear it again? ");
			answer = input.nextLine();
		} while (answer.equals("y"));
		
		// write a do/while loop that repeatedly prints random numbers between
		// 0 and 1000 until a number above 900 is printed.
		
		Scanner console = new Scanner(System.in);
		Random rand = new Random();
		int num;
		do {
		    num = rand.nextInt(1000);
		    System.out.println("Random number: " + num);
		} while (num < 900);
		
		/*
		 * Write a sentinel loop that repeatedly prompts the user to 
		 * enter a number and, once the number -1 is typed, displays the 
		 * maximum and minimum numbers that the user entered.
		 */
		
		int SENTINEL = -1;
		System.out.print("Type a number (or " + SENTINEL + " to stop): ");
		Scanner console1 = new Scanner(System.in);
		int input1 = console.nextInt();
		int min = input1;
		int max = input1;
		while (input1 != SENTINEL) {
		    if (input1 < min) {
		        min = input1;
		    } else if (input1 > max) {
		        max = input1;
		    }

		    System.out.print("Type a number (or " + SENTINEL + " to stop): ");
		    //input = console.nextInt();
		}

		if (min != SENTINEL) {
		    System.out.println("Maximum was " + max);
		    System.out.println("Minimum was " + min);
		}
}
	
	public static void mystery(int x) {
		int y = 0;
		//int z = 0;
		while (x % 2 == 0) {
			y++;
			x = x / 2;
		}
		System.out.println(x + " " + y);
	}
	
	public static int zeroDigits(int number) {
	    int count = 0;
	    do {
	        if (number % 10 == 0) {
	            count++;
	        }
	        number = number / 10;
	    } while (number > 0);
	    return count;
	}
}
