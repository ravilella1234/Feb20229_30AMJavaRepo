package kotak.loans.homeloans;

public class VariableTypes 
{
	//primitive variable
	int x = 100; // instance (or) non-static (or) instance-gloabl
	static String cname = "vmware"; // static (or) static-global
	static VariableTypes obj = new VariableTypes();
	
	public void m1()
	{
		int x = 200; //local variable
		//System.out.println(y);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(VariableTypes.cname);
	}
	
	public static void m2()
	{
		//VariableTypes obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);	
	}
	
	public static void main(String[] args) 
	{
		//non-primitive/ Reference variable
		//VariableTypes obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}

}
