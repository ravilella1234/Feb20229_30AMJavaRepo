package kotak.loans.homeloans;

import kotak.loans.carloans.A;
import kotak.loans.carloans.B;

public class C extends A
{
	public void m1()
	{
		System.out.println("iam m1 overriden from C");
	}
	
	public void m3()
	{
		System.out.println("iam m3 from C");
	}

	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		System.out.println(a.x);
		
		C c = new C();
		c.m3();
		c.m1();
		System.out.println(c.x);
	}

}
