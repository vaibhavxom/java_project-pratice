import java.util.Scanner; 

class Account
{
int balance ;
Account()
	{
		balance =  500;
	}

Account( int bal)
	{
		balance = bal;
	}

void deposit(int amt)
	{

		balance += amt;

	}

void withdraw(int amt)	
	{

		int minbalance =500;

			if(balance > minbalance && balance > amt)
			
				{


					balance -=amt;
					System.out.println(" Amount withdrawn");
				}
	
			else
			{
					System.out.println(" Low Balance");
			}

	}

int getBalance()
	{

	return balance;
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
			System.out.println("enter amount  " );

			ac1.withdraw(sc.nextInt());

			System.out.println(" Balance = " + ac1.getBalance());

		}
}