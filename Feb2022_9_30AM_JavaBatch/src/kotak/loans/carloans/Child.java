package kotak.loans.carloans;


abstract class Parent
{
	public Number workhard()
	{
		System.out.println("Parent : wake-up early, goto college");
		return 0;
	}
	
	public void care()
	{
		System.out.println("Parent : atmost care...");
	}
}

public class Child extends Parent
{
	public Integer workhard()
	{
		System.out.println("child : wake-up anytime, goto movie");
		return 0;
	}
	
	public void love()
	{
		System.out.println("Child : iam in love....");
	}

	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.workhard();
		obj.care();
		obj.love();
	}


}
