package kotak.loans.collections;

public class StudentDB 
{
	int sno;
	String sname;
	
	public StudentDB(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}
	

	@Override
	public String toString() {
		return "StudentDB [sno=" + sno + ", sname=" + sname + "]";
	}
	
	public void display()
	{
		System.out.println("Sno :"+ sno+"-----"+"SName :"+ sname);
	}


	public static void main(String[] args) 
	{
		StudentDB s = new StudentDB(10, "s1");
		//System.out.println(s);
		s.display();
	}

}
