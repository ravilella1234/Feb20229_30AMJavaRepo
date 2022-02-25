package kotak.loans.carloans;

import java.util.Date;

public abstract class A 
{
	public  int x = 10;
	public final static int  y = 20;
	
	
	public abstract void m4();
	
	public void m1()
	{
		System.out.println("iam m1 from A");
	}

	public static void m2()
	{
		System.out.println("iam static method");
	}
	
	static
	{
		System.out.println("iam static block");
	}
	
	static
	{
		Date dt = new Date();
		System.out.println(dt);
	}
	
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		System.out.println(a.x);
		
		A.m2();
	}

}
