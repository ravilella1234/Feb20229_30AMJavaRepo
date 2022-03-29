package kotak.loans.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapUserDefinedObjects 
{

	public static void main(String[] args) 
	{
		StudentDB s1 = new StudentDB(100, "S1");
		StudentDB s2 = new StudentDB(200, "S2");
		StudentDB s3 = new StudentDB(300, "S3");
		StudentDB s4 = new StudentDB(400, "S4");
		
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s3);
		//System.out.println(s4);
		
		HashMap<Integer, StudentDB> h = new HashMap<Integer, StudentDB>(); 
		h.put(s1.sno, s1);
		h.put(s2.sno, s2);
		h.put(s3.sno, s3);
		h.put(s4.sno, s4);
		
		Set<Entry<Integer, StudentDB>> entries = h.entrySet();
		for(Entry<Integer, StudentDB> e:entries)
		{
			System.out.println(e.getKey());
			StudentDB ee = e.getValue();
			ee.display();
		}
	}

}
