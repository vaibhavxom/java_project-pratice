//  runtime polymorphism
overrriding
class Student 
{
	
	int rno;
	String sname;
	
	void print()
	{
	System.out.println(" roll no = "+ rno);
	System.out.println(" name = "+ sname);
	}

}

class Address extends Student
{
	
	String saddress;
	Address(int rno, String sname,String saddress )
	
	{
			super.rno = rno;
			super.sname= sname;
			this.saddress= saddress;
	}
	
	void  print()
	{
		System.out.println(" roll no = "+ rno);
		System.out.println(" name = "+ sname);
		System.out.println(" address = "+ saddress);
	}

}
class DemoOverriding
{

public static void main(String [ ] args)
	{
	Student s1= new Address(17,"bae","Latur");
	s1.print();
	
	}
}