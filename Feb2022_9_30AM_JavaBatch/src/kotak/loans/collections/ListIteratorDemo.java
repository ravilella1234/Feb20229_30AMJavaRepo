package kotak.loans.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("oracle");
		a.add("dell");
		a.add("oaktech");
		a.add("softq");
		
		System.out.println(a);
		ListIterator<String> val = a.listIterator();
		while(val.hasNext())
		{
			String var = val.next();
			if(var.equals("oracle"))
				val.set("durgasoft");
			else
				val.remove();
		}
		System.out.println(a);
	}

}
