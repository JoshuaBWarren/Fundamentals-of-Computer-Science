
public class Client {
	
	public static void main(String[] args) {
		
		
		Date date1 = new Date(1986, 11, 14);
		Date date2 = new Date(2000, 12, 1);
		Date date3 = new Date(2004, 10, 13);
		
		System.out.println(date1.toString());
		System.out.println(date2.toString());
		
		
		System.out.println(date2.isLeapYear());
		
		
		System.out.println(date2.longDate());

		
	}

}
