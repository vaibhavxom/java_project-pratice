class StringTest
{

public static final void main(String [] args)
	{
	
	String s1 = "Latur";			//immutable
	String s2 = "Latur";
	
	String s3 = new String("cocsit latur");
	String s4 = new String("Latur");	
	
	
	s1.concat(s2);					//connecting  string
	
	System.out.println(s1.length());			// length of string
	
	System.out.println(s1.concat(s2));		
	
	System.out.println(s1.charAt(4));		//char at index starts from '0'
	
	System.out.println(s1==s2);	// checks string value and is case sencitive
	
	System.out.println(s1.equalsIgnoreCase(s2));       //ignore case

	
	//s3.concat(s4);					//connecting  string
	
	//System.out.println(s3.length());			// length of string
	
	//System.out.println(s3.concat(s4));		
	
	//System.out.println(s3.charAt(2));		//char at index starts from '0'
	
	//System.out.println(s3==s4);	// checks string value and is case sencitive
	
	System.out.println(s1.startsWith("l"));
	
	//System.out.println(s1.endsWith("ur"));
	
	System.out.println(s1.toLowerCase());
	
	System.out.println(s2.toUpperCase());
	
	System.out.println(s4.replace("u ","oo"));
	
	System.out.println(s3.substring(3,6));
	System.out.println(s3.substring(8));
	
	System.out.println(s3.trim());
	
	System.out.println(s3.indexOf("la"));		//first occarance of char
	
	
	
	}
}