package kotak.loans.carloans;

public class KOTAK implements Rbi
{

	public static void main(String[] args) 
	{
		KOTAK k = new KOTAK();
		k.deposit();
		k.withdrawl();
	}

	@Override
	public void withdrawl() {
		System.out.println("iam overriden withdrawl in KOTAK");
	}

	@Override
	public void deposit() {
		System.out.println("iam overriden deposit in KOTAK");
	}

}
