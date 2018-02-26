import java.util.Arrays;

public class Stuff {
	
	public static void main(String[] args) {
		
		int[] data = {17, -3, 42, 5, 9, 28};
	
		int[] numbers = new int[8];
		numbers[1] = 4;
		numbers[4] = 99;
		numbers[7] = 2;
	
		int x = numbers[1];
		numbers[x] = 44;
		numbers[numbers[7]] = 11;
	
		int[] first = new int[2];
		first[0] = 3;
		first[1] = 7;
		int[] second = new int[2];
		second[0] = 3;
		second[1] = 7;
	
		System.out.println("first = " + Arrays.toString(first));
		System.out.println("second = " + Arrays.toString(second));
	
		if (Arrays.equals(first, second)) {
			System.out.println("They contain the same elements");
		} else {
			System.out.println("The elements are different.");
		}
		
		System.out.println(max(data));
		System.out.println(average(data));
		
		printBackwards(data);
	
	}
	
	public static int max(int[] array) {
		
		int answer = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if (array[i] > answer) {
				answer = array[i];
			}
		}
		return answer;
	}
	
	public static double average(int[] array) {
		
		int count = 1;
		double number = array[0];
		
		for(int i = 1; i < array.length; i++) {
			number = number + array[i]; 
			count++;
		}
		return number / count;
	}
	
	public static void printBackwards(int[] array) {
		
		for(int counter = array.length - 1; counter >= 0; counter--) {
			System.out.println("element [" + counter + "] is " + array[counter]);
		}
	}
	
	public static int countStrings(String[] array, String input) {
		
		int number = 0;
		for(int i = 0; i < array.length; i++) {
			if (array[i] == input) {
				number++;
			}
		}
		return number;
	}
	
	public static boolean equals(String[] array1, String[] array2) {
		if(Arrays.deepEquals(array1, array2)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean allLess(int[] array1, int[] array2) {
		if(array1.length != array2.length) {
			return false;
		}
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] >= array2[i]) {
				return false;
			}
		}
		return true;
	}
	

}
