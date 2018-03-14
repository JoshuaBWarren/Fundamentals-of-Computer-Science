
public class Client {
	
	public static void main(String[] args) {
		
		
		Date one = new Date(1582,10,15);	// start of Gregorian
		Date two = new Date(2016,1,28); // 2016 was a leap year
		
		one.addDays(1);		// advance one day (negative subtracts days)
		one.addWeeks(10);	// advance one week (negative allowed, yes)
		System.out.println(two.daysTo(one)); // -158184 days (negative)
		System.out.println(one.getDay());	// day is now the 25th
		System.out.println(one.getMonth());	// returns 12, January is 1
		System.out.println(one.getYear());	// still 1582 from start
		System.out.println(one.isLeapYear());	// false for 1582
		System.out.println(one.toString());	// style is 1582/12/25
		
		try {
			Date three = new Date(12,34,1956); // obviously illegal
			Date four = new Date(2013,2,29); // illegal leap year
			three.setDay(31);		// fixes that day of month, OK
			four.setMonth(3);		// fixes the month, year still wrong
			four.setYear(1929);		// fixes the year, code not reached
		} catch (IllegalArgumentException e) {
			System.out.println("Illegal day attempted");
		}
		
		// Use UNIX zero of 01/01/70 for default, and create "longDate" output
		// I thought a long date was dinner with a person you don't like?
		Date five = new Date();
		System.out.println(five.longDate());  // January 1, 1970
		
		// Finally, let's understand what static methods are most commonly used for:
		System.out.println(Date.daysTo(one, two));	// still 158184 days (positive)
	}

}
