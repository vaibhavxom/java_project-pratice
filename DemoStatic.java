class DemoStatic {
	

	static int count;
	
	static 			// static  first block  
	{
		count++;

	}

	DemoStatic()		// costructor block at last 

	{
		
		System.out.println(" Inside constructor" );
	}
	
	static void print()
	{
		count ++;
		System.out.println(" Count = " + count);

	}

	static				// second static block to be exicuted 
 	{

		count ++;
		print();		// calling main()

 	}


	{							//instance block
		
		System.out.println(" Instance block" );
	}



	public static void main(String args[])
	{
	
 	
		System.out.println(" inside main()" );	 // last print inside main
		DemoStatic d1 = new DemoStatic();
		DemoStatic d2 = new DemoStatic();
	}

	

}