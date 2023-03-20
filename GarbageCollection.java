class Demo
{
	int x = 10;
}
class GarbageCollection
{
	
	public static void main(String [] args)
	{
	
		Demo d1 =new Demo();
		Demo d2 = new Demo();
		d1 = null;
		System.gc();		//GarbageCollectore
		
		
	}
	
	protected void finalize()
	{
	
	System.out.println("Object Destroyed");


	}

}