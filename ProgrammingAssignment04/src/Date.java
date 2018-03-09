/*
 * Programming Assignment 4
 */
public class Date {
	
	private int year;
	private int month;
	private int day;
	
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
	public Date(int year, int month, int day) {
		if (day <= 0 || day > 31) {
			String s = "Day cannot be less than or equal to 0 or greater than 31.";
            throw new IllegalArgumentException(s);
        } else if(month <= 0 || month > 12) {
        	String s = "Month cannot be less than or equal to 0 or greater than 12.";
        	throw new IllegalArgumentException(s);
        }
		this.year = 1970;
		this.month = 1;
		this.day = 1;
	}
	*/

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
	 * Moves this Date object forward in time ********
	 * by the given number of days.
	 */
	public void addDays(int days) {

		Date date1 = new Date(year, month, day);
		int monthInDays = date1.daysInMonth(month);
		int totalDays = date1.getDay() + days;
		
		if(totalDays > monthInDays) {
			month++;
		}
		
		
		
		
		

		
	}
	
	/*
	 * Moves this Date object forward in time by ********
	 * the given number of 7-day weeks.
	 */
	public void addWeeks(int weeks) {
		
	}
	
	/*
	 * Returns the number of days that this Date must be ********
	 * adjusted to make it equal to the given other Date.
	 */
	public int daysTo(Date other) {
		return day;
	}
	
	/*
	 * Returns true if the year of this date is a ********
	 * leap year.
	 */
	public boolean isLeapYear() {
		return ((year %4 == 0) && (year % 100 !=0) || (year % 400 == 0));
	}
	
	/*
	 * Returns the long date string format of the given Date.
	 */
	public String longDate() {
		return "" + stringInMonth(month) + " " + day + ", " + year;
	}

	
	/*
	 * Returns a String representation of this date in 
	 * year/month/day order.
	 */
	public String toString() {
		return "" + year + "/" + month + "/" + day;
	}
	
	/*
	 * Helper method that gets the total days in a month.
	 */
	public int daysInMonth(int month) {
		if(month == 1) {
			return 31;
		}else if(month == 3) {
			return 31;
		}else if(month == 4) {
			return 30;
		}else if (month == 5) {
			return 31;
		}else if (month == 6) {
			return 30;
		}else if (month == 7) {
			return 31;
		}else if (month == 8) {
			return 31;
		}else if (month == 9) {
			return 30;
		}else if (month == 10) {
			return 31;
		}else if (month == 11) {
			return 30;
		}else if (month == 12) {
			return 31;
		}else {
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
