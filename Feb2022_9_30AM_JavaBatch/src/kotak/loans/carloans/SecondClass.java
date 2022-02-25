package kotak.loans.carloans;

public class SecondClass 
{
	//data Properties
	int a=10,b=20,result;
	
	//Behaviours
	public void add()
	{
		result = a+b;
		System.out.println("Add of A & B is :" + result);
	}
	
	public void sub()
	{
		result = a-b;
		System.out.println("Sub of A & B is :" + result);
	}
	
	//Constructors
	
	public static void main(String[] args) 
	{
		System.out.println("Hello....");
		
		int x = 100;
		String cname = "prolifics";
		
		SecondClass obj = new SecondClass();
		obj.add();
		obj.sub();
		
		SecondClass obj1 = new SecondClass();
		obj1.add();
		obj1.sub();
		
	}

}
