//import java.util.Scanner;

class DemoSwitch
{
	//static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
{
	//System.out.println("enter your choice");
	String code= args[0];  //sc.next();
	
	switch(code)

	{
	
	case "R" : System.out.println("RED");break;
	case "G" : System.out.println("GREEN");break;
	case "B" : System.out.println("BLUE");break;
	case "P" : System.out.println("PINK");break;
	default : System.out.println("invalide code");break;	
	}


}

}