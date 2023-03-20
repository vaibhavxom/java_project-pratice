// program inheritance
class Employee		//parent_class
{
	int eId ;
	String eName;

	void print()
	{
		System.out.println("emp Id = " + eId);
		System.out.println("emp Name = " + eName);
	}	
	
}	
	
class Manager extends Employee  //child_class  // class_name  extends class_name2
{
	int salary;
	
	Manager(int id,String name, int sal)		// parameter constructor
	{
	eId = id ;
	eName = name;
	salary = sal ;
	}

	void printSalary()
	{	
		print();
		System.out.println("Salary = " + salary);
	}
}

 
	public class DemoInheritance
{
	public static void main(String args[])
	{
			
	Manager emp1 = new Manager(100,"xyz",55000);
	emp1.printSalary();	
	
	//Employee emp2 = new Manager(200,"xyz",54005);
	//emp2.print();
	
	
	}

}