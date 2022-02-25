package kotak.loans.homeloans;

import java.util.ArrayList;

public class WapperClassDemo 
{

	public static void main(String[] args) 
	{
		/*
		   byte		--->	Byte
		   short	--->	Short
		   int		--->	Integer
		   long		--->	Long
		   float	--->	Float
		   double	--->	Double
		   char		--->	Character
		   boolean	--->	Boolean
		 */
		
		int x  =10;
		System.out.println(x);
		
		//Integer y = 20;
		//Integer y = x; // autoboxing
		Integer y = Integer.valueOf(x);
		System.out.println(y);
		
		ArrayList<Float> obj = new ArrayList<Float>();
		obj.add(10.34f);
		obj.add(202.3f);
		
	}

}
