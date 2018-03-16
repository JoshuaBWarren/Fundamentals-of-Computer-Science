/*
 * Programming Assignment 4
 * Joshua Warren
 * CS-210
 * 3/13/2018
 */
public class Date {
	
	private int year;
	private int month;
	private int day;
	
	/*
	 * Constructs a Date with the initilized values being:
	 * 
	 * year = 1970
	 * month = January
	 * day = 1
	 */
	public Date() {
		this.year = 1970;
		this.month = 1;
		this.day = 1;
	}
	
	/*
	 * Constructs a date with an int year, int month
	 * and an int day.
	 */
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		verifyDate();
	}

	/*
	 * Accessor methods.s
	 */
	
	/*
	 * Getter method for field year.
	 */
	public int getYear() {
		return year;
	}

	/*
	 * Getter method for field month.
	 */
	public int getMonth() {
		return month;
	}

	/*
	 * Getter method for field day.
	 */
	public int getDay() {
		return day;
	}

	/*
	 * Mutator methods.
	 */
	
	/*
	 * Setter method for field year.
	 */
	public void setYear(int year) {
		this.year = year;
		verifyDate();
	}
	
	/*
	 * Setter method for field month.
	 */
	public void setMonth(int month) {
		this.month = month;
		verifyDate();
	}
	
	/*
	 * Setter method for field day.
	 */
	public void setDay(int day) {
		this.day = day;
		verifyDate();
	}
	
	/*
	 * Moves this Date object forward in time
	 * by the given number of days.
	 */
	public void addDays(int days) {
		
		/*
		 * Can't figure out how to account for the gap between days
		 * so create int array with all the days added by the next
		 * month, in days.
		 */
		int[] daysPlusMonths = {0, 31, 59, 90, 120, 151, 181,
				212, 243, 273, 304, 334};
		
		/*
		 * get the total amount of days, then add our input days.
		 */
		int daysTotal = daysPlusMonths[this.month - 1] + this.day + days;
		
		/*
		 * Check for leap year and then subtract the total year, in days.
		 */
		while(daysTotal > 365) {
			if(this.isLeapYear()) {
				daysTotal = daysTotal - 366;
			} else {
				daysTotal = daysTotal - 365;
			}
			this.year++;
		}
		
		/*
		 * If we have a leap  year, then we need to change the days value
		 * within the int array to reflect the correct amount of days:
		 * 
		 * Non-leap year February = 59
		 * Leap year February = 60
		 * 
		 * add 1 to the days in February if it's a leap year
		 */
		if(this.isLeapYear()) {
			for(int i = 2; i < daysPlusMonths.length; i++) {
				daysPlusMonths[i]++;
			}
		}
		
		/*
		 * Compute how many days we'd have to subtract to get
		 * to the very beginning of the year.
		 */
		int gap = (daysTotal - daysPlusMonths[0]);
		System.out.println("--- gap --- " + gap);
		System.out.println("--- daysTotal --- " + daysTotal);
		
		/*
		 * reset month to 1
		 */
		this.month = 1;
		
		/*
		 * go through our array to find out which month we're now in.
		 */
		for(int i = 1; i < daysPlusMonths.length; i++) {
			int temp = Math.abs(daysTotal - daysPlusMonths[i]);
			System.out.println("--- temp --- " + temp);
			if(temp < gap) {
				gap = temp;
				this.month = i;
				System.out.println("--- month --- " + month);
			} else {
				
			}
		}
		
		/*
		 * Same as above, but for days.
		 */
		this.day = Math.abs(daysTotal - daysPlusMonths[this.month - 1]);
		
		/*
		 * Find out which day we're in and set it accordingly 
		 * based on how much we added or subtracted.
		 */
		int currentDay = daysPlusMonths[this.month] - daysPlusMonths[this.month - 1];
		if(this.day > currentDay) {
			this.month++;
			this.day = this.day - currentDay;
		} 

	}
	
	/*
	 * Moves this Date object forward in time by 
	 * the given number of 7-day weeks.
	 */
	public void addWeeks(int weeks) {
		
		/*
		 * convert integer weeks into days by multiplying it by 
		 * 7, and then calling the addDays method to add it.
		 */
		addDays(weeks * 7);
	}
	
	/*
	 * Returns the number of days that this Date must be 
	 * adjusted to make it equal to the given other Date.
	 */
	public int daysTo(Date other) {
		
		/*
		 * An array of all the days added, in succession, with the next one
		 * after it.
		 */
		int[] daysPlusMonths = {0, 31, 59, 90, 120, 151, 181,
				212, 243, 273, 304, 334};
		/*
		 * check to see if the date we're given is the same exact
		 * date that we need to adjust too.
		 */
		if(this.equals(other)) {
			return 0;
		}
		
		/*
		 * Counters to keep track:
		 */
		int daysTotal = 0;
		int current = 0;
		int leapCounter = 0;
		
		/*
		 * Check if given year is bigger than current, then loop through
		 * the years and add to leapCounter the extra days for each year
		 * that is a leap year.
		 * 
		 * Then, add up all the days.
		 */
		if(other.getYear() > this.getYear()) {
			
			/*
			 * Create new Dates and test if they're leap years. 
			 * 
			 * Add one to leapCounter if it's a leap year. 
			 */
			for(int i = this.getYear(); i <= other.getYear(); i++) {
				Date tempDate = new Date(i, 1, 1);
				if(tempDate.isLeapYear()) {
					leapCounter = leapCounter + 1;
				}
			}
			//System.out.println(current);
			current = (daysPlusMonths[this.getMonth() - 1] + this.getDay()) -
					(daysPlusMonths[other.getMonth() - 1] + other.getDay());
			//System.out.println(current);
		} else {
			
			/*
			 * If the given year is not bigger than the year we have, then
			 * create new Dates
			 */
			for (int i = other.getYear(); i <= this.getYear(); i++) {
				Date tempDate = new Date(i, 1, 1);
				if (tempDate.isLeapYear()) {
					leapCounter = leapCounter + 1;
				}
			}
			current = (daysPlusMonths[other.getMonth() - 1] + other.getDay()) - 
					(daysPlusMonths[this.getMonth() - 1] + this.getDay());
			//System.out.println(current);
		}

		/*
		 * If the year we're given is bigger, then add up the daysTotal
		 * value, and subtract daysTotal from the current.
		 */
		if(other.getYear() > this.getYear()) {
			
			daysTotal = 365 * (other.getYear() - this.getYear()) + leapCounter;

			
			return daysTotal - current - 1;
			
			/*
			 * If the year we're given isn't bigger, then add up the daysTotal
			 * value, and subtract current from daysTotal.
			 */
		} else {

			daysTotal = 365 * (this.getYear() - other.getYear()) + leapCounter;	
			return current - daysTotal + 1;
		}
	}

	/*
	 * Static version of daysTo.
	 * 
	 * Does the same thing but gives us a variable at which 
	 * to start.
	 */
	public static int daysTo(Date input1, Date input2) {
		return input1.daysTo(input2);
	}
	
	
	/*
	 * Returns true if the year of this date is a 
	 * leap year.
	 */
	public boolean isLeapYear() {
		return ((year %4 == 0) && (year % 100 !=0) || (year % 400 == 0));
	}

	/*
	 * Returns a String representation of this date in 
	 * year/month/day order.
	 */
	public String toString() {
		return "" + year + "/" + month + "/" + day;
	}
	
	/*
	 * Returns the long date string format of the given Date.
	 */
	public String longDate() {
		return stringInMonth(month) + " " + day + ", " + year;
	}
	
	
	/*
	 * Helper method that takes the int month and converts 
	 * 
	 * Example: 1 = "January" and 10 = "October".
	 */
	public String stringInMonth(int month) {
		
		String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "Octoboer", "November", "December"};
		String monthToPrint = "";
		
		/*
		 * Go through the months and check to see which index of the month
		 * matches the one we're given.
		 */
		for(int i = 1; i <= months.length; i++) {
			if (month == i) {	
				monthToPrint = months[i - 1];
			}
		}
		return monthToPrint;
	}
	
	/*
	 * Helper method that will check the date to ensure it's in the right
	 * format.
	 */
	public void verifyDate() {
		/*
		 * Year is only between 1000 and 9999.
		 */
		if(year <= 999 || year >= 10000) {
			throw new IllegalArgumentException("Year can't be three or five digits");
		}
		
		if(month <= 0 || month >= 13) {
			throw new IllegalArgumentException("Month has to be between 1 \"January \" and 12 \"December \"");
		}
		
		if(day <= 0 || day >= 32) {
			throw new IllegalArgumentException("Day has to be between 1 and 31");
		}
	}
	
}
