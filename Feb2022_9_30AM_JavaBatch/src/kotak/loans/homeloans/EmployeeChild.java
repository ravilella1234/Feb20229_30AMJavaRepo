package kotak.loans.homeloans;

public class EmployeeChild extends Employee
{
	String city;

	public EmployeeChild(String city) 
	{
		//super();
		super(1745,"ravi",23.34f);
		this.city = city;
		
		System.out.println(this.city);
	}
	
	
	public static void main(String[] args) 
	{
		EmployeeChild ec = new EmployeeChild("hyderabad");
	}

}
