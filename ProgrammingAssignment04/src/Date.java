/*
 * Programming Assignment 4
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
		if (day <= 0 || day > 31) {
			String s = "Day cannot be less than or equal to 0 or greater than 31.";
            throw new IllegalArgumentException(s);
        } else if(month <= 0 || month > 12) {
        	String s = "Month cannot be less than or equal to 0 or greater than 12.";
        	throw new IllegalArgumentException(s);
        }
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/*
	 * Getter method for field year.
	 */
	public int getYear() {
		return year;
	}

	/*
	 * Setter method for field year.
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/*
	 * Getter method for field month.
	 */
	public int getMonth() {
		return month;
	}

	/*
	 * Setter method for field month.
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/*
	 * Getter method for field day.
	 */
	public int getDay() {
		return day;
	}

	/*
	 * Setter method for field day.
	 */
	public void setDay(int day) {
		this.day = day;
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
		 * Convert our daysTotal into the date format given by 
		 * the constructor.
		 */
		int gap = (daysTotal - daysPlusMonths[0]);
		
		/*
		 * reset month to 1
		 */
		this.month = 1;
		
		/*
		 * go through our array to find out which month we're now in.
		 */
		for(int i = 1; i < daysPlusMonths.length; i++) {
			int temp = Math.abs(daysTotal - daysPlusMonths[i]);
			if(temp < gap) {
				gap = temp;
				this.month = i;
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
	 * Returns the number of days that this Date must be ****************************
	 * adjusted to make it equal to the given other Date.
	 */
	public int daysTo(Date other) {
		
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
		int current = 0;
		int leapCounter = 0;
		
		/*
		 * Check if given year is bigger than current, then loop through
		 * the years and add to leapCounter the extra days for each year
		 * that is a leap year.
		 * 
		 * Then, add up all the days.
		 */
		if(other.getYear() > this.year) {
			for(int i = this.year; i <= other.getYear(); i++) {
				Date temp = new Date(i, 1, 1);
				if(temp.isLeapYear()) {
					leapCounter = leapCounter + 1;
				}
			}
			current = (daysPlusMonths[this.month - 1] + this.day) -
					(daysPlusMonths[other.getMonth() - 1] + other.getDay());
		} else {
			for (int i = other.getYear(); i <= this.year; i++) {
				Date temp = new Date(i, 1, 1);
				if (temp.isLeapYear()) {
					leapCounter = leapCounter + 1;
				}
			}
			current = (daysPlusMonths[other.getMonth() - 1] + other.getDay()) - 
					(daysPlusMonths[this.month - 1] + this.day);
		}
		
		int daysTotal = 365 * (other.getYear() - this.year) + leapCounter;
		
		return daysTotal - current + 1;
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
		return "" + stringInMonth(month) + " " + day + ", " + year;
	}
	
	/*
	 * Helper method that gets the total days in a month.
	 */
	public int daysInMonth(int month) {
		
		if((month == 1) || (month == 3) || (month == 5) || 
				(month == 7) || (month == 8) || (month == 10) || (month == 12)) {
			return 31;
		} else if((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
			return 30;
		} else {
			return 28;
		}
		
	}
	
	/*
	 * Helper method that takes the int month and converts 
	 * 
	 * Example: 1 = "January" and 10 = "October".
	 */
	public String stringInMonth(int month) {
		
		String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "Octoboer", "November", "December"};
		String monthToPrint = "";
		
		for(int i = 1; i <= months.length; i++) {
			if (month == i + 1) {	
				monthToPrint = months[i];
			}
		}
		return monthToPrint;
	}
}
