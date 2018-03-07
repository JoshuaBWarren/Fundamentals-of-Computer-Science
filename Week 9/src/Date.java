// User define Class structure
// "data structure"
public class Date {
	
	// Fields
	private int month;
	private int day;
	
	// static allows us to access this data WITHOUT an object
	public static final String[] names = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	public Date(int monthInit, int dayInit) {
		month = monthInit;
		day = dayInit;
	}
	
	// Accessor/Mutator methods (getters/setters)
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	public String toString() {
		return names[month] + " " + day;
	}
	
	
}
