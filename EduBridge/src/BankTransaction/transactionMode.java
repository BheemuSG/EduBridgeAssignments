package BankTransaction;

public class transactionMode 
{
	private int balance=10000; //initial balance
	public void mode(String transaction, int amount)
	{
		if(transaction.equals("deposit"))
		{
			balance=balance+amount;
			System.out.println("Your account cridited by "+amount+" and total balance is "+balance);
		}
		else if(transaction.equals("withdrawal"))
		{
			if(balance>=amount)
			{
				balance=balance-amount;
				System.out.println("Your account debited by "+amount+" and total balance is "+balance);
			}
			else
				System.out.println("Your account have insufficient balance");
		}
		else if(transaction.equals("balance"))
		{
			System.out.println("Your balance amount is: "+balance);
		}
		else
			System.out.println("Invalid transaction mode, please enter correct mode of transaction");
	}
}
