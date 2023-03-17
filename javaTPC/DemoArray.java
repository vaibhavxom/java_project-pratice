class DemoArray
{
	
	public static void main(String args[])
	{
	
		int num[];
		num = new int[50];
		
		
		for(int i = 0;i<num.length;i++)
		{
			num[i] = Integer.parseInt(args[i]);
			
		}
		
		for(int i = 0;i<num.length;i++)
		{
			if(num[i]%2==0)
			System.out.println(num[i] );
			
		}
		
		
		
	}

}