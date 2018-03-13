
public class Client {
	
	public static void main(String[] args) {
		
		
		Date date1 = new Date(1986, 11, 14);
		Date date2 = new Date(2000, 12, 1);
		Date date3 = new Date(2001, 1, 5);
		Date date4 = new Date(2018, 1, 1);
		
		Date date5 = new Date(1582, 10, 15);
		Date date6 = new Date(2016, 1, 28);
		
		System.out.println(date1.toString());
		System.out.println(date2.toString());
		
		
		System.out.println(date2.isLeapYear());
		System.out.println(date3.isLeapYear());
		
		System.out.println(date2.longDate());
		
		System.out.println(date1);
		date1.addDays(5);
		System.out.println(date1);
		date1.addDays(-5);
		System.out.println(date1);
		date4.addDays(50);
		System.out.println(date4);
		
		System.out.println(date6.daysTo(date5));
		
		
		System.out.println(Date.daysTo(date5, date6));
	}

}
