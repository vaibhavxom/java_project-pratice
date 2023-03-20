class DemoException
{

public static void main(String [] args)
	{
		int x ;
		int y ;
		int z = 0;
	
		
	try
	{	
		x= Integer.parseInt(args[0]);
		y= Integer.parseInt(args[1]);		// when entered Char
		z =x/y;					//when enterd 0
	}
	catch(NumberFormatException ex) 		// if char
	{
		System.out.println("enter integer value/ invalid input");
	}	
	catch(ArithmeticException ex)			// if enterd 0
	{
		System.out.println("can't divide by zero");
	}
	catch(ArrayIndexOutOfBoundsException ex)		// if no value input
	{
		System.out.println("enter two numbers");
	}
	finally 
	{
		System.out.println("it will execute");
	}
		System.out.println("z =" + z);
	
	}
}