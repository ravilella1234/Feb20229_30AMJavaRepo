package kotak.loans.homeloans;

class Student 
{
	int sno;
	String sname;
	
	public Student(int sno, String sname) 
	{
		super();
		this.sno = sno;
		this.sname = sname;
	}
	
	@Override
	public String toString() 
	{
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}

	public static void main(String[] args) 
	{
		Student s = new Student(1744, "sai");
		System.out.println(s);
		System.out.println(s.toString());
		
		//System.out.println(s.sno);
		//System.out.println(s.sname);
		
		
		Student s1 = new Student(100, "s1");
		Student s2 = new Student(200, "s2");
		Student s3 = new Student(300, "s3");
		Student s4 = new Student(400, "s4");
		
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s3);
		//System.out.println(s4);
		
		Student[] st = new Student[4];
		st[0]=s1;
		st[1]=s2;
		st[2]=s3;
		st[3]=s4;
		
		for(Student stu:st)
		{
			System.out.println(stu);
		}
	}
	

}
