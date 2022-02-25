package kotak.loans.carloans;

public interface Rbi 
{
	int x = 100;
	
	public void withdrawl();  // abstract
	public void deposit();
	
	public static void main(String[] args) 
	{
		//Rbi i1 = new Rbi();
		
		Rbi i;
		
		i = new ICICI();
		i.deposit();
		i.withdrawl();
		
		i = new KOTAK();
		i.deposit();
		i.withdrawl();
	}

}
