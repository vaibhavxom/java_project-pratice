// polymorphism
class Addition
{
	
	void add( int x,int y)
	{	
	
		System.out.println("sum = " +(x+y));
	
	}

	void add(int x,int y,int z)			//changing number of parameters
	{
		System.out.println("sum = " +(x+y+z));

	}
	
	void add(double x,double y)		//changing type of parameters
	{
		System.out.println("sum = " +(x+y));

	}

}
	
public class DemoOverloading
{

	public static void main(String [ ] args)
	{
	 Addition obj = new Addition();
	
	obj.add(10,20);
	obj.add(1.5,4.5);
	obj.add(1,2,3);
	main();
	}
	
	public static void main()
	{
	System.out.println("is my main methord");
	}

}