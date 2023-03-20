class StringBufferTest
{

public static void main(String [] args)
	{
	
	StringBuffer sb1 = new StringBuffer("Cocsit");	
	
	sb1.append("  Latur"); 		//simmilar to concate
	
	System.out.println(sb1);

	sb1.insert(6," Collage");		//insert between
	
	System.out.println(sb1);

	sb1.delete(6,14);
	
	System.out.println(sb1);
	
	sb1.replace(8,13,"Pune");	// str indx,end indx,"str" to replace

	System.out.println(sb1);
	
	sb1.deleteCharAt(3);		// delete char at indx
	
	System.out.println(sb1);

	sb1.reverse();        //to rev string 
	System.out.println(sb1);
	}
}