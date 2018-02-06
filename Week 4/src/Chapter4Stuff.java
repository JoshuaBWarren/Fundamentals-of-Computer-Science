import java.util.Scanner;

public class Chapter4Stuff {
	
	public static void main(String[] args) {
		
		/*
		ifElseMystery(3, 20);
		ifElseMystery(4, 5);
		ifElseMystery(5, 5);
		ifElseMystery(6, 10);

		ifElseMystery2(10, 2);
		ifElseMystery2(3, 8);
		ifElseMystery2(4, 4);
		ifElseMystery2(10, 30);
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type a number: ");
		int number = input.nextInt();
		
		evenOdd(number);
		
		capitalString("ok");
		capitalString("Ok");
}
	
	public static void capitalString(String testString) {
	    
	    if(Character.isUpperCase(testString.charAt(0))) {
	        System.out.print("capital");
	    } else {
	        System.out.print("not capital");
	    }
	}
	
	public static void evenOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
	*/
		
		lastFirst("Joshua Warren");
		
	}
	
	public static void countE(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.print(count);
	}
	
	public static void lastFirst(String input) {
	    int space = input.indexOf(" ");
	    String lastName = input.substring(space + 1);
	    String firstInitial = input.substring(0, 1);
	    String lastNameFirstInitial = lastName + ", " + firstInitial + ".";
	    System.out.println(lastNameFirstInitial);
	}
	
	
	
	/*
	public static void ifElseMystery(int x, int y) {	
		int z = 4;
		if (z <= x) {
			z = x + 1;
		} else {
			z = z + 9;
		}
		
		if (z <= y) {
			y++;
		}
		System.out.println(z + " " + y);
	}
	
	public static void ifElseMystery2(int a, int b) {
		if (a * 2 < b) {
			a = a * 3;
		}
		if (b < a) {
			b++;
		} else {
			a--;
		}
		System.out.println(a + " " + b);
	}
	
	public static int sumTo(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        
        sum += i;
    }
    return sum;
}
	*/
}

