package kotak.loans.homeloans;

public class TypeCastingDemo 
{

	public static void main(String[] args) 
	{
		// byte-1, short-2, int-4, long-8, float-4, double-8, char-2, boolean
		
		
		// 1-liter Bottle   --->  500 ml     ---> There is no risk   --> widening
		// 1-liter Bottle   --->  1.5 Liter  ---> There is a risk (overflow)    ---> Narrowing
		
		
		// 1) Type casting between two primitive variables
		
		
		//Type casting from least type to Highest --> No data loss is there
		int x  = 10;
		System.out.println(x);
		
		double y = x;
		System.out.println(y);
		
		//Type casting from Highest type to least ---> In this case some data loss is there
		double p = 10.75;
		System.out.println(p);
		
		int q = (int) p;
		System.out.println(q);
		
		//
		int a = 97;
		System.out.println(a);
		char b = (char) a;
		System.out.println(b);
		
		
		// 2.) Type casting from primitive variables to Wrapper Class type
		
		/*
		 	byte	-	Byte
		 	short	-	Short
		 	int		-	Integer
		 	long	-	Long
		 	float	-	Float
		 	double	-	Double
		 	char	-	Character
		 	boolean	-	Boolean
		 */
		
		int a1 = 101;
		System.out.println(a1);
		//Integer a2 = a1;
		Integer a2 = Integer.valueOf(a1);  // AutoBoxing
		System.out.println(a2);
		
		
		float b1 = 12.34f;
		System.out.println(b1);
		
		
		Float b2 = Float.valueOf(b1);
		System.out.println(b2);
		
		
		// 3.) Type casting from One Wrapper variables to  another Wrapper Class type
		
		System.out.println("---------------------------------");
		
		
		String s1 = "415";
		String s2 = "485";
		
		System.out.println(s1+s2);
		
		int p1 = Integer.parseInt(s1);
		int p2 = Integer.parseInt(s2);
		
		System.out.println(p1+p2);
		
		float f1 = Float.parseFloat(s1);
		float f2 = Float.parseFloat(s2);
		
		System.out.println(f1+f2);
		
	
	}
}
