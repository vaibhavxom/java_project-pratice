class AgeException extends RuntimeException 
{
		
	String msg;
	
	AgeException(String msg)
	{
		this.msg=msg;	
	}
	
	public String toString()
	{
		return msg;
	}
	
}

class CustomException
{
	static void checkAge(int age)throws AgeException					//to
	{
		if(age<18 || age >60)
		{	
			
			throw new AgeException(age +" Invalid Age ");		//to throw exception manually
		}
		System.out.println("age is Accepted ");
	}
	public static void main(String []args)
	{
		int age;
	
		try
		{
		age=Integer.parseInt(args[0]);
		checkAge(age);
		}
		catch(AgeException ex)
		{	
		System.out.println(ex);	
		}
		catch(NumberFormatException ex)
		{ System.out.println("invaled input");	}
		System.out.println("hello");
		
	
	}	
}