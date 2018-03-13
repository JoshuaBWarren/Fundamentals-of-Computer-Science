
public class StudentEmployee extends BCEmployee{
	
	private String name;
	private double hourlyPay;
	
	public StudentEmployee() {
		
	}

	public StudentEmployee(String name, double payRate) {
		name = this.name;
		payRate = this.hourlyPay;
	}
	
	public String getName() {
		return super.getName();
	}
	
	public double getHourlyPay() {
		return super.getHourlyPay();
	}
	
	public void setName(String name) {
		super.setName(this.getName());
	}
	
	public void setHourlyPay(double rate) {
		super.setHourlyPay(rate);
	}
	
	public String toString() {
		return "Student " + super.toString();
	}
	

	public void volunteer() {
		super.setHourlyPay(0);
	}
}
