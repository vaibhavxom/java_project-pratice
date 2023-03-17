import java.util.Scanner; 

class Account
{
	int balance ;

	void deposit(int amt)
		{

			balance += amt;

		}

	void withdraw(int amt)	
	{

		}	
}
public class DemoAccount
{
		public static void main(String args[])
		{		
			Scanner sc = new Scanner(System.in);
			Account ac1 = new Account();
			ac1.deposit(5000);

			System.out.println(" Balance = " + ac1.getBalance());
			System.out.println(" Balance =  " );

			ac1.withdraw(sc.nextInt());

			System.out.println(" Balance = " + ac1.getBalance());

		}
}