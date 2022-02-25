package kotak.loans.homeloans;

public class MethodOverLoading 
{

	/*
	 * public void m1(int a) { System.out.println(a); }
	 */
	
	/*
	 * public void m1(float b) { System.out.println(b); }
	 */
	
	public void m1(String b)
	{
		System.out.println(b);
	}
	
	/*
	 * public void m1(Integer i) { System.out.println(i); }
	 */
	
	/*
	 * public void m1(Number i) { System.out.println(i); }
	 */
	
	public void m1(Object i)
	{
		System.out.println(i);
	}
	
		
	public static void main(String[] args) 
	{
		MethodOverLoading obj = new MethodOverLoading();
		obj.m1(100);
		obj.m1(12.34f);
		obj.m1("ravi");
		obj.m1(1000);
		obj.m1(23.45f);
		obj.m1("sai");
	}

}
