class DemoEnhancedForLoop
{
	
	public static void main(String args[])
	{
	
		int num[];
		num = new int[5];
		
		
		for(int i = 0;i<num.length;i++)
		{
			num[i] = Integer.parseInt(args[i]);
			
		}
		
		for(int i = 0;i<num.length;i++)
		{
			if(num[i]%2==0)
			System.out.println(num[i] );
			
		}
		
		for(int n:num)
		{
			if(n%2==0)
			System.out.println(n);
			
		}
		
		
	}

}