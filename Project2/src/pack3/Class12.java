package pack3;

import pack1.Class1;

public class Class12 extends Class1
{

	public Class12(int a, int b) 
	{
		super(a, b);
	}

	public static void main(String[] args) 
	{
		Class12 obj = new Class12(1,2);
		obj.add();
		obj.sub();
	}

}
