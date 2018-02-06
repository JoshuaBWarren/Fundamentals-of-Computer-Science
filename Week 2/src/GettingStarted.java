
public class GettingStarted {
	
	public static final int MAX = 5;
	/* public static final int MAX_ODD = 21;
	
	public static void writeOdds() {
		int count;
		
		for(count = 1; count <= (MAX_ODD - 2); count ++) {
			System.out.print(count + " ");
			count = count + 1;
		}
		System.out.println(count);
	}
	
	public static void writeOdd() {
		int count;
		for (count = 1; count <= (MAX_ODD - 12); count ++) {
			System.out.print(count + " ");
			count = count + 1;
		}
		System.out.println(count);
	}
	*/
	
	/* public static void unknown() {
		int number = 0;
		for (int count = MAX; count >= 1; count--) {
			number += (count * count);
		}
		System.out.println("The result is: " + number);
	}
	*/
	public static void main (String args[]) {

		/* int first = 8, second = 19;
		first += second;
		second = first - second;
		first -= second;
		
		int i = 2, j = 3, k = 4, x = i + j + k;
		i = x - i - j;
		j = x - j - k;
		k = x - i - k; 
		
		int max;
		int min = 10;
		max = 17 - 4 / 10;
		max = max + 6;
		min = max - min; */
		
		/* for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 3; j++) {
				for (int k = 1; k <= 4; k++) {
					System.out.print("*");
					System.out.print("!");
				}
			}
			System.out.println();
		}
		*/
		
		/* writeOdds();
		writeOdd();
		*/
		//unknown();
		
		for(int i = 1; i <= 5; i++) {
		    for(int j = 0; j < i; j++)
		        System.out.print("*");
		    System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
	}
}
