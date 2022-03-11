package kotak.loans.homeloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = "ravikanth";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.hashCode());
		System.out.println(s1.indexOf('v'));
		System.out.println(s1.charAt(2));
		System.out.println(s1.startsWith("ravi"));
		System.out.println(s1.endsWith("nth"));
		
		
		String s2 = new String("lella");
		System.out.println(s2);
		
		//s1 = s1+s2;
		s1 = s1.concat(s2);
		System.out.println(s1);
		
		String s3 = "lella";
		String s4 = "ravikanth";
		System.out.println(s3.equals(s4));
		
		String s5 = "ravikanth";
		System.out.println(s4.equals(s5));
		
		String s6 = "Ravikanth";
		System.out.println(s4.equals(s6));
		System.out.println(s4.equalsIgnoreCase(s6));
		
		String s7 = "Ravi";
		System.out.println(s4.contains(s7));
			
		String s8 = "ravikanth";
		System.out.println(s8);
		System.out.println(s8.toUpperCase());
		System.out.println(s8.toLowerCase());
		
		String s9 = " Ravikanth";
		System.out.println(s9);
		System.out.println(s4.equals(s9));
		System.out.println(s4.equals(s9.trim()));
		System.out.println(s4.equalsIgnoreCase(s9.trim()));
		System.out.println(s4.equals(s9.trim().toLowerCase()));
		
		System.out.println(s4);
		System.out.println(s4.substring(2, 7));
		
		System.out.println(s4);
		System.out.println(s4.replace('r', 'k'));
		
		
		String s10 = "ravi kanth lella" ;
		System.out.println(s10);
		String[] str = s10.split(" ");
		
		for(String s:str)
		{
			System.out.println(s);
		}
		
		
	}

}
