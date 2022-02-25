package kotak.loans.carloans;

public class B extends A // IsA Relationship
{
	public void m1()
	{
		System.out.println("iam m1 overriden from B");
	}
	
	public void m2()
	{
		System.out.println("iam m2 from B");
	}

	public static void main(String[] args) 
	{
		A a = new A(); // HasA Relationship
		a.m1();
		System.out.println(a.x);
		
		B b = new B();
		b.m2();
		b.m1();
		System.out.println(b.x);
		
		//We can use parent class reference variable to refer/hold child class object.
		
		A obj = new B();
		obj.m1();
		
		//B obj1 = new A();
		
	}

}
