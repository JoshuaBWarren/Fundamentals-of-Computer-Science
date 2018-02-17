import java.awt.Font;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * Joshua Warren, due Febuary 16, CS-210
 * Programming Assignment 2
 * Should also be fun.
 */

public class DayGrid {

	public static void main (String[] args) {
		
		DrawingPanel panel = new DrawingPanel(700, 700);
		Graphics g = panel.getGraphics();
		
		g.setFont(new Font("Monospaced", Font.PLAIN, 15));
		g.drawString(" Sun  Mon  Tues  Wed  Thurs  Fri  Sat", 40, 40);
	
		int month = 11; //12 is the number for December
		int year = 1986;
		showGrid(g, month, year);
	}

	// Assignment problem 1:
	
	/*
	 * Must write a method called showGrid(month, year) that produces
	 * the required output of a calendar.
	 * 
	 * int month is a parameter between 1 and 12
	 * int year is a year of the Gregorian calendar
	 * 
	 * method has to work for any month and any year (including leap years)
	 */
	public static void showGrid(Graphics g, int month, int year) {
		
		GregorianCalendar cal = new GregorianCalendar(year, month-1, 1);
		
		// Get the total number of days.
		int totalDays = daysInMonth(month); 
		// Get the first day that starts the month.
		int firstDay = cal.get(Calendar.DAY_OF_WEEK); 

		// Draw the calendar.
		for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= 6; j++) {
			g.drawRect(35, 65, 50 * i, 50 * j);
			}
		}

		// Loop through the days of the week and keep track with currentDay.
		for(int i = 0, currentDay = 1;  currentDay <= totalDays; i++) {
			
			/*
			 * Counters of day position in x and coordinates:
			 * 
			 * plotterX = x-coordinate
			 * plotterY = y-coordinate
			 */
			int plotterX = 50;
			int plotterY = 50;
			
			for (int j = helper01(i, firstDay); (currentDay <= totalDays); j++) {
				
				// Use built-in method to check for leap year.
				// Add one day to the month (Feb) if leap year.
				if(cal.isLeapYear(year)) {
					totalDays = daysInMonth(month) + 1;
				}
						
				// Skip to the next line if we're at the end of the week.
				if(j % 7 == 0) {
					plotterX = plotterX - 350;
					plotterY = plotterY + 50;
				}
				g.setFont(new Font("Monospaced", Font.PLAIN, 25));
				g.drawString(Integer.toString(currentDay), plotterX + 50 * j, plotterY + 50);
				currentDay++;        
		        
		}
	}
}
	
	/*
	 * Overloaded method from Programming Assignment #1.
	 */
	public static void showGrid(int month, int year) {

		GregorianCalendar cal = new GregorianCalendar(year, month-1, 1);
		
		// Get the total number of days.
		int totalDays = daysInMonth(month); 
		// Get the first day that starts the month.
		int firstDay = cal.get(Calendar.DAY_OF_WEEK); 

		// Print out the heading and top row:
		System.out.printf("%5s%7s%7s%7s%7s%7s%7s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
		System.out.println("+------+------+------+------+------+------+------+");
		
		/*
		 * Counters that keep track of the day, week, and 
		 * total days in the calendar being counted.
		 */
		int dayCounter = 0;
		int weekCounter = 1;
		int totalCalendarDays = 0;

		/*
		 *  If the first day is on a Sunday, the top row will be empty and will
		 *  add 7 to totalCalendarDays.  Since the loop will start out at zero,
		 *  we need to create the top row ourselves in this one special case.
		 */
		if(firstDay == 1) {
			System.out.printf("|%6s|%6s|%6s|%6s|%6s|%6s|%6s", "      ","      ","      ","      ","      ","      ","      ");
		}
		
		// Put the first day of the week in the column it belongs in.
		for (int i = 0; i < firstDay - 1; i++) {
			System.out.printf("|%6s", "      ");
			dayCounter++;
		}
		
		// Loop through the days of the week and keep track with currentDay.
		for(int i = 0, currentDay = 1;  currentDay <= totalDays; i++) {
			for (int j = helper01(i, firstDay); (currentDay <= totalDays); j++) {
				
				// Use built-in method to check for leap year.
				// Add one day to the month (Feb) if leap year.
				if(cal.isLeapYear(year)) {
					totalDays = daysInMonth(month) + 1;
				}
				
				// Skip to the next line if we're at the end of the week.
				if(j % 7 == 0) {
					System.out.println("|");
					weekCounter++;
				}
		        System.out.printf("| %3d  ", currentDay);
		        currentDay++;
		        dayCounter++;
		}
			// Close off the empty spaces of the calendar.
			if(weekCounter == 5) {
				totalCalendarDays = 35;
			} else if (weekCounter == 6) {
				totalCalendarDays = 42;
			}
			
			/*
			 * If the day starts on a Sunday, then subtract 7 days from the
			 * totalCalendarDays because days beginning on the 1st create
			 * a new row at the top and adds 7 more calendar days.
			 */
			if(firstDay == 1) {
				totalCalendarDays = totalCalendarDays - 7;
			}
			// Close off the calendar.
			for(int k = 0; k <= totalCalendarDays - dayCounter; k++) {
				System.out.printf("|%6s", "    ");
			}
			
		System.out.println("");
		}
		// Print out the bottom row to complete the calendar:
		System.out.println("+------+------+------+------+------+------+------+");
	}
	
	
	
	// Assignment problem 2: 
	
	/*
	 * Must use a method called daysInMonths.
	 * This is on PracticeIt and is Exercise #4
	 * on page 309 in the book.
	 */
	public static int daysInMonth(int month) {
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
	 * Helper method that determines what column we're starting in
	 * so that we can continue the loop around the calendar.
	 */
	public static int helper01(int init, int day) {
		if(init == 0) {
			return day - 1;
		} else {
			return 0;
		}
	}
	


}
