package kotak.loans.homeloans;

public class Calc 
{
	int a,b,result;
	
	public Calc(int a, int b) 
	{
		super();
		this.a = a;
		this.b = b;
	}

	public void add()
	{
		result = a+b;
		System.out.println("Add of A & B is : " +  result);
	}
	
	public void sub()
	{
		result = a-b;
		System.out.println("Sub of A & B is : " +  result);
	}
	
	public static void main(String[] args) 
	{
		Calc obj = new Calc(10,20);
		obj.add();
		obj.sub();
	}

}
